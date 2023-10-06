package telecom.ERT.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import telecom.ERT.model.PaymentRecord;
import telecom.ERT.repository.PaymentRecordRepository;





@Service

public class PaymentRecordServiceImpl implements PaymentRecordService {




    private final PaymentRecordRepository paymentRecordRepository;




    @Autowired
    public PaymentRecordServiceImpl(PaymentRecordRepository paymentRecordRepository) {
        this.paymentRecordRepository = paymentRecordRepository;
    }




    @Override
    public void savePaymentRecord(String mobile, Double amount) {
        PaymentRecord paymentRecord = new PaymentRecord();
        paymentRecord.setMobile(mobile);
        paymentRecord.setAmount(amount);
        paymentRecordRepository.save(paymentRecord);
    }

}