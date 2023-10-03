package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import telecom.ERT.model.BroadbandPlan;
import telecom.ERT.repository.BroadbandPlanRepository;
@Service
public class BroadbandPlanServiceImpl {


    private BroadbandPlanRepository broadbandplanRepository;

    @Autowired
    public BroadbandPlanServiceImpl(BroadbandPlanRepository broadbandplanRepository) {
        this.broadbandplanRepository = broadbandplanRepository;
    }

    public void saveBroadbandConnection(BroadbandPlan broadbandplan) {
    	broadbandplanRepository.save(broadbandplan);
    }
}
