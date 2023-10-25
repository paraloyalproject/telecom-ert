package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telecom.ERT.model.MobilePlan;
import telecom.ERT.repository.MobilePlanRepository;

import java.util.List;
import telecom.ERT.repository.*;
@Service
public class MobilePlanServiceImpl implements MobilePlanService {
    private final MobilePlanRepository mobilePlanRepository;

    @Autowired
    public MobilePlanServiceImpl(MobilePlanRepository mobilePlanRepository) {
        this.mobilePlanRepository = mobilePlanRepository;
    }

    @Override
    public List<MobilePlan> getAllPostpaidPlans() {
        // Implement logic to fetch postpaid plans from the repository
        return mobilePlanRepository.findByType("Postpaid");
    }

    @Override
    public List<MobilePlan> getAllPrepaidPlans() {
        // Implement logic to fetch prepaid plans from the repository
        return mobilePlanRepository.findByType("Prepaid");
    }
}