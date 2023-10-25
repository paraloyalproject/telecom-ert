
package telecom.ERT.web;




import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import telecom.ERT.model.Payment;

import telecom.ERT.repository.PaymentRepository;

import telecom.ERT.service.PaymentService;


@Controller

public class PaymentController {
    private final PaymentService paymentService;
    private final PaymentRepository paymentRepository;


    @Autowired
    public PaymentController(PaymentService paymentService, PaymentRepository paymentRepository) {
        this.paymentService = paymentService;
        this.paymentRepository = paymentRepository;
    }


    @GetMapping("/payment-form")
    public String showPaymentForm(Model model) {
        model.addAttribute("payment", new Payment());
        return "payment-form";
    }


    @PostMapping("/processPayment")
    public String processPayment(@ModelAttribute Payment payment, Model model) {
        if (isValidPayment(payment)) {
            Payment savedPayment = paymentService.savePayment(payment);
            // Extract necessary information
            String transactionId = savedPayment.getTransactionId();
            String referenceNumber = savedPayment.getReferenceNumber();
            String mobileNumber = savedPayment.getMobileNumber();
            double amount = savedPayment.getAmount();
            String paymentMethod = savedPayment.getPaymentMethod();
            String upiId = savedPayment.getUpiId();
            String bankName = savedPayment.getBankName();
            String debitCard = savedPayment.getDebitCard();
            String internetBanking = savedPayment.getInternetBanking();


            // Pass the payment details to the view
            model.addAttribute("transactionId", transactionId);
            model.addAttribute("referenceNumber", referenceNumber);
            model.addAttribute("mobileNumber", mobileNumber);
            model.addAttribute("amount", amount);
            model.addAttribute("paymentMethod", paymentMethod);
            model.addAttribute("upiId", upiId);
            model.addAttribute("bankName", bankName);
            model.addAttribute("debitCard", debitCard);
            model.addAttribute("internetBanking", internetBanking);


            return "payment-success";
        } else {
            return "payment-form";
        }
    }


    private boolean isValidPayment(Payment payment) {
        return payment.getAmount() > 0;
    }


}