package telecom.ERT.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    
    @PostMapping("/selectedplan")

    public String selectPostpaidPlan(@RequestParam("planId") Long planId, Model model) {

        // Retrieve the selected plan from the repository

        PostpaidPlan selectedPlan = planRepository.findById(planId)

                .orElseThrow(() -> new IllegalArgumentException("Invalid plan ID: " + planId));




        // Add the selected plan to the model

        model.addAttribute("selectedPlan", selectedPlan);




        // Return the new template to display the selected plan details

        return "selectedplan";

   }
}
