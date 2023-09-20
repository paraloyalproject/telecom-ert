package telecom.ERT.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import telecom.ERT.model.*;

import telecom.ERT.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	telecom.ERT.model.User save(UserRegistrationDto registrationDto);


	
}
