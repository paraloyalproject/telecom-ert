package telecom.ERT.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;


@Entity

public class SimPortingRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String currentNumber;
    private String aadharNumber;
    private String currentAddress;
    private String currentCarrier;
    private String simtype;
    private String newCarrier;
    private String newPlan;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getSimtype() {
        return simtype;
    }
    public void setSimtype(String simtype) {
        this.simtype = simtype;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getCurrentNumber() {
        return currentNumber;
    }
    public void setCurrentNumber(String currentNumber) {
        this.currentNumber = currentNumber;
    }
    public String getAadharNumber() {
        return aadharNumber;
    }
    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }
    public String getCurrentAddress() {
        return currentAddress;
    }
    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }
    public String getCurrentCarrier() {
        return currentCarrier;
    }
    public void setCurrentCarrier(String currentCarrier) {
        this.currentCarrier = currentCarrier;
    }
    public String getNewCarrier() {
        return newCarrier;
    }
    public void setNewCarrier(String newCarrier) {
        this.newCarrier = newCarrier;
    }
    public String getNewPlan() {
        return newPlan;
    }
    public void setNewPlan(String newPlan) {
        this.newPlan = newPlan;
    }
    
    

}