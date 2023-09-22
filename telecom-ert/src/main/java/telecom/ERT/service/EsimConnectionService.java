package telecom.ERT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telecom.ERT.model.EsimConnection;
import telecom.ERT.repository.EsimConnectionRepository;

@Service
public class EsimConnectionService {

    private EsimConnectionRepository esimConnectionRepository;

    @Autowired
    public EsimConnectionService(EsimConnectionRepository esimConnectionRepository) {
        this.esimConnectionRepository = esimConnectionRepository;
    }

    public void saveEsimConnection(EsimConnection esimConnection) {
       
        esimConnectionRepository.save(esimConnection);
    }
}
