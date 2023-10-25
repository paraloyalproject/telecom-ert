
package telecom.ERT.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import telecom.ERT.model.OtpDetails;


public interface OtpDetailsRepository extends JpaRepository<OtpDetails, Long> {
    OtpDetails findByPhoneNumber(String phoneNumber);

}