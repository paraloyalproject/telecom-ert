package telecom.ERT.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prepaid_plans")
public class PrepaidPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String plan;
    private String validity;
    private int calls;
    private int sms;
    private double data;
    private double price;
    private String additionalBenefits;

    
    public PrepaidPlan() {
       
    }

    public PrepaidPlan(String name, String plan, String validity, int calls, int sms, double data, double price, String additionalBenefits) {
        this.name = name;
        this.plan = plan;
        this.validity = validity;
        this.calls = calls;
        this.sms = sms;
        this.data = data;
        this.price = price;
        this.additionalBenefits = additionalBenefits;
    }

    // Getters and setters
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

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public int getCalls() {
        return calls;
    }

    public void setCalls(int calls) {
        this.calls = calls;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAdditionalBenefits() {
        return additionalBenefits;
    }

    public void setAdditionalBenefits(String additionalBenefits) {
        this.additionalBenefits = additionalBenefits;
    }
}

