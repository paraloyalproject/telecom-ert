package telecom.ERT.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import telecom.ERT.model.CallHistory;
import telecom.ERT.service.CallHistoryService;

@Controller
public class CallHistoryController {
    private final CallHistoryService callHistoryService;

    @Autowired
    public CallHistoryController(CallHistoryService callHistoryService) {
        this.callHistoryService = callHistoryService;
    }

    @GetMapping("/callhistory")
    public String getCallHistory(Model model) {
        List<CallHistory> callHistoryList = callHistoryService.getAllCallHistory();
        model.addAttribute("callHistoryList", callHistoryList);
        return "callhistory"; // Return the name of your view template (HTML)
    }
}
