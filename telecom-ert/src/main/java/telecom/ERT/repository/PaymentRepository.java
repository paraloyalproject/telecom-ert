package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import telecom.ERT.model.*;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentInfo, Long> {
}