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

	public static SimpleDateFormat sdf; // sdf=null
	//create a single instance of SimpleDateFormat for parsing String-->date
	static {
	  sdf=new SimpleDateFormat ("yyyy-MMM-dd"); // initialisation of sdf
	}
	//Defining parameterised constr
	public Customer(String name, String email, String password, double registrationAmt, Date dateOfBirth,PlanType plan) {
		this.name=name;
		this.email=email;
		this.password=password;
		this.registrationAmt=registrationAmt;
		this.dateOfBirth = dateOfBirth;
		this.plan=plan;
		}
	
	// create an overloaded constructor to encapsulate email ID
	public Customer(String email) {
		super();
		this.email=email;
	}
	
	
	
	public Customer(String email, String password) {
		super();
		this.email=email;
		this.password=password;
	}

	@Override
	public String toString() {
		return "Customer : "+"Name-"+name+"Email-Id "+email+"Password "+password+"Registration Amount "
	+registrationAmt+"DateOfBirth"+sdf.format(dateOfBirth)+"PlanType"+plan;
		}


	//overriding the equals'method in the object class
	@Override
	public boolean equals(Object o) {
		System.out.println("Is Customer's Equal");
		if(o instanceof Customer)
	 return email.equals(((Customer)o).email);
		return false;
		}
	
	
	public void setPassword(String password) {
	 this.password=password;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
}