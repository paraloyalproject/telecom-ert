package telecom.ERT.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.PostpaidPlan;

public interface PostpaidPlanRepository extends JpaRepository<PostpaidPlan, Long> {

}
