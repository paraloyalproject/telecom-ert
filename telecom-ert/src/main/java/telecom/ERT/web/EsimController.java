package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/get-esim")
public class EsimController {

    @GetMapping
    public String showEsimForm() {
        try {
            return "get_esim";
        } catch (Exception ex) {
           
            ex.printStackTrace();
            return "error"; 
        }
    }
}
