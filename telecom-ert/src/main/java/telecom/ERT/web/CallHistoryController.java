package telecom.ERT.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import telecom.ERT.model.*;
import java.util.*;
import telecom.ERT.service.CallHistoryEntryService;

@Controller
public class CallHistoryController {

    private final CallHistoryEntryService callHistoryEntryService;

    @Autowired
    public CallHistoryController(CallHistoryEntryService callHistoryEntryService) {
        this.callHistoryEntryService = callHistoryEntryService;
    }

    @GetMapping("/callhistory")
    public String getCallHistory(Model model) {
        List<CallHistoryEntry> callHistory = callHistoryEntryService.getAllCallHistoryEntries();
        model.addAttribute("callHistory", callHistory);
        return "call-history-view"; // Return the name of the view
    }
}
