package telecom.ERT.repository;

import telecom.ERT.model.*;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
	UserProfile getUserProfileById(Long id);
	  Optional<UserProfile> findByEmail(String email);
	
}
