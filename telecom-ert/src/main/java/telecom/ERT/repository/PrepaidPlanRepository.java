package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.PrepaidPlan;

public interface PrepaidPlanRepository extends JpaRepository<PrepaidPlan, Long> {
	
}
