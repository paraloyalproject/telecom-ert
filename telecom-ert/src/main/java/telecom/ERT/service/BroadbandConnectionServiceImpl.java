package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import telecom.ERT.model.BroadbandConnection;
import telecom.ERT.repository.BroadbandConnectionRepository;
@Service
public class BroadbandConnectionServiceImpl {


    private BroadbandConnectionRepository broadbandconnectionRepository;

    @Autowired
    public BroadbandConnectionServiceImpl(BroadbandConnectionRepository broadbandconnectionRepository) {
        this.broadbandconnectionRepository = broadbandconnectionRepository;
    }

    public void saveBroadbandConnection(BroadbandConnection broadbandconnection) {
    	broadbandconnectionRepository.save(broadbandconnection);
    }
}