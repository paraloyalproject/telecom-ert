package telecom.ERT.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import telecom.ERT.model.BroadbandPlan;
import telecom.ERT.repository.BroadbandPlanRepository;

@Controller
public class BroadbandPlanController {
    @Autowired
    private BroadbandPlanRepository broadbandPlanRepository;

    @GetMapping("/broadband-plans")
    public String listBroadbandPlans(Model model) {
        List<BroadbandPlan> plans = broadbandPlanRepository.findAll();
        model.addAttribute("plans", plans);
        return "broadband-plans"; // This is the name of your HTML template
    }
    
    
}
