package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import telecom.ERT.model.PortingRequest;
import telecom.ERT.service.PortingRequestService;

@Controller
@RequestMapping("/porting")
public class PortingController {
    @Autowired
    private PortingRequestService portingRequestService;

    @GetMapping("/prepaidToPostpaid")
    public String getPrepaidToPostpaidForm(Model model) {
        model.addAttribute("portingRequest", new PortingRequest());
        return "prepaidToPostpaidForm";
    }

    @PostMapping("/prepaidToPostpaid")
    public String submitPrepaidToPostpaidForm(PortingRequest portingRequest) {
        portingRequestService.savePortingRequest(portingRequest);
        // Redirect to a success page or another appropriate page
        return "redirect:/success";
    }

    @GetMapping("/postpaidToPrepaid")
    public String getPostpaidToPrepaidForm(Model model) {
        model.addAttribute("portingRequest", new PortingRequest());
        return "postpaidToPrepaidForm";
    }

    @PostMapping("/postpaidToPrepaid")
    public String submitPostpaidToPrepaidForm(PortingRequest portingRequest) {
        portingRequestService.savePortingRequest(portingRequest);
        // Redirect to a success page or another appropriate page
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String successPage() {
        return "success";
    }
}
