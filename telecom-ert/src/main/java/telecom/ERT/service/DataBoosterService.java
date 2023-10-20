package telecom.ERT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telecom.ERT.model.DataBooster;
import telecom.ERT.repository.DataBoosterRepository;

@Service
public class DataBoosterService {
    private final DataBoosterRepository dataBoosterRepository;

    @Autowired
    public DataBoosterService(DataBoosterRepository dataBoosterRepository) {
        this.dataBoosterRepository = dataBoosterRepository;
    }

    public List<DataBooster> getAllDataBoosters() {
        return dataBoosterRepository.findAll();
    }

    public DataBooster getDataBoosterById(Long id) {
        return dataBoosterRepository.findById(id).orElse(null);
    }

}
