package telecom.ERT.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import telecom.ERT.model.EsimData;
import telecom.ERT.repository.EsimDataRepository;

@Service
public class ChartService {

    private final EsimDataRepository esimDataRepository;

    public ChartService(EsimDataRepository esimDataRepository) {
        this.esimDataRepository = esimDataRepository;
    }

    public ChartData getChartData() {
        // Fetch data from the repository
        List<EsimData> esimDataList = esimDataRepository.findAll();

        // Convert EsimData entities to ChartData
        return convertEsimDataListToChartData(esimDataList);
    }

    private ChartData convertEsimDataListToChartData(List<EsimData> esimDataList) {
        List<String> labels = new ArrayList<>();
        List<Integer> totalConnections = new ArrayList<>();
        List<Integer> prepaidUsage = new ArrayList<>();
        List<Integer> postpaidUsage = new ArrayList<>();
        List<Integer> currentUsage = new ArrayList<>();

        for (EsimData esimData : esimDataList) {
            labels.add(esimData.getYear() + ' ' + esimData.getMonth());
            totalConnections.add(esimData.getTotalConnections());
            prepaidUsage.add(esimData.getPrepaidUsage());
            postpaidUsage.add(esimData.getPostpaidUsage());
            currentUsage.add(esimData.getCurrentUsage());
        }

        return new ChartData(labels, totalConnections, prepaidUsage, postpaidUsage, currentUsage);
    }
}
