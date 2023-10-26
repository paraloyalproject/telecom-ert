package telecom.ERT.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "popularplans")
public class PopularPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String packvalidity;
    private String data;
    private String calls;
    private String sms;
    private String additionalbenifits;
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
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
	
	public String getAdditionalbenifits() {
		return additionalbenifits;
	}
	public void setAdditionalbenifits(String additionalbenifits) {
		this.additionalbenifits = additionalbenifits;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

    
    
}


