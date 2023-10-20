package telecom.ERT.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.Plan;

public interface PlanRepository extends JpaRepository<Plan, Long> {
	List<Plan> findByPlanType(String planType);
}
