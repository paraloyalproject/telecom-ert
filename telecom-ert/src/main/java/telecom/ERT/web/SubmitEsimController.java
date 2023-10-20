package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import telecom.ERT.model.EsimConnection;
import telecom.ERT.service.EsimConnectionService;
import telecom.ERT.exception.ResourceNotFoundException;

@Controller
@RequestMapping("/submit-esim")
public class SubmitEsimController {

    private EsimConnectionService esimConnectionService;
    
    @Autowired
    public SubmitEsimController(EsimConnectionService esimConnectionService) {
        this.esimConnectionService = esimConnectionService;
    }

    @GetMapping
    public String showEsimForm(Model model) {
        model.addAttribute("esimConnection", new EsimConnection());
        return "submit_esim";
    }
    
    @PostMapping
    public String submitEsimForm(@ModelAttribute EsimConnection esimConnection) {
        try {
            esimConnectionService.saveEsimConnection(esimConnection);
            return "redirect:/";
        } catch (DataAccessException ex) {
            // Handle database-related exceptions
            ex.printStackTrace();
            throw new ResourceNotFoundException("Error while saving broadband connection: " + ex.getMessage());
        } catch (Exception ex) {
            // Handle other exceptions
            ex.printStackTrace();
            throw new ResourceNotFoundException("An error occurred: " + ex.getMessage());
        }
    }
}
 