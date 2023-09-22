package telecom.ERT.model;

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
    private String phone;
    
    @NotEmpty(message = "Email Address is required")
    @Email(message = "Invalid email address")
    private String email;
    
    @NotEmpty(message = "Aadhar Card or PAN Card is required")
    private String cardtype;

    @NotEmpty(message = "simtype is required")
    private String simtype;

    

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
