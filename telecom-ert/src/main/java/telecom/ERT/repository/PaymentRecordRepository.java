package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.PaymentRecord;





public interface PaymentRecordRepository extends JpaRepository<PaymentRecord, Long> {

}