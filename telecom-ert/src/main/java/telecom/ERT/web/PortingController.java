package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import telecom.ERT.model.PortingRequest;
import telecom.ERT.service.PortingService;

@Controller
@RequestMapping("/porting")
public class PortingController {

    private final PortingService portingService;

    @Autowired
    public PortingController(PortingService portingService) {
        this.portingService = portingService;
    }

    @GetMapping("")
    public String getPortingForm(Model model) {
        model.addAttribute("portingRequest", new PortingRequest());
        return "porting"; 
    }

  
}