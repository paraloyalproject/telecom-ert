package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import telecom.ERT.model.BroadbandConnection;
import telecom.ERT.repository.BroadbandConnectionRepository;

@Service
public class BroadbandConnectionServiceImpl implements BroadbandConnectionService {

    private final BroadbandConnectionRepository repository;

    @Autowired
    public BroadbandConnectionServiceImpl(BroadbandConnectionRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void save(BroadbandConnection broadbandConnection) {
        repository.save(broadbandConnection);
    }
}
