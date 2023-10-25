package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BroadbandData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;
    private String month;
    private int net4gUsage;
    private int net5gUsage;
    private int opticalUsage;
    private int wifiUsage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getNet4gUsage() {
        return net4gUsage;
    }

    public void setNet4gUsage(int net4gUsage) {
        this.net4gUsage = net4gUsage;
    }

    public int getNet5gUsage() {
        return net5gUsage;
    }

    public void setNet5gUsage(int net5gUsage) {
        this.net5gUsage = net5gUsage;
    }

    public int getOpticalUsage() {
        return opticalUsage;
    }

    public void setOpticalUsage(int opticalUsage) {
        this.opticalUsage = opticalUsage;
    }

    public int getWifiUsage() {
        return wifiUsage;
    }

    public void setWifiUsage(int wifiUsage) {
        this.wifiUsage = wifiUsage;
    }
}
