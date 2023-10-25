package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistrationData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String month;
    private int year;
    private int registrations;
    private int currentUsage;
    
    public RegistrationData() {
    	
    }
	public RegistrationData(Long id, String month, int year, int registrations, int currentUsage) {
		super();
		this.id = id;
		this.month = month;
		this.year = year;
		this.registrations = registrations;
		this.currentUsage = currentUsage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRegistrations() {
		return registrations;
	}
	public void setRegistrations(int registrations) {
		this.registrations = registrations;
	}
	public int getCurrentUsage() {
		return currentUsage;
	}
	public void setCurrentUsage(int currentUsage) {
		this.currentUsage = currentUsage;
	}
}
