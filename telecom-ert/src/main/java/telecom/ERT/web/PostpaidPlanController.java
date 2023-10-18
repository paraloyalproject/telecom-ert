package telecom.ERT.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import telecom.ERT.model.PostpaidPlan;
import telecom.ERT.repository.PostpaidPlanRepository;

@Controller
public class PostpaidPlanController {
    @Autowired
    private PostpaidPlanRepository postpaidPlanRepository;

    @GetMapping("/postpaid-plans")
    public String listPostpaidPlans(Model model) {
        List<PostpaidPlan> plans = postpaidPlanRepository.findAll();
        model.addAttribute("plans", plans);
        return "postpaid-plans";
    }

    @GetMapping("/select-postpaid-plan/{id}")
    public String selectPostpaidPlan(@PathVariable Long id, Model model) {
        PostpaidPlan selectedPlan = postpaidPlanRepository.findById(id).orElse(null);
        model.addAttribute("plan", selectedPlan);
        return "postpaid-plan-details"; 
    }
}



