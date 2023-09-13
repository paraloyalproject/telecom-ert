package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import telecom.ERT.model.EsimConnection;

import telecom.ERT.service.EsimConnectionService;

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
        esimConnectionService.saveEsimConnection(esimConnection);
        return "redirect:/"; 
    }
}

