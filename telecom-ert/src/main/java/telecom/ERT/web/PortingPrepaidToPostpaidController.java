package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import telecom.ERT.model.PortingPrepaidToPostpaidRequest;
import telecom.ERT.service.PortingPrepaidToPostpaidService;

@Controller
@RequestMapping("prepaidToPostpaid")
public class PortingPrepaidToPostpaidController {

    private final PortingPrepaidToPostpaidService portingService;

    @Autowired
    public PortingPrepaidToPostpaidController(PortingPrepaidToPostpaidService portingService) {
        this.portingService = portingService;
    }

    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("request", new PortingPrepaidToPostpaidRequest());
        return "prepaidToPostpaid";
    }
  
}
