package telecom.ERT.model;

	

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "prepaidfamilyplans")
	public class PrepaidFamilyPlan {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String packageName;
	    private double price;
	    private int numberOfLines;
	    private String data;
		private String sms;
	    private String otherBenefits;
	    private String operator;

	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getPackageName() {
			return packageName;
		}
		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getNumberOfLines() {
			return numberOfLines;
		}
		public void setNumberOfLines(int numberOfLines) {
			this.numberOfLines = numberOfLines;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getSms() {
			return sms;
		}
		public void setSms(String sms) {
			this.sms = sms;
		}
		public String getOtherBenefits() {
			return otherBenefits;
		}
		public void setOtherBenefits(String otherBenefits) {
			this.otherBenefits = otherBenefits;
		}
		public String getOperator() {
			return operator;
		}
		public void setOperator(String operator) {
			this.operator = operator;
		}
	
	  


}
