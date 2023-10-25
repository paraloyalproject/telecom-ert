
package telecom.ERT.service;


import telecom.ERT.model.Customer;

import telecom.ERT.model.KYCDetails;


public interface KYCService {
    KYCDetails getKYCDetailsByCustomer(Customer customer);
    void saveKYCDetails(KYCDetails kycDetails);

}