package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class LoginController {

  /*  @GetMapping("/login")
    public String loginPage() {
        return "login"; // The login page template (e.g., login.html)
    }

    @GetMapping("/home")
    public String homePage() {
        return "home"; // The home page template (e.g., home.html)
    }*/

	    @RequestMapping("/loginSuccess")
	    public ModelAndView loginSuccess() {
	        return new ModelAndView(new RedirectView("/home")); // Redirect to the "/home" URL after successful login
	    }
}
