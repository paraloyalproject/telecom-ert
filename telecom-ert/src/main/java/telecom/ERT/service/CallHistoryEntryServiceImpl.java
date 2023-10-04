package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telecom.ERT.model.CallHistoryEntry;
import telecom.ERT.repository.CallHistoryEntryRepository;
import java.util.*;
import java.util.Optional;

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
    public List<CallHistoryEntry> getCallHistoryEntryById(Long Id) {
        Optional<CallHistoryEntry> entry = entryRepository.findById(Id);
        return entry.map(Collections::singletonList).orElse(Collections.emptyList());
    }

 /*   @Override
    public List<CallHistoryEntry> getCallHistoryEntryById(Long Id) {
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
