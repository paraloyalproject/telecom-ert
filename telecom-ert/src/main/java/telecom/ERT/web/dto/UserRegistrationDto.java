package telecom.ERT.web.dto;

public class UserRegistrationDto {
	private String firstName;
	private String mobileno;
	private String email;
	private String password;
	
	public UserRegistrationDto(){
		
	}
	
	public UserRegistrationDto(String firstName, String mobileno, String email, String password) {
		super();
		this.firstName = firstName;
		this.mobileno = mobileno;
		this.email = email;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
