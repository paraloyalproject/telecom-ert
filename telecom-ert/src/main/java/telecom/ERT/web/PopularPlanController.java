package telecom.ERT.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import telecom.ERT.model.PopularPlan;
import telecom.ERT.repository.PopularPlanRepository;

@Controller
public class PopularPlanController {
    @Autowired
    private PopularPlanRepository popularPlanRepository;

    @GetMapping("/popular-plans")
    public String listPopularPlans(Model model) {
        List<PopularPlan> plans = popularPlanRepository.findAll();
        model.addAttribute("plans", plans);
        return "popular-plans";
    }

    @GetMapping("/select-popular-package/{id}")
    public String selectPopularPackage(@PathVariable Long id, Model model) {
        PopularPlan selectedPlan = popularPlanRepository.findById(id).orElse(null);
        model.addAttribute("plan", selectedPlan);
        return "popular-plan-details";
    }
}


