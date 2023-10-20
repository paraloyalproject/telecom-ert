 package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
 @RequestMapping("/Balance")
 public class MobileBalanceController {
     
     @GetMapping
     public String MobileBalanceService() {
         return "getMobileBalance";


 }
 }