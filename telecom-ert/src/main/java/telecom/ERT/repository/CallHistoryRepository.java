package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.CallHistory;

public interface CallHistoryRepository extends JpaRepository<CallHistory, Long> {
}
