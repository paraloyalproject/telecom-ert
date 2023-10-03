package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import telecom.ERT.model.EsimConnection;

@Repository
public interface EsimConnectionRepository extends JpaRepository<EsimConnection, Long> {
}
