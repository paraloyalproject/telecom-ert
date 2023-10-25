
package telecom.ERT.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import telecom.ERT.model.Customer;

import telecom.ERT.model.KYCDetails;


public interface KYCDetailsRepository extends JpaRepository<KYCDetails, Long> {
    KYCDetails findByCustomer(Customer customer);

}