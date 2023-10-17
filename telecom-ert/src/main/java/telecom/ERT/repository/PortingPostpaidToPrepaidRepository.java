package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.PortingPostpaidToPrepaidRequest;
import telecom.ERT.model.PortingPrepaidToPostpaidRequest;


public interface PortingPostpaidToPrepaidRepository extends JpaRepository<PortingPostpaidToPrepaidRequest, Long> {

	
}

