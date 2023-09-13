package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BroadbandController {

    @GetMapping("/get-broadband")
    public String getBroadbandPage() {
        return "get_broadband"; 
    }
}