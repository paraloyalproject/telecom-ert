package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.PortingPrepaidToPostpaidRequest;

public interface PortingPrepaidToPostpaidRepository extends JpaRepository<PortingPrepaidToPostpaidRequest, Long> {
    // You can define custom query methods if needed
}
