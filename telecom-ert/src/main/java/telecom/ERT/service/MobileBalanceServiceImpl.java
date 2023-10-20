package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telecom.ERT.model.MobileBalance;
import telecom.ERT.repository.MobileBalanceRepository;

@Service
public class MobileBalanceServiceImpl implements MobileBalanceService {


   private final MobileBalanceRepository mobileBalanceRepository;


   @Autowired
    public MobileBalanceServiceImpl(MobileBalanceRepository mobileBalanceRepository) {
        this.mobileBalanceRepository = mobileBalanceRepository;
    }


   @Override
    public MobileBalance checkMobileBalance(String mobileNumber) {
        return mobileBalanceRepository.findByMobileNumber(mobileNumber);
    }


   @Override
    public MobileBalance rechargePackage(String mobileNumber, String rechargeMode, String packages, String dataValidity, String calls, String sms, String days) {
        MobileBalance mobileBalance = new MobileBalance();
        mobileBalance.setMobileNumber(mobileNumber);
        mobileBalance.setRechargeMode(rechargeMode);
        mobileBalance.setPackages(packages);
        mobileBalance.setDataValidity(dataValidity);
        mobileBalance.setCalls(calls);
        mobileBalance.setSms(sms);
        mobileBalance.setDays(days);
        
        return mobileBalanceRepository.save(mobileBalance);
    }
}
