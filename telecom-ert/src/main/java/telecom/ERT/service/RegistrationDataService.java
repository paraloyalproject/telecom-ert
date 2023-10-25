package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telecom.ERT.model.RegistrationData;
import telecom.ERT.repository.RegistrationDataRepository;
import java.util.List;

@Service
public class RegistrationDataService {

    private final RegistrationDataRepository registrationDataRepository;

    @Autowired
    public RegistrationDataService(RegistrationDataRepository registrationDataRepository) {
        this.registrationDataRepository = registrationDataRepository;
    }

    public List<RegistrationData> getAllRegistrationData() {
        return registrationDataRepository.findAll();
    }

}
