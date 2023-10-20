
package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import telecom.ERT.model.UserTransaction;

import telecom.ERT.repository.BillPaymentRepository;





import java.util.ArrayList;

import java.util.List;




@Service

public class BillPaymentServiceImpl implements BillPaymentService {




    @Autowired
    private BillPaymentRepository repository;




    @Override
    public void processPayment(UserTransaction transaction) {
        repository.save(transaction);
    }




    @Override
    public List<UserTransaction> getAllTransactions() {
        Iterable<UserTransaction> transactionIterable = repository.findAll();
        List<UserTransaction> transactions = new ArrayList<>();
        transactionIterable.forEach(transaction -> {
            if (transaction.getAmountPaid() == null) {
                // Handle null amountPaid, for example set it to 0.0
                transaction.setAmountPaid(0.0);
            }
            transactions.add(transaction);
        });
        return transactions;
    }

}