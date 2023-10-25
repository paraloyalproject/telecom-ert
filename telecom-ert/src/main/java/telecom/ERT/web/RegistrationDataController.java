package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import telecom.ERT.model.RegistrationData;
import telecom.ERT.service.RegistrationDataService;
import java.util.List;

@Controller
public class RegistrationDataController {

    @Autowired
    private RegistrationDataService registrationDataService;

    @GetMapping("/registrationCharts")
    public String showChart(Model model) {
        List<RegistrationData> registrationDataList = registrationDataService.getAllRegistrationData();

        model.addAttribute("registrationDataList", registrationDataList);

        return "registrationCharts";
    }
}
