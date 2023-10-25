
package telecom.ERT.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import telecom.ERT.repository.OtpDetailsRepository;

import telecom.ERT.model.OtpDetails;

import java.util.Random;


@Service

public class OtpServiceImpl implements OtpService {
    private final OtpDetailsRepository otpDetailsRepository;


    @Autowired
    public OtpServiceImpl(OtpDetailsRepository otpDetailsRepository) {
        this.otpDetailsRepository = otpDetailsRepository;
    }


    @Override
    public String generateOtp(String phoneNumber) {
        // Generate a random 6-digit OTP
        String otp = generateRandomOtp();


        // Save OTP to the database
        OtpDetails otpDetails = new OtpDetails();
        otpDetails.setPhoneNumber(phoneNumber);
        otpDetails.setOtp(otp);
        otpDetailsRepository.save(otpDetails);


        return otp;
    }


    @Override
    public boolean verifyOtp(String phoneNumber, String enteredOtp) {
        String storedOtp = getOtpByPhoneNumber(phoneNumber);
        return storedOtp != null && storedOtp.equals(enteredOtp);
    }


    @Override
    public String getOtpByPhoneNumber(String phoneNumber) {
        OtpDetails otpDetails = otpDetailsRepository.findByPhoneNumber(phoneNumber);
        return otpDetails != null ? otpDetails.getOtp() : null;
    }


    // Generate a random 6-digit OTP
    private String generateRandomOtp() {
        Random random = new Random();
        int otpNumber = 100000 + random.nextInt(900000);
        return String.valueOf(otpNumber);
    }
    

}