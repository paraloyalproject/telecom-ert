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

    @GetMapping
    public String myProfile(Model model, Principal principal) {
        try {
            String userEmail = principal.getName();
            User user = userService.findByEmail(userEmail);

            if (user != null) {
                model.addAttribute("user", user);
            }

            return "myprofile";
        } catch (Exception ex) {
            // Handle the exception, you can log it and return an error page or message
            model.addAttribute("errorMessage", "An error occurred while fetching the user profile: " + ex.getMessage());
            return "error"; // Replace "error" with the actual name of your error view
        }
    }

    @GetMapping("/manage_account")
    public String manageAccount(Model model, Principal principal) {
        try {
            String userEmail = principal.getName();
            User user = userService.findByEmail(userEmail);

            if (user != null) {
                model.addAttribute("user", user);
            }

            return "manage_account";
        } catch (Exception ex) {
            // Handle the exception, you can log it and return an error page or message
            model.addAttribute("errorMessage", "An error occurred while managing the account: " + ex.getMessage());
            return "error"; // Replace "error" with the actual name of your error view
        }
    }
}
