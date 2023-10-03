package telecom.ERT.service;

import telecom.ERT.model.User;
import telecom.ERT.model.UserUpdateDto;
import telecom.ERT.web.dto.UserRegistrationDto;

public interface UpdateService {
    User updateUserDetails(String userEmail, UserUpdateDto updateDto);

    User findByEmail(String email);

    void save(UserRegistrationDto user);
}