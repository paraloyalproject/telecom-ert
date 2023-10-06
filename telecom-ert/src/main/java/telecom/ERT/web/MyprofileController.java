package telecom.ERT.web;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import telecom.ERT.model.User;
import telecom.ERT.service.UserService;

@Controller
@RequestMapping("/myprofile")
public class MyprofileController {
    private final UserService userService;

    @Autowired
    public MyprofileController(UserService userService) {
        this.userService = userService;
    }

   
    
    @GetMapping("/manage_account")
    public String manageAccount(Model model, Principal principal) {
        String userEmail = principal.getName();
        User user = userService.findByEmail(userEmail);

        if (user != null) {
            model.addAttribute("user", user);
        }

        return "manage_account"; 
    }
    @GetMapping("/profile")
    public String userProfile(Model model, Principal principal) {
        String userEmail = principal.getName();
        User user = userService.findByEmail(userEmail);

        if (user != null) {
            model.addAttribute("user", user);
        }

        return "profile";
    }

    @GetMapping("/callhistory")
    public String callhistory(Model model, Principal principal) {
        String userEmail = principal.getName();
        User user = userService.findByEmail(userEmail);

        if (user != null) {
            model.addAttribute("user", user);
        }

        return "callhistory"; 
    }
    @GetMapping("/banktransaction")
    public String banktransaction(Model model, Principal principal) {
        String userEmail = principal.getName();
        User user = userService.findByEmail(userEmail);

        if (user != null) {
            model.addAttribute("user", user);
        }

        return "banktransaction"; 
    }
    @GetMapping("/aboutus")
    public String aboutus() {
       
        return "aboutus"; 
    }
    @GetMapping("/ourstores")
    public String ourstores() {
       
        return "ourstores"; 
    }
    @GetMapping("/contactus")
    public String contactus() {
       
        return "contactus"; 
    }
  
}