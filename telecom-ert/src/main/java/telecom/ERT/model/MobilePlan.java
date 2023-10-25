package telecom.ERT.model;

import javax.persistence.*;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MobilePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "national_sms_charge")
    private String nationalSmsCharge;

    @Column(name = "international_sms_charge")
    private String internationalSmsCharge;

    @Column(name = "local_roaming_charge")
    private String localRoamingCharge;

    @Column(name = "international_roaming_charge")
    private String internationalRoamingCharge;

    @Column(name = "postpaid_offer")
    private String postpaidOffer;

    @Column(name = "special_offer")
    private String specialOffer;

    @Column(name = "type")
    private String type;


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

	public String getNationalSmsCharge() {
		return nationalSmsCharge;
	}

	public void setNationalSmsCharge(String nationalSmsCharge) {
		this.nationalSmsCharge = nationalSmsCharge;
	}

	public String getInternationalSmsCharge() {
		return internationalSmsCharge;
	}

	public void setInternationalSmsCharge(String internationalSmsCharge) {
		this.internationalSmsCharge = internationalSmsCharge;
	}

	public String getLocalRoamingCharge() {
		return localRoamingCharge;
	}

	public void setLocalRoamingCharge(String localRoamingCharge) {
		this.localRoamingCharge = localRoamingCharge;
	}

	public String getInternationalRoamingCharge() {
		return internationalRoamingCharge;
	}

	public void setInternationalRoamingCharge(String internationalRoamingCharge) {
		this.internationalRoamingCharge = internationalRoamingCharge;
	}

	public String getPostpaidOffer() {
		return postpaidOffer;
	}

	public void setPostpaidOffer(String postpaidOffer) {
		this.postpaidOffer = postpaidOffer;
	}

	public String getSpecialOffer() {
		return specialOffer;
	}

	public void setSpecialOffer(String specialOffer) {
		this.specialOffer = specialOffer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public MobilePlan() {
		
	}

	public MobilePlan(Long id, String name, String nationalSmsCharge, String internationalSmsCharge,
			String localRoamingCharge, String internationalRoamingCharge, String postpaidOffer, String specialOffer,
			String type) {
		
		this.id = id;
		this.name = name;
		this.nationalSmsCharge = nationalSmsCharge;
		this.internationalSmsCharge = internationalSmsCharge;
		this.localRoamingCharge = localRoamingCharge;
		this.internationalRoamingCharge = internationalRoamingCharge;
		this.postpaidOffer = postpaidOffer;
		this.specialOffer = specialOffer;
		this.type = type;
	}

    
}