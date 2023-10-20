package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import telecom.ERT.model.PortingPostpaidToPrepaidRequest;
import telecom.ERT.service.PortingPostpaidToPrepaidService;

@Controller
@RequestMapping("postpaidToPrepaid")
public class PortingPostpaidToPrepaidController {

    private final PortingPostpaidToPrepaidService portingService;

    @Autowired
    public PortingPostpaidToPrepaidController(PortingPostpaidToPrepaidService portingService) {
        this.portingService = portingService;
    }

    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("request", new PortingPostpaidToPrepaidRequest());
        return "postpaidToPrepaid";
    }
}