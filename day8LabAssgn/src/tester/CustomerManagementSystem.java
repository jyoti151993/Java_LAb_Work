package tester;
import static customerDetails.Customer.sdf;
import java.util.Arrays;
import static utils.ValidationRules.validateEmailId;
import static utils.ValidationRules.checkDupEmail;
import java.text.ParseException;
import java.util.Scanner;

import customerDetails.Customer;
public class CustomerManagementSystem  {

	public static void main(String[] args) throws ParseException {
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter the total no.of customer you want to register");
		Customer[] cx=new Customer[sc.nextInt()];
		boolean exit=false;
		int counter=0;
		//initialisation phase
		while(!exit) {
			
			System.out.println("---Options---");
			System.out.println("[1] Register Customer");
			System.out.println("[2] Display details of the Registered Customers");
			System.out.println("[15] Exit");
			System.out.println("Select the option");
			
			//servicing phase
			try {
			switch(sc.nextInt()) {
			
			case 1:
			if(counter <cx.length)
			{
			System.out.println("Validate Email Id....");
//			System.out.println("Enter the customer's Email-Id");
//		     Customer newCus=checkDupEmail(sc.next(),cx);
		     System.out.println("Enter the Customer's Details-->Name,Email-Id,Password,Registration_Amount:,DateOfBirth:yyyy-MMM-dd");
	           Customer newCus= new Customer(sc.next(),checkDupEmail(sc.next(),cx),sc.next(),sc.nextDouble(),sdf.parse(sc.next())); 
		     cx[counter++]= newCus;
	            }
			else
			System.out.println("Registration Full!!!!!!!!!!");
	         break;
				
			case 2:
			System.out.println("Customer Info...");
				for(Customer c :cx)
				if(c!=null)
				 System.out.println(c);
				   break;
			case 15:
				exit=true;
				break;
				
		    default:
				break;
		    
			 }
			
			 }
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Invalid Input...try Again");
				
			   sc.nextLine();
		     }

	        }
	   
		}
	  }


	}
