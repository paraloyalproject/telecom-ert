package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.dao.DataAccessException; // Import DataAccessException for handling database exceptions
import telecom.ERT.model.BroadbandPlan;
import telecom.ERT.repository.BroadbandPlanRepository;
import telecom.ERT.exception.ResourceNotFoundException; // Import your custom exception

@Controller
@RequestMapping("/submit-broadbandplan")
public class SubmitBroadbandPlanController {
	
    private BroadbandPlanRepository broadbandplanRepository;

    @Autowired
    public SubmitBroadbandPlanController(BroadbandPlanRepository broadbandplanRepository) {
        this.broadbandplanRepository = broadbandplanRepository;
    }

    @GetMapping
    public String showBroadbandForm(Model model) {
        model.addAttribute("broadbandPlan", new BroadbandPlan());
        return "submit_broadbandplan";
    }

    @PostMapping
    public String submitBroadbandForm(@ModelAttribute BroadbandPlan broadbandPlan) {
        try {
            System.out.println("Name: " + broadbandPlan.getName());
           // System.out.println("Mobile: " + broadbandPlan.getMobile());
            broadbandplanRepository.save(broadbandPlan);
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
