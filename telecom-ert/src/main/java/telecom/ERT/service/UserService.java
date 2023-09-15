package telecom.ERT.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import telecom.ERT.model.User;
import telecom.ERT.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
	
	User findByEmail(String email);
}
