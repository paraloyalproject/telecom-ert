package telecom.ERT.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import telecom.ERT.model.MobilePlan;

import java.util.List;

@Repository
public interface MobilePlanRepository extends JpaRepository<MobilePlan, Long> {
    List<MobilePlan> findByType(String type);
}

