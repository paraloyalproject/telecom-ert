package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telecom.ERT.model.*;
import telecom.ERT.repository.PaymentRepository;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

   @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

   public PaymentInfo savePayment(PaymentInfo payment) {
        return paymentRepository.save(payment);
    }
}
