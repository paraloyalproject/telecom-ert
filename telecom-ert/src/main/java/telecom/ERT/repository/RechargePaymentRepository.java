package telecom.ERT.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import telecom.ERT.model.RechargePayment;

@Repository
public interface RechargePaymentRepository extends JpaRepository<RechargePayment, Long> {
	
}

