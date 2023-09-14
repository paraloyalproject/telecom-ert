package telecom.ERT.model;


	import javax.persistence.*;
	import java.util.Date;

	
	@Entity
	@Table(name = "mobile_recharge")
	public class RechargePayment {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String mobileNumber;
	    private String mobilePackage;
	    private String paymentMethod;
	    private String creditCardNumber;
	    private String creditCardExpire;
	    private String creditCardCvv;
	    private String debitCardNumber;
	    private String debitCardExpire;
	    private String debitCardCvv;
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
		public String getMobilePackage() {
			return mobilePackage;
		}
		public void setMobilePackage(String mobilePackage) {
			this.mobilePackage = mobilePackage;
		}
		public String getPaymentMethod() {
			return paymentMethod;
		}
		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		public String getCreditCardNumber() {
			return creditCardNumber;
		}
		public void setCreditCardNumber(String creditCardNumber) {
			this.creditCardNumber = creditCardNumber;
		}
		public String getCreditCardExpire() {
			return creditCardExpire;
		}
		public void setCreditCardExpire(String creditCardExpire) {
			this.creditCardExpire = creditCardExpire;
		}
		public String getCreditCardCvv() {
			return creditCardCvv;
		}
		public void setCreditCardCvv(String creditCardCvv) {
			this.creditCardCvv = creditCardCvv;
		}
		public String getDebitCardNumber() {
			return debitCardNumber;
		}
		public void setDebitCardNumber(String debitCardNumber) {
			this.debitCardNumber = debitCardNumber;
		}
		public String getDebitCardExpire() {
			return debitCardExpire;
		}
		public void setDebitCardExpire(String debitCardExpire) {
			this.debitCardExpire = debitCardExpire;
		}
		public String getDebitCardCvv() {
			return debitCardCvv;
		}
		public void setDebitCardCvv(String debitCardCvv) {
			this.debitCardCvv = debitCardCvv;
		}

	    
	}



