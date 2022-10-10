package utils;
import customerHandlingException.CustomerHandlingExceptions;
import java.text.ParseException;

import customerDetails.Customer;
public class ValidationRules {

	 //Add a method to validate email id
 public static String validateEmailId (String curId) throws CustomerHandlingExceptions  {
	

	 if (!curId.contains("@"))
	 throw new CustomerHandlingExceptions("Ivalid Id,must contain @ ");
	 
	 return "Valid Email Id";
 }
	
 
 //Add a method to check the duplicacy of the emails
 public static String checkDupEmail (String mail , Customer[] cus) throws CustomerHandlingExceptions{
	         //1 validate email
	   String validEmail=validateEmailId(mail);
	   //create customer object
	   Customer c1=new Customer(validEmail);
	   for(Customer c: cus)
		   if(c!=null)
	        if(c.equals(c1))
	       throw new CustomerHandlingExceptions("Duplicate Email, Retry");	
	 	  return mail;
	     
 }
}

