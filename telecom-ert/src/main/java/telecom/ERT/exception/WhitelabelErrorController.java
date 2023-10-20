package telecom.ERT.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WhitelabelErrorController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public ModelAndView error() {
        // Create a ModelAndView with your error.html view name
        ModelAndView modelAndView = new ModelAndView("error");
        
        // You can add additional model attributes if needed
        modelAndView.addObject("customAttribute", "Some custom value");

        // Return the ModelAndView
        return modelAndView;
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
