package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MonthlyPlan {
    @Id
    private Long id;
    private String calls;
    private String data;
    private String sms;
    private String validity;
    private String additionalBenefits;
    private String price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCalls() {
		return calls;
	}
	public void setCalls(String calls) {
		this.calls = calls;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getAdditionalBenefits() {
		return additionalBenefits;
	}
	public void setAdditionalBenefits(String additionalBenefits) {
		this.additionalBenefits = additionalBenefits;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
