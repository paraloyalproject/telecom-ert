
package telecom.ERT.service;


import telecom.ERT.model.Customer;


public interface CustomerService {
    Customer findCustomerByPhoneNumber(String phoneNumber);
    void switchToPostpaid(String phoneNumber);
    void saveOtp(String phoneNumber, String otp);
}