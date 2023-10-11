package telecom.ERT.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import telecom.ERT.model.CallHistory;
import telecom.ERT.service.CallHistoryService;

@Controller
public class CallHistoryController {
    private final CallHistoryService callHistoryService;

    @Autowired
    public CallHistoryController(CallHistoryService callHistoryService) {
        this.callHistoryService = callHistoryService;
    }

    @GetMapping("/call-history-page")
    public String getCallHistory(Model model) {
        List<CallHistory> callHistoryList = callHistoryService.getAllCallHistory();
        model.addAttribute("callHistoryList", callHistoryList);
        return "call-history-page";
    }

    @PostMapping("/save-call-record")
    public String saveCallRecord(@ModelAttribute CallHistory callHistory) {
        callHistoryService.saveCallRecord(callHistory);
        return "redirect:/call-history-page";
    }
}
