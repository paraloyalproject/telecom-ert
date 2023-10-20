package telecom.ERT.service;

import telecom.ERT.model.PortingRequest;

public interface PortingService {
    void portPrepaidToPostpaid(PortingRequest request);

    void portPostpaidToPrepaid(PortingRequest request);


	
	
}
