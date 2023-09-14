package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import telecom.ERT.model.RechargePayment;
import telecom.ERT.repository.BroadbandConnectionRepository;
import telecom.ERT.service.RechargePaymentService;
import telecom.ERT.model.BroadbandConnection;


@Controller
@RequestMapping("/submit-recharge")
public class submitRechargePaymentController {
	


    private final RechargePaymentService rechargePaymentService;

    @Autowired
    public submitRechargePaymentController(RechargePaymentService rechargePaymentService) {
        this.rechargePaymentService = rechargePaymentService;
    }

    @GetMapping
    public String showRechargePaymentForm(Model model) {
        model.addAttribute("rechargePayment", new RechargePayment());
        return "recharge_payment"; // Return the name of the HTML file for the recharge/payment page
    }

    @PostMapping
    public String submitRechargePaymentForm(@ModelAttribute RechargePayment rechargePayment) {
    	
        
        rechargePaymentService.save(rechargePayment);
        return "redirect:/";
    }
}

