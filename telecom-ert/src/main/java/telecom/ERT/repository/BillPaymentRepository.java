package telecom.ERT.repository;

import org.springframework.data.repository.CrudRepository;

import telecom.ERT.model.UserTransaction;

import java.util.*;

public interface BillPaymentRepository extends CrudRepository<UserTransaction, Long> {






}