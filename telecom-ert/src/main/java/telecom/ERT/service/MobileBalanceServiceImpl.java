package telecom.ERT.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telecom.ERT.model.MobileBalance;
import telecom.ERT.repository.MobileBalanceRepository;
import telecom.ERT.service.MobileBalanceService;

@Service
public class MobileBalanceServiceImpl implements MobileBalanceService {
    private final MobileBalanceRepository mobileBalanceRepository;

    @Autowired
    public MobileBalanceServiceImpl(MobileBalanceRepository mobileBalanceRepository) {
        this.mobileBalanceRepository = mobileBalanceRepository;

    }

    @Override
    public MobileBalance checkMobileBalance(String phoneNumber) {

        MobileBalance mobileBalance = mobileBalanceRepository.findByPhoneNumber(phoneNumber);

        if (mobileBalance == null) {

            mobileBalance = new MobileBalance();

            mobileBalance.setPhoneNumber(phoneNumber);

            mobileBalance.setRechargedPackage("No package recharged yet.");

            return mobileBalanceRepository.save(mobileBalance);

        }

        return mobileBalance;

    }




    @Override

    public MobileBalance rechargePackage(String phoneNumber, String rechargedPackage) {

        MobileBalance mobileBalance = mobileBalanceRepository.findByPhoneNumber(phoneNumber);

        if (mobileBalance == null) {

            // Handle the case where the phone number doesn't exist

            throw new IllegalArgumentException("Phone number not found: " + phoneNumber);

        }

        mobileBalance.setRechargedPackage(rechargedPackage);

        return mobileBalanceRepository.save(mobileBalance);

    }

}