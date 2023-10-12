package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import telecom.ERT.model.BankTransaction;

@Repository
public interface BankTransactionRepository extends JpaRepository<BankTransaction, Long> {
}
