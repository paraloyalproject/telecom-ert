
package telecom.ERT.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import telecom.ERT.model.SimPortingRequest;

import telecom.ERT.repository.SimPortingRequestRepository;


@Service

public class SimPortingService {
    private final SimPortingRequestRepository repository;


    @Autowired
    public SimPortingService(SimPortingRequestRepository repository) {
        this.repository = repository;
    }


    public SimPortingRequest submitSimPortingRequest(SimPortingRequest request) {
       
        return repository.save(request);
    }


    public List<SimPortingRequest> getAllSimPortingRequests() {
        return repository.findAll();
    }


   

}