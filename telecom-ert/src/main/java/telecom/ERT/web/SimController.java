package telecom.ERT.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SimController {

  /*  // Handle GET request to display the form
    @GetMapping("/get_esim/edit/{id}/{simType}/{cardType}")
    public String showForm(Model model) {
        model.addAttribute("simRequest", new SimRequest());
        return "sim-form"; // Return the HTML template for the form
    }

    // Handle POST request to submit the form
    @PostMapping("/get_esim/edit/{id}/{simType}/{cardType}")
    public String submitForm(
        @ModelAttribute("simRequest") SimRequest simRequest,
        @PathVariable String id,
        @PathVariable String simType,
        @PathVariable String cardType) {
        
        // Process the form data and store it in a database (not shown here)
        
        return "thank-you"; // Return a thank-you page or redirect as needed
    }*/
}