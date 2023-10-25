package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telecom.ERT.model.MonthlyPlan;
import telecom.ERT.repository.MonthlyPlanRepository;
import java.util.List;
import java.util.Optional;

@Service
public class MonthlyPlanService {
    @Autowired
    private MonthlyPlanRepository monthlyPlanRepository;

    public List<MonthlyPlan> getAllMonthlyPlans() {
        return monthlyPlanRepository.findAll();
    }

    public Optional<MonthlyPlan> getMonthlyPlanById(Long id) {
        return monthlyPlanRepository.findById(id);
    }
}
