package telecom.ERT.service;

import telecom.ERT.model.MobileBalance;

public interface MobileBalanceService {


    MobileBalance checkMobileBalance(String mobileNumber);


    MobileBalance rechargePackage(String mobileNumber, String rechargeMode,String packages,String dataValidity,String calls,String sms,String days);
}