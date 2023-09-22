package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import telecom.ERT.model.*;
import telecom.ERT.repository.*;
import telecom.ERT.service.UserService;
import telecom.ERT.web.dto.UserRegistrationDto;
import telecom.ERT.exception.ResourceNotFoundException; // Import the custom exception class
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;
    private UserRepository userRepository;
    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
        try {
            userService.save(registrationDto);
            return "redirect:/registration?success";
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new ResourceNotFoundException("Error while registering user: " + ex.getMessage());
        }
    }
    @GetMapping("/manage")
    public String showAccountManagementForm(Model model) {
    	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    	String currentUseremail = authentication.getName();
    	User currentUser = userRepository.findByEmail( currentUseremail); // Replace 'findByUsername' with the appropriate method for your database schema

        model.addAttribute("user", currentUser);
        return "account_management"; // Replace with the actual HTML template name
    }

    
}
