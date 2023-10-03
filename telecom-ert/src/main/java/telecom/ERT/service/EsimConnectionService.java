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
    private static int referenceIdCounter = 111111; // Starting reference ID

    public static String generateNextReferenceId() {
        String formattedReferenceId = String.format("%06d", referenceIdCounter);
        referenceIdCounter++;
        return formattedReferenceId;
    }

}