
package telecom.ERT.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import telecom.ERT.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByPhoneNumber(String phoneNumber);

}