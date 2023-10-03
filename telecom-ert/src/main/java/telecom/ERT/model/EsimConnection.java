package telecom.ERT.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "esim_connection")
public class EsimConnection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Existing Phone Number is required")
    private String mobile;
    
    @NotEmpty(message = "Email Address is required")
    @Email(message = "Invalid email address")
    private String email;
    
    @NotEmpty(message = "Aadhar Card or PAN Card is required")
    private String cardtype;

    @NotEmpty(message = "simtype is required")
    private String simtype;
   
    private String aadhar;
    private String pan;
  
    @Column(name = "reference_id")
    private String referenceId;
    
    public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

    public String getSimtype() {
		return simtype;
	}

	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCardType() {
        return cardtype;
    }

    public void setCardType(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {    
        this.email = email;
    }

	
}