package telecom.ERT.repository;

import org.apache.catalina.connector.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.SimPortingRequest;

public interface SimPortingRequestRepository extends JpaRepository<SimPortingRequest, Long> {

    // You can add custom query methods if needed
}

