package telecom.ERT.service;

import telecom.ERT.model.MobilePlan;

import java.util.List;

public interface MobilePlanService {
    List<MobilePlan> getAllPostpaidPlans();
    List<MobilePlan> getAllPrepaidPlans();
}
