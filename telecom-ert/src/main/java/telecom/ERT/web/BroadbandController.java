package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/get_broadband")
public class BroadbandController {

    @GetMapping
    public String getBroadbandPage() {
        try {
            return "get_broadband";
        } catch (Exception ex) {

            ex.printStackTrace();
            return "error"; 
        }
    }
}
