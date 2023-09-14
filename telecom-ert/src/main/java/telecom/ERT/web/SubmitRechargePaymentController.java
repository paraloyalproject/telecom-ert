package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import telecom.ERT.model.RechargePayment;
import telecom.ERT.service.RechargePaymentService;
import telecom.ERT.exception.ResourceNotFoundException; // Import the custom exception class

@Controller
@RequestMapping("/submit-recharge")
public class SubmitRechargePaymentController {

    private final RechargePaymentService rechargePaymentService;

    @Autowired
    public SubmitRechargePaymentController(RechargePaymentService rechargePaymentService) {
        this.rechargePaymentService = rechargePaymentService;
    }

    @GetMapping
    public String showRechargePaymentForm(Model model) {
        model.addAttribute("rechargePayment", new RechargePayment());
        return "recharge_payment"; 
    }

    @PostMapping
    public String submitRechargePaymentForm(@ModelAttribute RechargePayment rechargePayment) {
        try {
            rechargePaymentService.save(rechargePayment);
            return "redirect:/";
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new ResourceNotFoundException("Error while saving recharge payment: " + ex.getMessage());
        }
    }
}
