package telecom.ERT.web;                                      

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import telecom.ERT.model.UserTransaction;
import telecom.ERT.service.BillPaymentService;

import java.io.FileNotFoundException;
import java.util.List;

@Controller
@RequestMapping("/view_bills")
public class BillPaymentController {

    @Autowired
    private BillPaymentService billPaymentService;

    @GetMapping
    public String showBillDetails(Model model) {
        try {
            List<UserTransaction> transactions = billPaymentService.getAllTransactions();
            
            // Check if the list of transactions is empty and throw FileEmptyException if necessary
            if (transactions.isEmpty()) {
                throw new FileNotFoundException("No transactions found.");
            }

            model.addAttribute("transactions", transactions);
            return "bill";
        } catch (FileNotFoundException e) {
      
            return "error"; // You can replace "error" with the actual error view name
        } catch (Exception e) {
         
            return "error"; // You can replace "error" with the actual error view name
        }
    }
}
