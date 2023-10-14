package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telecom.ERT.model.SwitchPrepaidEntity;
import telecom.ERT.repository.SwitchPrepaidRepository;

@Service
public class SwitchPrepaidServiceImpl implements SwitchPrepaidService {

    private final SwitchPrepaidRepository switchPrepaidRepository;

    @Autowired
    public SwitchPrepaidServiceImpl(SwitchPrepaidRepository switchPrepaidRepository) {
        this.switchPrepaidRepository = switchPrepaidRepository;
    }

    @Override
    public SwitchPrepaidEntity submitSwitchPrepaidForm(SwitchPrepaidEntity switchPrepaidEntity) {
        return switchPrepaidRepository.save(switchPrepaidEntity);
    }
}
