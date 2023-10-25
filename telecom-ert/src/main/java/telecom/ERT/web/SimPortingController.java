
package telecom.ERT.web;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;


import telecom.ERT.model.SimPortingRequest;

import telecom.ERT.service.SimPortingService;


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
        return "sim-porting"; 
    }
    @PostMapping("/submit-porting-request")
    public String submitPortingRequest(@ModelAttribute SimPortingRequest request) {
        service.submitSimPortingRequest(request);
        return "redirect:/sim-porting"; // Redirect to the form page
    }
}