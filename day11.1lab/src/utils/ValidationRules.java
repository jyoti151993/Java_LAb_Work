package utils;

import java.util.ArrayList;

import customer.details.Customer;
import customer.exception.CustomerHandlingExceptions;

public class ValidationRules {

	// Add a method to validate email id
	public static String validateEmailId(String curId) throws CustomerHandlingExceptions {

		if (!curId.contains("@"))
			throw new CustomerHandlingExceptions("Ivalid Id,must contain @ ");

		return "Valid Email Id";
	}
	
	
	public static String checkForDupEmail(String email, ArrayList<Customer> customers)
			throws CustomerHandlingExceptions  {
		// 1. parse n validate email & password
		 String validEmail=validateEmailId(email);
		 
		//1.5 create customer object
		Customer c1=new Customer(validEmail);
		//2 find the customer and ret it's ref to the caller o.w throw exc
		int index=customers.indexOf(c1);
		if(!(index==-1))
	  // custom exists already
			throw new CustomerHandlingExceptions("Duplicate, try Again !!!!!");
		return email;
	}

  

	 public static String validatePassword (String curPass) throws CustomerHandlingExceptions {
	 		  
	 		 if(!(curPass.contains("@")||curPass.contains("$")||curPass.contains("#")))
	 		  throw new CustomerHandlingExceptions("Ivalid Password!!!!!!!");
	 		 return "Correct Password";
	 	  }
	
	public static Customer lookByEmailAndPassword(String email, String password, ArrayList<Customer> customers)
			throws CustomerHandlingExceptions  {
		// 1. validate email & password
		 String validEmail=checkForDupEmail(email,customers);
		 String validPassword=validatePassword(password);
		//1.5 create customer object
		Customer c1=new Customer(validEmail,validPassword);
		//2 find the customer and ret it's ref to the caller o.w throw exc
		int index=customers.indexOf(c1);
		if(index==-1)
	  // Customer not found
			throw new CustomerHandlingExceptions("Invalid credentials, Account does not exists try again!!!!!");
		return customers.get(index);
	}
	
	}


