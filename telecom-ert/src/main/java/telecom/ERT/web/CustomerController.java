
package telecom.ERT.web;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;


import telecom.ERT.service.CustomerService;

import telecom.ERT.service.OtpService;

import telecom.ERT.model.Customer;

import telecom.ERT.model.KYCDetails;

import telecom.ERT.service.KYCService;


@Controller

public class CustomerController {
    private final CustomerService customerService;
    private final OtpService otpService;
    private final KYCService kycService;


    @Autowired
    public CustomerController(CustomerService customerService, OtpService otpService, KYCService kycService) {
        this.customerService = customerService;
        this.otpService = otpService;
        this.kycService = kycService;
    }


    @GetMapping("/customer-form")
    public String showCustomerForm() {
        return "customer-form";
    }
    @PostMapping("/customer/port")
    public String sendOtp(String phoneNumber, Model model) {
        String otp = otpService.generateOtp(phoneNumber);
        model.addAttribute("phoneNumber", phoneNumber);
        model.addAttribute("otp", otp);
        return "otp-form";
    }


    @PostMapping("/customer/verify-otp")
    public String verifyOtp(String phoneNumber, String enteredOtp, Model model) {
        if (otpService.verifyOtp(phoneNumber, enteredOtp)) {
            model.addAttribute("message", "OTP verified successfully! Number switched to postpaid.");
            customerService.switchToPostpaid(phoneNumber);
        } else {
            model.addAttribute("message", "Invalid OTP. Please try again.");
        }
        return "customer-kyc-form";
    }
    @PostMapping("/customer/submit-kyc")
    public String submitKYC(String city, String houseNumber, String email, String phoneNumber, Model model) {
        Customer customer = customerService.findCustomerByPhoneNumber(phoneNumber);
        KYCDetails kycDetails = new KYCDetails();
        kycDetails.setCity(city);
        kycDetails.setHouseNumber(houseNumber);
        kycDetails.setEmail(email);
        kycDetails.setCustomer(customer);
        kycService.saveKYCDetails(kycDetails);


        model.addAttribute("message", "KYC details submitted successfully!");
        return "kyc-success";
    }
    
    


    

}