package telecom.ERT.service;

import java.util.List;

import telecom.ERT.model.CallHistory;

public interface CallHistoryEntryService {
    List<CallHistory> getAllCallHistoryEntries();
    
    List<CallHistory> getCallHistoryEntryById(Long Id);
    CallHistory createCallHistoryEntry(CallHistory entry);
    CallHistory updateCallHistoryEntry(CallHistory entry);
    void deleteCallHistoryEntry(Long id);
}
