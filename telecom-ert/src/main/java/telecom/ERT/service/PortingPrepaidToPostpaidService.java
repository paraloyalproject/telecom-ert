package telecom.ERT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telecom.ERT.model.PortingPrepaidToPostpaidRequest;
import telecom.ERT.model.SimPortingRequest;
import telecom.ERT.repository.PortingPrepaidToPostpaidRepository;
import telecom.ERT.repository.SimPortingRequestRepository;

@Service
public class PortingPrepaidToPostpaidService {

    private final PortingPrepaidToPostpaidRepository portingRepository;

    @Autowired
    public PortingPrepaidToPostpaidService(PortingPrepaidToPostpaidRepository portingRepository) {
        this.portingRepository = portingRepository;
    }

    public void processPorting(PortingPrepaidToPostpaidRequest request) {
        // Process and save the request to the database using the repository
        portingRepository.save(request);
    }
}
