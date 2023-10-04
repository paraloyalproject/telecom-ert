package telecom.ERT.model;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

import javax.persistence.Column;





@Entity

@Table(name = "package_details")

public class PackageDetails {




    @Id
    @Column(name = "id")
    private Long id;




    @Column(name = "speed")
    private String speed;




 



	@Column(name = "validity")
    private int validity;




    @Column(name = "calls")
    private String calls;




    @Column(name = "data")
    private String data;




    @Column(name = "sms")
    private String sms;




    @Column(name = "offers")
    private String offers;




    @Column(name = "price")
    private double price;




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getSpeed() {
		return speed;
	}




	public void setSpeed(String speed) {
		this.speed = speed;
	}




	public int getValidity() {
		return validity;
	}




	public void setValidity(int validity) {
		this.validity = validity;
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




	public String getOffers() {
		return offers;
	}




	public void setOffers(String offers) {
		this.offers = offers;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public PackageDetails(Long id, String speed, int validity, String calls, String data, String sms, String offers,
			double price) {
		super();
		this.id = id;
		this.speed = speed;
		this.validity = validity;
		this.calls = calls;
		this.data = data;
		this.sms = sms;
		this.offers = offers;
		this.price = price;
	}




  
}