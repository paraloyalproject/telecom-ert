package telecom.ERT.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Balance")
public class MobileBalanceController {
    
    @GetMapping
    public String MobileBalanceService() {
        return "get_checkbalance";




   }
}