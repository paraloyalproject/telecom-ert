package telecom.ERT.service;
import telecom.ERT.model.MobileBalance;

public interface MobileBalanceService {

    MobileBalance checkMobileBalance(String phoneNumber);

    MobileBalance rechargePackage(String phoneNumber, String rechargedPackage);

}