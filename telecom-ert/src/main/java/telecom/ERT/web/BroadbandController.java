package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import telecom.ERT.model.BroadbandConnection;
import telecom.ERT.repository.BroadbandConnectionRepository;

@Controller
@RequestMapping("/get_broadband")
public class BroadbandController {

    @Autowired
    private BroadbandConnectionRepository broadbandConnectionRepository;

    @GetMapping("/create")
    public String createBroadbandForm(Model model) {
        model.addAttribute("connection", new BroadbandConnection());
        return "create_get_broadband";
    }

    @PostMapping("/create")
    public String createBroadband(@ModelAttribute BroadbandConnection connection) {
        broadbandConnectionRepository.save(connection);
        return "redirect:/get_broadband/list";
    }

    @GetMapping("/list")
    public String listBroadbandConnections(Model model) {
        List<BroadbandConnection> allConnections = broadbandConnectionRepository.findAll();
        model.addAttribute("connections", allConnections);
        return "list_get_broadband";
    }

    @GetMapping("/edit/{id}")
    public String editBroadbandForm(@PathVariable Long id, Model model) {
        Optional<BroadbandConnection> foundConnection = broadbandConnectionRepository.findById(id);
        if (foundConnection.isPresent()) {
            model.addAttribute("connection", foundConnection.get());
            return "edit_get_broadband";
        } else {
            return "redirect:/get_broadband/list";
        }
    }

    @PostMapping("/edit/{id}")
    public String editBroadband(@PathVariable Long id, @ModelAttribute BroadbandConnection connection) {
        connection.setId(id);
        broadbandConnectionRepository.save(connection);
        return "redirect:/get_broadband/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteBroadband(@PathVariable Long id) {
        broadbandConnectionRepository.deleteById(id);
        return "redirect:/get_broadband/list";
    }
}