
package telecom.ERT.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import telecom.ERT.model.PortingPrepaidToPostpaidRequest;

import telecom.ERT.repository.PortingPrepaidToPostpaidRepository;


@Service

public class PortingPrepaidToPostpaidService {


    private final PortingPrepaidToPostpaidRepository portingRepository;


    @Autowired
    public PortingPrepaidToPostpaidService(PortingPrepaidToPostpaidRepository portingRepository) {
        this.portingRepository = portingRepository;
    }


    public void processPorting(PortingPrepaidToPostpaidRequest request) {
        portingRepository.save(request);
    }

}