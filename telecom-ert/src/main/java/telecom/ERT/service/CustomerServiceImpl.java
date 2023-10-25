
package telecom.ERT.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import telecom.ERT.model.Customer;

import telecom.ERT.repository.CustomerRepository;


@Service

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;


    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Customer findCustomerByPhoneNumber(String phoneNumber) {
        return customerRepository.findByPhoneNumber(phoneNumber);
    }


    @Override
    public void switchToPostpaid(String phoneNumber) {
        Customer customer = customerRepository.findByPhoneNumber(phoneNumber);
        if (customer != null) {
            customer.setPrepaid(false);
            customerRepository.save(customer);
        }
    }
    @Override
    public void saveOtp(String phoneNumber, String otp) {
        Customer customer = customerRepository.findByPhoneNumber(phoneNumber);
        if (customer != null) {
            customer.setOtp(otp);
            customerRepository.save(customer);
        }
    }


    

}