package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
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
