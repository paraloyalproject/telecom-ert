package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import telecom.ERT.model.BroadbandData;

@Repository
public interface BroadbandDataRepository extends JpaRepository<BroadbandData, Long> {
}
