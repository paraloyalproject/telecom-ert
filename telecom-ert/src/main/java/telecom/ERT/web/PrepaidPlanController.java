package telecom.ERT.web;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import telecom.ERT.model.PrepaidPlan;
import telecom.ERT.repository.PrepaidPlanRepository;

@Controller
public class PrepaidPlanController {
    @Autowired
    private PrepaidPlanRepository planRepository;

    @GetMapping("/plans")
    public String getAllPlans(Model model) {
        List<PrepaidPlan> plans = planRepository.findAll();
        model.addAttribute("plans", plans);
        return "plans"; 
    }
    
   
    @PostMapping("/select-plan")
    public String selectPlan(@RequestParam("planId") Long planId, Model model) {
        // Retrieve the selected plan from the database
        PrepaidPlan selectedPlan = planRepository.findById(planId).orElse(null);

        // Pass the selected plan to the next page
        model.addAttribute("selectedPlan", selectedPlan);

        return "selected-plan"; 
        }
    
 

        @PostMapping("/recharge")
        public String recharge(@RequestParam("planId") Long planId, Model model) {
                        return "recharge"; 
        }
    }



   
  





    
