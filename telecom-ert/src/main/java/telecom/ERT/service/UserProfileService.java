package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telecom.ERT.exception.ResourceNotFoundException;
import telecom.ERT.model.UserProfile;
import telecom.ERT.repository.UserProfileRepository;

import java.util.List;

@Service
public class UserProfileService {

    private final UserProfileRepository userProfileRepository;

    @Autowired
    public UserProfileService(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    // Method to create a new UserProfile
    public UserProfile createUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public UserProfile getUserProfileByEmail(String currentUserEmail) {
        return userProfileRepository.findByEmail(currentUserEmail)
                .orElseThrow(() -> new ResourceNotFoundException("UserProfile not found with email: " + currentUserEmail));
    }

    // Method to update an existing UserProfile
    public UserProfile updateUserProfile(String currentUserEmail, UserProfile updatedUserProfile) {
        UserProfile existingUserProfile = getUserProfileByEmail(currentUserEmail);

        // Update the fields of the existing UserProfile with the values from the updated UserProfile
        existingUserProfile.setName(updatedUserProfile.getName());
        existingUserProfile.setEmail(updatedUserProfile.getEmail());
        existingUserProfile.setMobile(updatedUserProfile.getMobile());
        existingUserProfile.setPkg(updatedUserProfile.getPkg());
        existingUserProfile.setConnections(updatedUserProfile.getConnections());
        existingUserProfile.setConnectionId(updatedUserProfile.getConnectionId());

        return userProfileRepository.save(existingUserProfile);
    }

    // Method to delete a UserProfile by its ID
    public void deleteUserProfile(String currentUserEmail) {
        UserProfile userProfile = getUserProfileByEmail( currentUserEmail);
        userProfileRepository.delete(userProfile);
    }

    // Method to retrieve a list of all UserProfiles
    public List<UserProfile> getAllUserProfiles() {
        return userProfileRepository.findAll();
    }

	
}
