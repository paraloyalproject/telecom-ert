package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recharge-payment")
public class RechargePaymentController {

    @GetMapping
    public String showRechargePage() {
        try {

            return "recharge"; 
        } catch (Exception ex) {
            ex.printStackTrace();
            return "error"; 
        }
    }
}
