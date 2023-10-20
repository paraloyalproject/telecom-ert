package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telecom.ERT.model.PortingRequest;
import telecom.ERT.repository.PortingRequestRepository;

@Service
public  class PortingServiceImpl implements PortingService {

    private final PortingRequestRepository portingRequestRepository;

    @Autowired
    public PortingServiceImpl(PortingRequestRepository portingRequestRepository) {
        this.portingRequestRepository = portingRequestRepository;
    }
    
  

    @Override
    public void portPrepaidToPostpaid(PortingRequest request) {
       
        request.setType("Prepaid to Postpaid");
        portingRequestRepository.save(request);
    }

    @Override
    public void portPostpaidToPrepaid(PortingRequest request) {
       
        request.setType("Postpaid to Prepaid");
        portingRequestRepository.save(request); 
    }
   
}