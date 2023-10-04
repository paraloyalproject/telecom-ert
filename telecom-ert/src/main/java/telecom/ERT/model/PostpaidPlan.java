package telecom.ERT.model;

import javax.persistence.*;

@Entity
@Table(name = "postpaid_plans")
public class PostpaidPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; 
    private double price;
    private String dataPlan;
    private String packageName;
    private int sms;
    private String validity;
    private String calls;

    public PostpaidPlan() {
    }
    

    public PostpaidPlan(String name, double price, String dataPlan, String packageName, int sms, String validity, String calls) {
        this.name = name;
        this.price = price;
        this.dataPlan = dataPlan;
        this.packageName = packageName;
        this.sms = sms;
        this.validity = validity;
        this.calls = calls;
    }

    // Getters and setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDataPlan() {
        return dataPlan;
    }

    public void setDataPlan(String dataPlan) {
        this.dataPlan = dataPlan;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getCalls() {
        return calls;
    }

    public void setCalls(String calls) {
        this.calls = calls;
    }
}
