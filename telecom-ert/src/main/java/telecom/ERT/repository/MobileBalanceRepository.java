package telecom.ERT.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import telecom.ERT.model.MobileBalance;

@Repository
public interface MobileBalanceRepository extends JpaRepository<MobileBalance, Long> {
    MobileBalance findByPhoneNumber(String phoneNumber);
}




