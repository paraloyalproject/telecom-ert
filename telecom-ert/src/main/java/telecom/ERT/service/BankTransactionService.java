package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telecom.ERT.model.BankTransaction;
import telecom.ERT.repository.BankTransactionRepository;

import java.util.List;

@Service
public class BankTransactionService {
    private final BankTransactionRepository bankTransactionRepository;

    @Autowired
    public BankTransactionService(BankTransactionRepository bankTransactionRepository) {
        this.bankTransactionRepository = bankTransactionRepository;
    }

    public List<BankTransaction> getAllBankTransactions() {
        return bankTransactionRepository.findAll();
    }
}