package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import telecom.ERT.model.PopularPlan;

public interface PopularPlanRepository extends JpaRepository<PopularPlan, Long> {
}

