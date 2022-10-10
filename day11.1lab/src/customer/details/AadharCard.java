package customer.details;

public class AadharCard

 { 
	private String gender;
  private String adresline;
  private String city;
  private String state;
  private String zipcode;
  private int aadharCardNo;
  
@Override
public String toString() {
	return "AadharCard Info- [gender=" + gender + ", adressline=" + adresline + ", city=" + city + ", state=" + state
			+ ", zipcode=" + zipcode + ", aadharCardNo=" + aadharCardNo + "]";
}

public AadharCard(String gender, String adresline, String city, String state, String zipcode, int aadharCardNo) {
	super();
	this.gender = gender;
	this.adresline = adresline;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
	this.aadharCardNo = aadharCardNo;
}
  
  
  
}
