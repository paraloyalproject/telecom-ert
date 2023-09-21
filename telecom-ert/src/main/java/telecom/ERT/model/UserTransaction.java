package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "bill_payment")
public class UserTransaction {
    @Id
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "payment_type")
    private String paymentType;

    @Column(name = "package_validity")
    private String packageValidity;

    @Column(name = "amount_paid")
    private double amountPaid;

   
	
	public UserTransaction() {
		
	}

	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPackageValidity() {
		return packageValidity;
	}

	public void setPackageValidity(String packageValidity) {
		this.packageValidity = packageValidity;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public UserTransaction(String username, String phoneNumber, String transactionId,
             String paymentType, String packageValidity, double amountPaid) {
this.username = username;
this.phoneNumber = phoneNumber;
this.transactionId = generateRandomTransactionId();
this.paymentType = paymentType;
this.packageValidity = packageValidity;
this.amountPaid = amountPaid;
}

	 private String generateRandomTransactionId() {
	        return UUID.randomUUID().toString();
	    }
    
}
