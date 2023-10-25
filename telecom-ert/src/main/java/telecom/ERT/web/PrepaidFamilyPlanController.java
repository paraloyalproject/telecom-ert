package telecom.ERT.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import telecom.ERT.model.PrepaidFamilyPlan;
import telecom.ERT.repository.PrepaidFamilyPlanRepository;

@Controller
public class PrepaidFamilyPlanController {
    @Autowired
    private PrepaidFamilyPlanRepository prepaidFamilyPlanRepository;

    @GetMapping("/prepaid-family-plans")
    public String listPrepaidFamilyPlans(Model model) {
        List<PrepaidFamilyPlan> plans = prepaidFamilyPlanRepository.findAll();
        model.addAttribute("plans", plans);
        return "prepaid-family-plans";
    }

    @GetMapping("/select-prepaid-family-package/{id}")
    public String selectPrepaidFamilyPackage(@PathVariable Long id, Model model) {
        PrepaidFamilyPlan selectedPlan = prepaidFamilyPlanRepository.findById(id).orElse(null);
        model.addAttribute("plan", selectedPlan);
        return "prepaid-family-plan-details"; 
    }
    

}
