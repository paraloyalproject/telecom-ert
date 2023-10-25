package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import telecom.ERT.model.EsimData;

public interface EsimDataRepository extends JpaRepository<EsimData, Long> {
}
