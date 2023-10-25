package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import telecom.ERT.service.PaymentRecordService;

@Controller
public class PaymentRecordController {

    private final PaymentRecordService paymentRecordService;

    @Autowired
    public PaymentRecordController(PaymentRecordService paymentRecordService) {
        this.paymentRecordService = paymentRecordService;
    }

    // Handle GET request to display the payment form
    @GetMapping("/paybill")
    public String showPaymentForm(Model model) {
        // You can add any necessary model attributes here
        model.addAttribute("mobile", "");
        model.addAttribute("amount", "");
        return "paymentForm"; // This is the name of the HTML template for the form
    }

    // Handle POST request to process the payment
    @PostMapping("/paybill")
    public String processPayment(
            @RequestParam("mobile") String mobile,
            @RequestParam("amount") Double amount) {
        // Save the payment record to the database
        paymentRecordService.savePaymentRecord(mobile, amount);
        return "redirect:/success.html"; // Redirect to a success page
    }
}
