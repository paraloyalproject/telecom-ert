package telecom.ERT.service;


import telecom.ERT.model.UserTransaction;
import java.util.List;

public interface BillPaymentService {
    void processPayment(UserTransaction transaction);
    List<UserTransaction> getAllTransactions();
}
