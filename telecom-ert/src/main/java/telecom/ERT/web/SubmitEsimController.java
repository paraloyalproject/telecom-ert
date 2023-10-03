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
import telecom.ERT.service.EsimConnectionService;
import telecom.ERT.exception.ResourceNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/submit-esim")
public class SubmitEsimController {

    private EsimConnectionService esimConnectionService;
    
    @Autowired
    public SubmitEsimController(EsimConnectionService esimConnectionService) {
        this.esimConnectionService = esimConnectionService;
    }

    @GetMapping
    public String showEsimForm(Model model) {
        model.addAttribute("esimConnection", new EsimConnection());
        return "submit_esim";
    }
    
    @PostMapping
    public String submitEsimForm(@ModelAttribute EsimConnection esimConnection, @RequestParam("simtype") String simtype) {
        try {
            // Populate the reference ID
        	
            String referenceId = generateNextReferenceId();
            esimConnection.setReferenceId(referenceId);
            esimConnection.setSimtype(simtype);
      // Save the EsimConnection object
            esimConnectionService.saveEsimConnection(esimConnection);
            
            return "redirect:/success"; // Redirect to a success page
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

    // Generate the next reference ID as you mentioned earlier
    private int referenceIdCounter = 0; // Initialize the counter

    private String generateNextReferenceId() {
        
        referenceIdCounter++;
        String formattedReferenceId = String.format("%06d", referenceIdCounter);

        return formattedReferenceId;
    }

}