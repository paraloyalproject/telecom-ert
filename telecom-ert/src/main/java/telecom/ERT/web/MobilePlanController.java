package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import telecom.ERT.model.MobilePlan;
import telecom.ERT.service.MobilePlanService;

import java.util.List;

@Controller
public class MobilePlanController {
    private final MobilePlanService mobilePlanService;

    @Autowired
    public MobilePlanController(MobilePlanService mobilePlanService) {
        this.mobilePlanService = mobilePlanService;
    }
    @GetMapping("/sms")
    public String getMobilePlans(Model model) {
        List<MobilePlan> postpaidPlans = mobilePlanService.getAllPostpaidPlans();
        List<MobilePlan> prepaidPlans = mobilePlanService.getAllPrepaidPlans();

        model.addAttribute("postpaidPlans", postpaidPlans);
        model.addAttribute("prepaidPlans", prepaidPlans);

        return "sms";
    }
}