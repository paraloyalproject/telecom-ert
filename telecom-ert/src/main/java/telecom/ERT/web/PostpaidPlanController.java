package telecom.ERT.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import telecom.ERT.model.PostpaidPlan;
import telecom.ERT.repository.PostpaidPlanRepository;

@Controller
public class PostpaidPlanController {
    @Autowired
    private PostpaidPlanRepository planRepository;

    @GetMapping("/postpaidplans")
    public String getAllPostpaidPlans(Model model) {
        List<PostpaidPlan> plans = planRepository.findAll();
        model.addAttribute("plans", plans);
        return "postpaidplans"; // Return the name of the Thymeleaf template
    }
}
