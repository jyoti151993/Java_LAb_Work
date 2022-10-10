package customer.details;

public class AadharCard

 { 
  private String gender;
  private String adress;
  private String fatherName;
@Override
public String toString() {
	return "AadharCard [gender=" + gender + ", adress=" + adress + ", fatherName=" + fatherName + "]";
}
public AadharCard(String gender, String adress, String fatherName) {
	super();
	this.gender = gender;
	this.adress = adress;
	this.fatherName = fatherName;
}
  
 }
  
  
