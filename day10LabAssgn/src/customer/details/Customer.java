package customer.details;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Customer {
	private String name;
	private String email;
	private String password;
	private double registrationAmt;
	private Date dateOfBirth;
	//Add has-a association between customer and its plantype
    private PlanType plan;
	//Add has-a association between customer and its Aadhar card via composition
	private AadharCard aadhar;
	public static SimpleDateFormat sdf; // sdf=null
	//create a single instance of SimpleDateFormat for parsing String-->date
	static {
	  sdf=new SimpleDateFormat ("yyyy-MMM-dd"); // initialisation of sdf
	}
	//Defining parameterised constr
	public Customer(String name, String email, String password, double registrationAmt, Date dateOfBirth,PlanType plan) {
		super();
		this.name=name;
		this.email=email;
		this.password=password;
		this.registrationAmt=registrationAmt;
		this.dateOfBirth=dateOfBirth;
		this.plan=plan;
		}
	
	// create an overloaded constructor to encapsulate email ID
	public Customer(String email) {
		super();
		this.email=email;
	}
	
	
	
	@Override
	public String toString() {
		AadharCard adhar=aadhar;
		if(aadhar==null)
			System.out.println("Aadhar not yet linked");
		else
			aadhar.toString();
		return "Customer : "+"Name-"+name+"Email-Id "+email+"Password "+password+"Registration Amount "
	    +registrationAmt+"DateOfBirth"+sdf.format(dateOfBirth)+"PlanType"+plan+" "+adhar;
		}


	//overriding the equals'method in the object class
	@Override
	public boolean equals(Object o) {
		System.out.println("Is Customer's Equal");
		if(o instanceof Customer)
	 return email.equals(((Customer)o).email);
		return false;
		}
	
	//add inner class (non static class) to show composition between Customer and Aadhar Card


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
	  
	 
	public AadharCard getAadhar() {
		return aadhar;
	}
	
	
	public  String linkAadharCard(String gender, String adress, String fatherName) {
		
 	aadhar =new AadharCard(gender,adress,fatherName);
	return "Aadhar Card is linked...";
		}
	
	
	
}