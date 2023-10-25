
package telecom.ERT.model;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;


@Entity

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phoneNumber;
    private boolean isPrepaid;
    private String otp;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public boolean isPrepaid() {
        return isPrepaid;
    }
    public void setPrepaid(boolean isPrepaid) {
        this.isPrepaid = isPrepaid;
    }
    public String getOtp() {
        return otp;
    }


    public void setOtp(String otp) {
        this.otp = otp;
    }


    
    

}