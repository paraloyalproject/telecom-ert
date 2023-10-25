
package telecom.ERT.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import telecom.ERT.model.Customer;

import telecom.ERT.model.KYCDetails;

import telecom.ERT.repository.KYCDetailsRepository;


@Service

public class KYCServiceImpl implements KYCService {
    private final KYCDetailsRepository kycDetailsRepository;


    @Autowired
    public KYCServiceImpl(KYCDetailsRepository kycDetailsRepository) {
        this.kycDetailsRepository = kycDetailsRepository;
    }


    @Override
    public KYCDetails getKYCDetailsByCustomer(Customer customer) {
        return kycDetailsRepository.findByCustomer(customer);
    }


    @Override
    public void saveKYCDetails(KYCDetails kycDetails) {
        kycDetailsRepository.save(kycDetails);
    }

}