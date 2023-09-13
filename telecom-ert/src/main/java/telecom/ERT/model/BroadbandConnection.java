package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "broadband_connections") 
public class BroadbandConnection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String mobile;
    private String email;
    private String state;
    private String connectionType;
    private String wifiSpeed;

    

    public BroadbandConnection() {
        
    }

    public BroadbandConnection(String name, String mobile, String email, String state, String connectionType, String wifiSpeed) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.state = state;
        this.connectionType = connectionType;
        this.wifiSpeed = wifiSpeed;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getWifiSpeed() {
		return wifiSpeed;
	}

	public void setWifiSpeed(String wifiSpeed) {
		this.wifiSpeed = wifiSpeed;
	}
    

}

