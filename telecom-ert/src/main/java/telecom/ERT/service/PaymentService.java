package telecom.ERT.service;

import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telecom.ERT.model.Payment;
import telecom.ERT.repository.PaymentRepository;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment savePayment(Payment payment) {
        String[] generatedIds = generateRandomIds(16, 10); 
        payment.setTransactionId(generatedIds[0]);
        payment.setReferenceNumber(generatedIds[1]);

        return paymentRepository.save(payment);
    }
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    private String[] generateRandomIds(int transactionIdLength, int referenceNumberLength) {
        Random random = new Random();
        StringBuilder transactionIdBuilder = new StringBuilder(transactionIdLength);
        StringBuilder referenceNumberBuilder = new StringBuilder(referenceNumberLength);

        for (int i = 0; i < transactionIdLength; i++) {
            int digit = random.nextInt(10); 
            transactionIdBuilder.append(digit);
        }

        for (int i = 0; i < referenceNumberLength; i++) {
            int digit = random.nextInt(10); 
            referenceNumberBuilder.append(digit);
        }

        String transactionId = transactionIdBuilder.toString();
        String referenceNumber = referenceNumberBuilder.toString();

        return new String[]{transactionId, referenceNumber};
    }
}