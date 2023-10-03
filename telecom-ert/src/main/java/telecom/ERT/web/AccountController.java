package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import telecom.ERT.exception.ResourceNotFoundException;
import telecom.ERT.model.User;
import telecom.ERT.model.UserUpdateDto;
import telecom.ERT.service.UpdateService;
import telecom.ERT.web.dto.UserRegistrationDto;


@Controller
@RequestMapping("api/account")
public class AccountController {

    private UpdateService updateService;

    @Autowired
    public AccountController(UpdateService updateService) {
        this.updateService = updateService;
    }

    @GetMapping("/manage_account")
    public String showAccountManagementForm(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserEmail = authentication.getName();
        User currentUser = updateService.findByEmail(currentUserEmail);

        model.addAttribute("user", currentUser);
        return "account_management"; // Replace with your HTML template name
    }

    @PostMapping("/edit")
    public String saveAccountChanges(UserRegistrationDto user) {
        // Implement this method as per your requirements
        return "redirect:/account/manage?success"; // Redirect to the account management page with a success message
    }

    @PostMapping("/update")
    public String updateUserDetails(@ModelAttribute("user") UserUpdateDto updateDto) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserEmail = authentication.getName();

        try {
            updateService.updateUserDetails(currentUserEmail, updateDto);
            return "redirect:/account/manage?success";
        } catch (ResourceNotFoundException ex) {
            ex.printStackTrace();
            // Handle the exception, e.g., show an error message to the user
            return "redirect:/account/manage?error";
        }
    }
}