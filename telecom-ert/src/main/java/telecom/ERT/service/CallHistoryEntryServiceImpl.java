package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telecom.ERT.model.CallHistoryEntry;
import telecom.ERT.repository.CallHistoryEntryRepository;
import java.util.List;

@Service
public class CallHistoryEntryServiceImpl implements CallHistoryEntryService {

    private final CallHistoryEntryRepository entryRepository;

    @Autowired
    public CallHistoryEntryServiceImpl(CallHistoryEntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    @Override
    public List<CallHistoryEntry> getAllCallHistoryEntries() {
        return entryRepository.findAll();
    }

    @Override
    public  List<CallHistoryEntry> getCallHistoryEntryByMobileNo(String mobileNo) {
        List<CallHistoryEntry> entries = entryRepository.findByMobileNo(mobileNo);
        if (!entries.isEmpty()) {
            return (List<CallHistoryEntry>) entries.get(0); // Return the first entry in the list
        } else {
            return null; // Return null if no matching entry is found
        }
    }
 /*   @Override
    public List<CallHistoryEntry> getCallHistoryEntryByMobileNo(String mobileNo) {
        return entryRepository.findByMobileNo(mobileNo);
    }*/



    @Override
    public CallHistoryEntry createCallHistoryEntry(CallHistoryEntry entry) {
        return entryRepository.save(entry);
    }

    @Override
    public CallHistoryEntry updateCallHistoryEntry(CallHistoryEntry entry) {
        return entryRepository.save(entry);
    }

    @Override
    public void deleteCallHistoryEntry(Long id) {
        entryRepository.deleteById(id);
    }


}
