package telecom.ERT.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import telecom.ERT.model.RechargePayment;
import telecom.ERT.repository.RechargePaymentRepository;

@Service
public class RechargePaymentServiceImpl implements RechargePaymentService {

    private final RechargePaymentRepository repository;

    @Autowired
    public RechargePaymentServiceImpl(RechargePaymentRepository repository) {
        this.repository = repository;
    }

    @Transactional@Override
    public void save(RechargePayment rechargePayment) {
        repository.save(rechargePayment);
    }
}

