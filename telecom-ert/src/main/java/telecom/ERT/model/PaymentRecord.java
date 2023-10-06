package telecom.ERT.model;



import javax.persistence.*;

@Entity

@Table(name = "Paybill") // Set the table name to "Paybill"

public class PaymentRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




    @Column(name = "mobile_column") // Set the column name for the 'mobile' field
    private String mobile;




    @Column(name = "amount_column") // Set the column name for the 'amount' field
    private Double amount;




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getMobile() {
		return mobile;
	}




	public void setMobile(String mobile) {
		this.mobile = mobile;
	}




	public Double getAmount() {
		return amount;
	}




	public void setAmount(Double amount) {
		this.amount = amount;
	}




 
}