package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telecom.ERT.model.BroadbandData;
import telecom.ERT.repository.BroadbandDataRepository;
import java.util.List;

@Service
public class BroadbandDataService {

    @Autowired
    private BroadbandDataRepository broadbandDataRepository;

    public List<BroadbandData> getAllBroadbandData() {
        return broadbandDataRepository.findAll();
    }
}
