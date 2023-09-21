package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import telecom.ERT.model.UserTransaction;
import telecom.ERT.service.BillPaymentService;

import java.util.List;

@Controller
public class BillPaymentController {

    @Autowired
    private BillPaymentService billPaymentService;

    @GetMapping("/bill")
    public String showBillDetails(Model model) {
        // Fetch data from the database
        List<UserTransaction> transactions = billPaymentService.getAllTransactions();

        // Add transactions to the model
        model.addAttribute("transactions", transactions);

        // Return the HTML template
        return "bill";
    }
}
