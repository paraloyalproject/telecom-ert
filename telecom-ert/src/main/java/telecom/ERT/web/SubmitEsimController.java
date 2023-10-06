package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import telecom.ERT.model.EsimConnection;
import telecom.ERT.model.ReferenceIdCounter;
import telecom.ERT.service.EsimConnectionService;
import telecom.ERT.exception.ResourceNotFoundException;

import java.security.Principal;
import javax.transaction.Transactional;
import telecom.ERT.repository.ReferenceIdCounterRepository;

@Controller
@RequestMapping("/submit-esim")
public class SubmitEsimController {
    private EsimConnectionService esimConnectionService;
    private ReferenceIdCounterRepository referenceIdCounterRepository;
    
    @Autowired
    public SubmitEsimController(
        EsimConnectionService esimConnectionService,
        ReferenceIdCounterRepository referenceIdCounterRepository
    ) {
        this.esimConnectionService = esimConnectionService;
        this.referenceIdCounterRepository = referenceIdCounterRepository;
    }

    @GetMapping
    public String showEsimForm(Model model) {
        model.addAttribute("esimConnection", new EsimConnection());
        return "submit_esim";
    }
    
    @Transactional
    @PostMapping
    public String submitEsimForm(
        @ModelAttribute EsimConnection esimConnection,
        @RequestParam("simtype") String simtype,
        Model model,
        Principal principal
    ) {
        try {
            // Retrieve the last generated reference ID from the database
            ReferenceIdCounter referenceIdCounter = referenceIdCounterRepository.findById(1L)
                .orElse(new ReferenceIdCounter(1L, 000L)); // Default to 0 if not found

            // Generate the next reference ID by incrementing the counter
            Long nextReferenceId = referenceIdCounter.getCounter() + 1;
            String referenceId = String.format("%06d", nextReferenceId);

            // Update the entity in the database with the new counter value
            referenceIdCounter.setCounter(nextReferenceId);
            referenceIdCounterRepository.save(referenceIdCounter);

            esimConnection.setReferenceId(referenceId);
            esimConnection.setSimtype(simtype);

            // Save the EsimConnection object
            esimConnectionService.saveEsimConnection(esimConnection);
            
            String name = esimConnection.getName(); // This should give you the user's name
            String mobile= esimConnection.getMobile();
           
            model.addAttribute("referenceId", referenceId);
            model.addAttribute("mobile" ,mobile);
            model.addAttribute("name", name);
           
            return "success-view";
            
        } catch (DataAccessException ex) {
            // Handle database-related exceptions
            ex.printStackTrace();
            throw new ResourceNotFoundException("Error while saving Esim connection: " + ex.getMessage());
        } catch (Exception ex) {
            // Handle other exceptions
            ex.printStackTrace();
            throw new ResourceNotFoundException("An error occurred: " + ex.getMessage());
        }
        
    }
}