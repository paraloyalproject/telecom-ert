package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import telecom.ERT.model.BroadbandConnection;

@Repository
public interface BroadbandConnectionRepository extends JpaRepository<BroadbandConnection, Long> {
    
}