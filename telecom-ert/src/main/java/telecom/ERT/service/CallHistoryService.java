package telecom.ERT.service;

import java.time.LocalDate;
import java.time.LocalTime;
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

    public void saveCallRecord(CallHistory callHistory) {
        callHistory.setCallDate(LocalDate.now());
        callHistory.setStartTime(LocalTime.now());
        callHistory.setEndTime(LocalTime.now());

        callHistoryRepository.save(callHistory);
    }
}
