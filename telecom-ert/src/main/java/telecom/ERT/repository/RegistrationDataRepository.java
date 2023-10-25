package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import telecom.ERT.model.RegistrationData;

public interface RegistrationDataRepository extends JpaRepository<RegistrationData, Long> {
}
