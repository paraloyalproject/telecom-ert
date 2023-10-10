package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity
public class PaymentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mobileNumber;
    private double amount;
    private String paymentMethod;
    private String upiId;
    private String transactionId;
    private String referenceNumber;
    private String paymentInfo;

   public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(String paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

public Long getId() {
        return id;
    }

   public void setId(Long id) {
        this.id = id;
    }

   public String getMobileNumber() {
        return mobileNumber;
    }

   public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

   public double getAmount() {
        return amount;
    }

   public void setAmount(double amount) {
        this.amount = amount;
    }

   public String getPaymentMethod() {
        return paymentMethod;
    }

   public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

   public String getUpiId() {
        return upiId;
    }

   public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
}
