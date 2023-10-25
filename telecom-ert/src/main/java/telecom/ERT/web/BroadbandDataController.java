package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import telecom.ERT.model.BroadbandData;
import telecom.ERT.service.BroadbandDataService;
import java.util.List;

@Controller
public class BroadbandDataController {

    @Autowired
    private BroadbandDataService broadbandDataService;

    @GetMapping("/broadbandChart")
    public String showChart(Model model) {
        List<BroadbandData> broadbandDataList = broadbandDataService.getAllBroadbandData();

        model.addAttribute("broadbandDataList", broadbandDataList);

        return "broadbandChart";
    }
}
