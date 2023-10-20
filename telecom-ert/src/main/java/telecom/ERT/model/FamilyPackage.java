package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "familypackages")
public class FamilyPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Operator;
    private String Data;
    private String Addonmembers;
    private String Price;
    private String OtherBenifits;
    private String Validity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOperator() {
		return Operator;
	}
	public void setOperator(String operator) {
		Operator = operator;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getAddonmembers() {
		return Addonmembers;
	}
	public void setAddonmembers(String addonmembers) {
		Addonmembers = addonmembers;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getOtherBenifits() {
		return OtherBenifits;
	}
	public void setOtherBenifits(String otherBenifits) {
		OtherBenifits = otherBenifits;
	}
	public String getValidity() {
		return Validity;
	}
	public void setValidity(String validity) {
		Validity = validity;
	}
	
	
    
}