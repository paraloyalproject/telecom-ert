package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import telecom.ERT.model.MonthlyPlan;

public interface MonthlyPlanRepository extends JpaRepository<MonthlyPlan, Long> {
}
