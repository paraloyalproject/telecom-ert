package telecom.ERT.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prepaidplans")
public class PrepaidPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String packvalidity;
    private String totaldata;
    private String dataathighspeed;
    private String calls;
    private String sms;
    private String subscriptions;
    private double price;
	
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
	public String getPackvalidity() {
		return packvalidity;
	}
	public void setPackvalidity(String packvalidity) {
		this.packvalidity = packvalidity;
	}
	public String getTotaldata() {
		return totaldata;
	}
	public void setTotaldata(String totaldata) {
		this.totaldata = totaldata;
	}
	public String getDataathighspeed() {
		return dataathighspeed;
	}
	public void setDataathighspeed(String dataathighspeed) {
		this.dataathighspeed = dataathighspeed;
	}
	public String getCalls() {
		return calls;
	}
	public void setCalls(String calls) {
		this.calls = calls;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	
	public String getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(String subscriptions) {
		this.subscriptions = subscriptions;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
  
}