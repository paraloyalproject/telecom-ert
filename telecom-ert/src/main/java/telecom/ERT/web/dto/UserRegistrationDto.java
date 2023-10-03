package telecom.ERT.web.dto;

import java.util.Collection;

import telecom.ERT.model.Role;

public class UserRegistrationDto {
	private String firstName;
	private String mobileno;
	private String email;
	
	private String alternativemobile;
	private String location;
	private String password;
	
	public UserRegistrationDto(){
		
	}
	public UserRegistrationDto(String firstName, String mobileno, String email ,String alternativemobile, String location,String password) {
		super();
		this.firstName = firstName;
		this.mobileno = mobileno;
		this.email = email;
		
		this.alternativemobile=alternativemobile;
		this.location=location;
		this.password = password;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMobileno() {
	    return mobileno;
	}

	public void setMobileno(String mobileno) {
	    this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getAlternativemobile() {
		return alternativemobile;
	}

	public void setAlternativemobile(String alternativemobile) {
		this.alternativemobile = alternativemobile;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}