package telecom.ERT.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import telecom.ERT.model.PrepaidPlan;
import telecom.ERT.repository.PrepaidPlanRepository;

@Controller
public class PrepaidPlanController {
    @Autowired
    private PrepaidPlanRepository prepaidPlanRepository;

    @GetMapping("/prepaid-plans")
    public String listPrepaidPlans(Model model) {
        List<PrepaidPlan> plans = prepaidPlanRepository.findAll();
        model.addAttribute("plans", plans);
        return "prepaid-plans"; 
    }

    @GetMapping("/select-prepaid-package/{id}")
    public String selectPrepaidPackage(@PathVariable Long id, Model model) {
        PrepaidPlan selectedPlan = prepaidPlanRepository.findById(id).orElse(null);
        model.addAttribute("plan", selectedPlan);
        return "prepaid-plan-details"; 
    }
}
    
