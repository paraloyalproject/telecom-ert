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
import telecom.ERT.repository.BroadbandConnectionRepository;
import telecom.ERT.exception.ResourceNotFoundException; // Import your custom exception

@Controller
@RequestMapping("/submit-broadband")
public class SubmitBroadbandController {
	
    private BroadbandConnectionRepository broadbandConnectionRepository;

    @Autowired
    public SubmitBroadbandController(BroadbandConnectionRepository broadbandConnectionRepository) {
        this.broadbandConnectionRepository = broadbandConnectionRepository;
    }

    @GetMapping
    public String showBroadbandForm(Model model) {
        model.addAttribute("broadbandConnection", new BroadbandConnection());
        return "submit_broadband";
    }

    @PostMapping
    public String submitBroadbandForm(@ModelAttribute BroadbandConnection broadbandConnection) {
        try {
            System.out.println("Name: " + broadbandConnection.getName());
            System.out.println("Mobile: " + broadbandConnection.getMobile());
            broadbandConnectionRepository.save(broadbandConnection);
            return "redirect:/";
        } catch (DataAccessException ex) {
            // Handle database-related exceptions
            ex.printStackTrace();
            throw new ResourceNotFoundException("Error while saving broadband connection: " + ex.getMessage());
        } catch (Exception ex) {
            // Handle other exceptions
            ex.printStackTrace();
            throw new ResourceNotFoundException("An error occurred: " + ex.getMessage());
        }
    }
}
