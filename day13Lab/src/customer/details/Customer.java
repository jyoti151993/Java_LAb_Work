package customer.details;
import java.time.LocalDate;

public class Customer {
	private String name;
	private String email;
	private String password;
	private double registrationAmt;
	private LocalDate dateOfBirth;
    private PlanType plan;


	//Defining parameterised constr
	public Customer(String name, String email, String password, double registrationAmt,LocalDate dateOfBirth,PlanType plan) {
		super();
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
		return "Customer Detail: "+" Name- "+name+" Email-Id "+email+" Password "+password+" Registration_Amount "
	+registrationAmt+" DateOfBirth "+dateOfBirth+" PlanType "+plan;
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