package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telecom.ERT.model.PortingRequest;
import telecom.ERT.repository.PortingRequestRepository;

@Service
public class PortingRequestService {
    @Autowired
    private PortingRequestRepository portingRequestRepository;

    public PortingRequest savePortingRequest(PortingRequest portingRequest) {
        return portingRequestRepository.save(portingRequest);
    }
}

