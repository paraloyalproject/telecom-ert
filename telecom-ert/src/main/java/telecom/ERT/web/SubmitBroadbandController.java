package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.dao.DataAccessException; // Import DataAccessException for handling database exceptions

import telecom.ERT.model.BroadbandConnection;
import telecom.ERT.model.ReferenceIdCounter;
import telecom.ERT.repository.BroadbandConnectionRepository;
import telecom.ERT.repository.ReferenceIdCounterRepository;
import telecom.ERT.exception.ResourceNotFoundException; // Import your custom exception

@Controller
@RequestMapping("/submit-broadband")
public class SubmitBroadbandController {
	
    private BroadbandConnectionRepository broadbandconnectionRepository;
    private  ReferenceIdCounterRepository referenceIdCounterRepository;
    @Autowired
    public SubmitBroadbandController(BroadbandConnectionRepository broadbandconnectionRepository, ReferenceIdCounterRepository referenceIdCounterRepository) {
        this.broadbandconnectionRepository = broadbandconnectionRepository;
        this.referenceIdCounterRepository=referenceIdCounterRepository;
    }

    @GetMapping
    public String showBroadbandForm(Model model) {
        model.addAttribute("broadbandconnection", new BroadbandConnection());
        return "submit_broadband";
    }

    @PostMapping
    public String submitBroadbandForm(@ModelAttribute BroadbandConnection broadbandconnection,Model model) {
    	try {
        	 ReferenceIdCounter referenceIdCounter = referenceIdCounterRepository.findById(1L)
                     .orElse(new ReferenceIdCounter(111L, 000L)); // Default to 0 if not found

                 // Generate the next reference ID by incrementing the counter
                 Long nextReferenceId = referenceIdCounter.getCounter() + 1;
                 String referenceId = String.format("%06d", nextReferenceId);

                 referenceIdCounter.setCounter(nextReferenceId);
                 referenceIdCounterRepository.save(referenceIdCounter);

                 broadbandconnection.setReferenceId(referenceId);
            
            broadbandconnectionRepository.save(broadbandconnection);
           String name = broadbandconnection.getName(); // This should give you the user's name
           String mobile= broadbandconnection.getMobile();
    model.addAttribute("referenceId", referenceId);
    model.addAttribute("name", name);
    
    model.addAttribute("mobile" ,mobile);
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
