package telecom.ERT.web;
import org.springframework.ui.Model;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import telecom.ERT.model.Payment;
import telecom.ERT.repository.PaymentRepository; // Import the PaymentRepository
import telecom.ERT.service.PaymentService;

@Controller
public class PaymentController {
    private final PaymentService paymentService;
    private final PaymentRepository paymentRepository; // Inject the PaymentRepository

   @Autowired
    public PaymentController(PaymentService paymentService, PaymentRepository paymentRepository) {
        this.paymentService = paymentService;
        this.paymentRepository = paymentRepository;
    }

   @GetMapping("/payment-form")
    public String showPaymentForm() {
        return "payment-form"; 
    }

   @GetMapping("/payment-data")
   public String showPaymentData(Model model) {
       List<Payment> paymentList = paymentRepository.findAll();
       model.addAttribute("paymentList", paymentList);
       return "bank-transactions"; // Display payment data on the "bank-transactions" page
   }

   @PostMapping("/processPayment")
   public String processPayment(@ModelAttribute Payment payment, Model model) {
       if (isValidPayment(payment)) {
           Payment savedPayment = paymentService.savePayment(payment);
           String transactionId = savedPayment.getTransactionId();
           String referenceNumber = savedPayment.getReferenceNumber();
           String mobileNumber = savedPayment.getMobileNumber();
           double amount = savedPayment.getAmount();
           String paymentMethod = savedPayment.getPaymentMethod();
           String upiId = savedPayment.getUpiId();
           String bankName = savedPayment.getBankName();

           // Pass the payment details to the view
           model.addAttribute("transactionId", transactionId);
           model.addAttribute("referenceNumber", referenceNumber);
           model.addAttribute("mobileNumber", mobileNumber);
           model.addAttribute("amount", amount);
           model.addAttribute("paymentMethod", paymentMethod);
           model.addAttribute("upiId", upiId);
           model.addAttribute("bankName", bankName); 
           return "payment-success";
       } else {
           return "payment-form";
       }
   }

   private boolean isValidPayment(Payment payment) {
       return payment.getAmount() > 0;
   }
}
