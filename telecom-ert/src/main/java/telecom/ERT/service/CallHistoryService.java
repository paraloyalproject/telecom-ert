package telecom.ERT.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telecom.ERT.model.CallHistory;
import telecom.ERT.repository.CallHistoryRepository;

@Service
public class CallHistoryService {
    private final CallHistoryRepository callHistoryRepository;

    @Autowired
    public CallHistoryService(CallHistoryRepository callHistoryRepository) {
        this.callHistoryRepository = callHistoryRepository;
    }

    public List<CallHistory> getAllCallHistory() {
        return callHistoryRepository.findAll();
    }
}
