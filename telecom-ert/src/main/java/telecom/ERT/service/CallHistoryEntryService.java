package telecom.ERT.service;

import java.util.List;

import telecom.ERT.model.CallHistoryEntry;

public interface CallHistoryEntryService {
    List<CallHistoryEntry> getAllCallHistoryEntries();
    
    List<CallHistoryEntry> getCallHistoryEntryById(Long Id);
    CallHistoryEntry createCallHistoryEntry(CallHistoryEntry entry);
    CallHistoryEntry updateCallHistoryEntry(CallHistoryEntry entry);
    void deleteCallHistoryEntry(Long id);
}
