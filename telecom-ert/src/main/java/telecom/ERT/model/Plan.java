package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import java.math.BigDecimal;

import javax.persistence.*;
@Entity
@Table(name = "plans")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "plan_name")
    private String planName;
    
    @Column(name = "plan_type")
    private String planType;
    
    private BigDecimal price;
    
    @Column(name = "validity_days")
    private Integer validityDays;
    
    @Column(name = "data_limit")
    private String dataLimit;

    @Column(name = "calls_limit")
    private String callsLimit;

    @Column(name = "sms_limit")
    private String smsLimit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getValidityDays() {
		return validityDays;
	}

	public void setValidityDays(Integer validityDays) {
		this.validityDays = validityDays;
	}

	public String getDataLimit() {
		return dataLimit;
	}

	public void setDataLimit(String dataLimit) {
		this.dataLimit = dataLimit;
	}

	public String getCallsLimit() {
		return callsLimit;
	}

	public void setCallsLimit(String callsLimit) {
		this.callsLimit = callsLimit;
	}

	public String getSmsLimit() {
		return smsLimit;
	}

	public void setSmsLimit(String smsLimit) {
		this.smsLimit = smsLimit;
	}
    
   
}
