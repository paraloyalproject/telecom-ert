package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telecom.ERT.model.PortingPostpaidToPrepaidRequest;
import telecom.ERT.repository.PortingPostpaidToPrepaidRepository;

@Service
public class PortingPostpaidToPrepaidService {

    private final PortingPostpaidToPrepaidRepository portingRepository;

    @Autowired
    public PortingPostpaidToPrepaidService(PortingPostpaidToPrepaidRepository portingRepository) {
        this.portingRepository = portingRepository;
    }

    public void processPorting(PortingPostpaidToPrepaidRequest request) {
        portingRepository.save(request);
    }
}
