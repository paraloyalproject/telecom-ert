package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import telecom.ERT.model.*;
import telecom.ERT.service.PaymentService;

@Controller
public class PaymentRController {
    private final PaymentService paymentService;

   @Autowired
    public PaymentRController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

   @GetMapping("/payment-form")
    public String showPaymentForm() {
        return "payment-form"; 
    }

   @PostMapping("/processPayment")
    public String processPayment(@ModelAttribute PaymentInfo payment) {
       
        if (isValidPayment(payment)) {
            paymentService.savePayment(payment);
            return "payment-success"; 
        } else {
            return "payment-form"; 
        }
    }

   private boolean isValidPayment(PaymentInfo payment) {
       
        return true; 
    }
   
}