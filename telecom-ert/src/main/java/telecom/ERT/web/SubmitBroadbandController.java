package telecom.ERT.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import telecom.ERT.model.BroadbandConnection;
import telecom.ERT.repository.BroadbandConnectionRepository;

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
    	System.out.println("Name: " + broadbandConnection.getName());
        System.out.println("Mobile: " + broadbandConnection.getMobile());
        broadbandConnectionRepository.save(broadbandConnection);
        return "redirect:/"; 
    }
}





