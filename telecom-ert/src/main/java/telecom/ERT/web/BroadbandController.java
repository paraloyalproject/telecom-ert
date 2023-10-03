package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import telecom.ERT.model.BroadbandConnection;
import telecom.ERT.repository.BroadbandConnectionRepository;

import java.util.List;
import java.util.Optional;

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
        try {
            broadbandConnectionRepository.save(connection);
            return "redirect:/get_broadband/list";
        } catch (Exception e) {
            // Handle the exception, you can add appropriate error messages to the model or redirect to an error page.
            return "error"; // Replace "error" with the actual error view name
        }
    }

    @GetMapping("/list")
    public String listBroadbandConnections(Model model) {
        try {
            List<BroadbandConnection> allConnections = broadbandConnectionRepository.findAll();
            model.addAttribute("connections", allConnections);
            return "list_get_broadband";
        } catch (Exception e) {
            // Handle the exception, you can add appropriate error messages to the model or redirect to an error page.
            return "error"; // Replace "error" with the actual error view name
        }
    }

    @GetMapping("/edit/{id}")
    public String editBroadbandForm(@PathVariable Long id, Model model) {
        try {
            Optional<BroadbandConnection> foundConnection = broadbandConnectionRepository.findById(id);
            if (foundConnection.isPresent()) {
                model.addAttribute("connection", foundConnection.get());
                return "edit_get_broadband";
            } else {
                return "redirect:/get_broadband/list";
            }
        } catch (Exception e) {
            // Handle the exception, you can add appropriate error messages to the model or redirect to an error page.
            return "error"; // Replace "error" with the actual error view name
        }
    }

    @PostMapping("/edit/{id}")
    public String editBroadband(@PathVariable Long id, @ModelAttribute BroadbandConnection connection) {
        try {
            connection.setId(id);
            broadbandConnectionRepository.save(connection);
            return "redirect:/get_broadband/list";
        } catch (Exception e) {
            // Handle the exception, you can add appropriate error messages to the model or redirect to an error page.
            return "error"; // Replace "error" with the actual error view name
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteBroadband(@PathVariable Long id) {
        try {
            broadbandConnectionRepository.deleteById(id);
            return "redirect:/get_broadband/list";
        } catch (Exception e) {
            // Handle the exception, you can add appropriate error messages to the model or redirect to an error page.
            return "error"; // Replace "error" with the actual error view name
        }
    }
}
