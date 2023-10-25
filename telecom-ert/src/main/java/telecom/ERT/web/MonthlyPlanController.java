package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import telecom.ERT.model.MonthlyPlan;
import telecom.ERT.service.MonthlyPlanService;
import java.util.List;
import java.util.Optional;

@Controller
public class MonthlyPlanController {
    @Autowired
    private MonthlyPlanService monthlyPlanService;

    @GetMapping("/monthly-plans")
    public String getMonthlyPlans(Model model) {
        List<MonthlyPlan> monthlyPlans = monthlyPlanService.getAllMonthlyPlans();
        model.addAttribute("monthlyPlans", monthlyPlans);
        return "monthly-plans"; // This should correspond to your Thymeleaf template name
    }

    @GetMapping("/select-monthly-package/{id}")
    public String selectMonthlyPlan(@PathVariable Long id, Model model) {
        Optional<MonthlyPlan> optionalPlan = monthlyPlanService.getMonthlyPlanById(id);
        if (optionalPlan.isPresent()) {
            MonthlyPlan plan = optionalPlan.get();
            model.addAttribute("selectedPlan", plan);
        }
        return "monthly-plan-details"; // This should correspond to your Thymeleaf template name
    }
}
