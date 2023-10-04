package telecom.ERT.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.CallHistoryEntry;
import telecom.ERT.model.Plan;

public interface CallHistoryEntryRepository extends JpaRepository<CallHistoryEntry, Long> {

	List<CallHistoryEntry> findByMobileNo(String mobileNo);
}
