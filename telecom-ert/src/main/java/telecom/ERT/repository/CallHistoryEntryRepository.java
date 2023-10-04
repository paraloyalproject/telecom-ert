package telecom.ERT.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.CallHistoryEntry;


public interface CallHistoryEntryRepository extends JpaRepository<CallHistoryEntry, Long> {

	
}
