package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import telecom.ERT.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
	
}
