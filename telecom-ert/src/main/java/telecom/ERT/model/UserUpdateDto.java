package telecom.ERT.model;
public class UserUpdateDto {
    private String email;
    private String alternativeMobile;
    private String location;
    private String password;
    
    public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAlternativeMobile(String alternativeMobile) {
		this.alternativeMobile = alternativeMobile;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		
		return location;
	}
	public String getAlternativeMobile() {
		
		return alternativeMobile;
	}

	public UserUpdateDto(String email,String password, String alternativeMobile, String location) {
		super();
		this.email = email;
		this.password=password;
		this.alternativeMobile = alternativeMobile;
		this.location = location;
	}
	

    
}
