package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EsimData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String year;
    private String month;
    private int totalConnections;
    private int prepaidUsage;
    private int postpaidUsage;
    private int currentUsage;
    
    public EsimData() {
    }
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getTotalConnections() {
		return totalConnections;
	}
	public void setTotalConnections(int totalConnections) {
		this.totalConnections = totalConnections;
	}
	public int getPrepaidUsage() {
		return prepaidUsage;
	}
	public void setPrepaidUsage(int prepaidUsage) {
		this.prepaidUsage = prepaidUsage;
	}
	public int getPostpaidUsage() {
		return postpaidUsage;
	}
	public void setPostpaidUsage(int postpaidUsage) {
		this.postpaidUsage = postpaidUsage;
	}
	public int getCurrentUsage() {
		return currentUsage;
	}
	public void setCurrentUsage(int currentUsage) {
		this.currentUsage = currentUsage;
	}
}
