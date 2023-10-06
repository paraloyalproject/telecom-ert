package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

