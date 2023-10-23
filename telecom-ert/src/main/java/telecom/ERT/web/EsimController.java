package telecom.ERT.web;

import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import telecom.ERT.repository.*;
import telecom.ERT.service.EsimConnectionService;
import telecom.ERT.model.*;
import telecom.ERT.web.*;
import java.util.*;
import telecom.ERT.exception.*;
@Controller
@RequestMapping("/get_esim")
public class EsimController {

	 @GetMapping("/trigger-exception")
	    public String triggerCustomException() {
		 boolean someConditionIsMet = false; 
	        if (someConditionIsMet) {
	            throw new MyCustomException("This is a custom exception message.");
	        }
	        return "Success";
	    }
	
	@GetMapping
    public String getEsimPage() {
        return "get_esim"; 
    }

    @Autowired
    private EsimConnectionRepository esimConnectionRepository;
    
    @GetMapping("/create")
    public String createEsimForm(Model model) {
       
        model.addAttribute("connection", new EsimConnection());
        return "create_get_esim";
    }

    @PostMapping("/create")
    public String createEsim(@ModelAttribute @Valid EsimConnection connection, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Validation failed, return to the form with error messages
            return "create_get_esim";
        }

        try {
            esimConnectionRepository.save(connection);
            return "redirect:/get_esim/list";
        } catch (DataAccessException ex) {
            // Handle database-related exceptions
            ex.printStackTrace();
            return "error_page"; 
        }
    }


    @GetMapping("/list")
    public String listEsimConnections(Model model) {
     
        List<EsimConnection> allConnections = esimConnectionRepository.findAll();
        model.addAttribute("connections", allConnections);
        return "list_get_esim";
    }

    @GetMapping("/edit/{id}")
    public String editEsimForm(@PathVariable Long id, Model model) {
      
        Optional<EsimConnection> foundConnection = esimConnectionRepository.findById(id);
        if (foundConnection.isPresent()) {
            model.addAttribute("connection", foundConnection.get());
            return "edit_get_esim";
        } else {
            return "redirect:/get_esim/list";
        }
    }

    @PostMapping("/edit/{id}")
    public String editEsim(@PathVariable Long id, @ModelAttribute EsimConnection connection) {
        connection.setId(id);
        esimConnectionRepository.save(connection);
        return "redirect:/get_esim/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteEsim(@PathVariable Long id) {
        esimConnectionRepository.deleteById(id);
        return "redirect:/get_esim/list";
    }
}