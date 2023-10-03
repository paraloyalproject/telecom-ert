package telecom.ERT.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Balance")
public class MobileBalanceController {

    @GetMapping
    public String mobileBalanceService(@RequestParam(name = "phoneNumber", required = false) String phoneNumber, Model model) {
        try {
            // Check mobile balance logic here
            if (phoneNumber != null) {
            }
            return "get_checkbalance";
        } catch (Exception ex) {
            model.addAttribute("errorMessage", "An error occurred while checking the balance: " + ex.getMessage());
            return "error"; // Replace "error" with the actual name of your error view
        }
    }
}
