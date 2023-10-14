package telecom.ERT.web;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String page() {
        try {

            return "index";
        } catch (Exception ex) {
            
            ex.printStackTrace();

            return "error"; 
        }
    }

    @GetMapping("/login")
    public String login() {
        try {
            return "login";
        } catch (Exception ex) {
            
            ex.printStackTrace();

            return "error";
        }
    }
    @GetMapping("/home")
    public String home(Principal principal) {
        if (principal != null) {
            // User is authenticated
            return "home";
        } else {
            // Redirect to the login page or handle unauthenticated access
            return "redirect:/login";
        }
    }
    @GetMapping("NewSim/get_esim")
    public String get_esim() {
        try {
            return "get_esim";
        } catch (Exception ex) {
            
            ex.printStackTrace();

            return "error";
        }
    }
    @GetMapping("/get_broadband")
    public String getbroadbandPage() {
        try {
            return "get_broadband";
        } catch (Exception ex) {
            
            ex.printStackTrace();

            return "error";
        }
    }
   
}
