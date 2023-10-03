

package telecom.ERT.web;







import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;




import telecom.ERT.model.UserTransaction;

import telecom.ERT.service.BillPaymentService;




import java.util.List;




@Controller

@RequestMapping("/view_bills")

public class BillPaymentController {






@Autowired




    private BillPaymentService billPaymentService ;




    @GetMapping
    public String showBillDetails(Model model) {
        
        List<UserTransaction> transactions = billPaymentService.getAllTransactions();




        model.addAttribute("transactions", transactions);
    
         
        return "bill";
    }

}