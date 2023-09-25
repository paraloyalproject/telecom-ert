package telecom.ERT.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import telecom.ERT.exception.ResourceNotFoundException;
import telecom.ERT.model.Role;
import telecom.ERT.model.User;
import telecom.ERT.model.UserUpdateDto;
import telecom.ERT.repository.UserRepository;
import telecom.ERT.web.dto.UserRegistrationDto;

@Service
public class UpdateServiceImpl implements UpdateService {

    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UpdateServiceImpl(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User updateUserDetails(String userEmail, UserUpdateDto updateDto) {
        User user = userRepository.findByEmail(userEmail);
        if (user == null) {
            throw new ResourceNotFoundException("User not found with email: " + userEmail);
        }

        // Update the user entity with the new details
        user.setEmail(updateDto.getEmail());
        user.setAlternativemobile(updateDto.getAlternativeMobile());
        user.setLocation(updateDto.getLocation());

        // Check if a new password is provided and hash it
        if (updateDto.getPassword() != null) {
            user.setPassword(passwordEncoder.encode(updateDto.getPassword())); // Encode the new password
        }

        // Save the updated user entity
        return userRepository.save(user);
    }
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void save(UserRegistrationDto userRegistrationDto) {
        // Create a new User entity from the registration DTO
        User user = new User(
            userRegistrationDto.getFirstName(),
            userRegistrationDto.getMobileno(),
            userRegistrationDto.getEmail(),
            userRegistrationDto.getLocation(),
            userRegistrationDto.getAlternativemobile(),
            passwordEncoder.encode(userRegistrationDto.getPassword()), // Encode the password
            Arrays.asList(new Role("ROLE_USER"))
        );
        
        // Save the user entity to the database
        userRepository.save(user);
    }

}
