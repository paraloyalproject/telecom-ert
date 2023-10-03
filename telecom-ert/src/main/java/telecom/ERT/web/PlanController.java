package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import telecom.ERT.model.Plan; 
import telecom.ERT.repository.PlanRepository;

import java.util.List; 

@Controller
@RequestMapping("/viewplans")
public class PlanController {

    private final PlanRepository planRepository;

    @Autowired
    public PlanController(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    @GetMapping
    public String viewPlans(Model model) {
        List<Plan> plans = planRepository.findAll();
        model.addAttribute("plans", plans);
        return "viewplans";
    }
}