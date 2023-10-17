package telecom.ERT.service;

import org.apache.catalina.connector.Request;

import telecom.ERT.model.PortingRequest;
import telecom.ERT.model.SimPortingRequest;

public interface PortingService {
    void portPrepaidToPostpaid(PortingRequest request);

    void portPostpaidToPrepaid(PortingRequest request);

	//void simporting(PortingRequest request);

	
	
}
