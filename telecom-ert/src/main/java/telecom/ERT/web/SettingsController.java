package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SettingsController {

	 @RequestMapping("/settings")
	    public String getBroadbandPage() {
	        try {
	            return "settings";
	        } catch (Exception ex) {

	            ex.printStackTrace();
	            return "error"; 
	        }
	    }
	
}