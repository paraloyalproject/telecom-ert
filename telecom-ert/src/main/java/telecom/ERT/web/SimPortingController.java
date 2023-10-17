package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import telecom.ERT.model.PortingPrepaidToPostpaidRequest;
import telecom.ERT.model.SimPortingRequest;
import telecom.ERT.service.PortingPrepaidToPostpaidService;
import telecom.ERT.service.SimPortingService;

import java.util.List;

@Controller
@RequestMapping("sim-porting")
public class SimPortingController {
	
    private final SimPortingService service;

    @Autowired
    public SimPortingController(SimPortingService service) {
        this.service = service;
    }
    
    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("simportingRequest", new SimPortingRequest());
        return "sim-porting"; // Thymeleaf template name for the Porting page
    }
    
 
}

