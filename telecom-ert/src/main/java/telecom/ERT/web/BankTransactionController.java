package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import telecom.ERT.model.BankTransaction;
import telecom.ERT.model.Payment;
import telecom.ERT.repository.PaymentRepository;
import telecom.ERT.service.BankTransactionService;

import java.util.List;

@Controller
public class BankTransactionController {
    private final PaymentRepository paymentRepository; // Inject the PaymentRepository
    private final BankTransactionService bankTransactionService;

    @Autowired
    public BankTransactionController(BankTransactionService bankTransactionService, PaymentRepository paymentRepository) {
        this.bankTransactionService = bankTransactionService;
        this.paymentRepository = paymentRepository;
    }

    @GetMapping("/bank-transactions")
    public String showBankTransactions(Model model) {
        List<Payment> paymentList = paymentRepository.findAll(); // Fetch payment data
        model.addAttribute("paymentList", paymentList);
        return "bank-transactions";
    }
}
