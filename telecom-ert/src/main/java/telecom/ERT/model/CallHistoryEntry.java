package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;
import java.time.LocalTime;
@Entity
public class CallHistoryEntry {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String mobileNo;
    private LocalTime startingTime;
    private LocalTime endingTime;
    private LocalTime duration; // Change the duration data type to LocalTime
    private String callType;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public LocalTime getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(LocalTime startingTime) {
		this.startingTime = startingTime;
	}
	public LocalTime getEndingTime() {
		return endingTime;
	}
	public void setEndingTime(LocalTime endingTime) {
		this.endingTime = endingTime;
	}
	public LocalTime getDuration() {
		return duration;
	}
	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public CallHistoryEntry(Long id,LocalDate date, String mobileNo, LocalTime startingTime, LocalTime endingTime,
			LocalTime duration, String callType) {
		super();
		this.id=id;
		this.date = date;
		this.mobileNo = mobileNo;
		this.startingTime = startingTime;
		this.endingTime = endingTime;
		this.duration = duration;
		this.callType = callType;
	}

	public CallHistoryEntry() {
		
	}
}
