package telecom.ERT.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import telecom.ERT.service.ChartData;
import telecom.ERT.service.ChartService;

@Controller
public class ChartController {

    private final ChartService chartService;

    public ChartController(ChartService chartService) {
        this.chartService = chartService;
    }

    @GetMapping("/chart")
    public String showChart(Model model) {
        ChartData chartData = chartService.getChartData();
        model.addAttribute("chartData", chartData);
        return "chart";  // Assuming you have a Thymeleaf template named "chart.html"
    }
}
