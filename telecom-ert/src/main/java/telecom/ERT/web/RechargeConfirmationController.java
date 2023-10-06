package telecom.ERT.web;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;





@Controller

public class RechargeConfirmationController {

    @GetMapping("/recharge-confirmation")
    public String showRechargeConfirmationPage(
            @RequestParam("package") String selectedPackage,
            Model model) {
        model.addAttribute("selectedPackage", selectedPackage);
        return "rechargeConfirmation";  // Thymeleaf template name
    }

}