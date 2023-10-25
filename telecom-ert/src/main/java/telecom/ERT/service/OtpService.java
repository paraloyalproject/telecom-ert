
package telecom.ERT.service;


public interface OtpService {
    String generateOtp(String phoneNumber);
    boolean verifyOtp(String phoneNumber, String enteredOtp);
    String getOtpByPhoneNumber(String phoneNumber);
}