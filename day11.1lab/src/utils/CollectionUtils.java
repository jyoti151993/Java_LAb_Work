package utils;
import static customer.details.Customer.sdf;

import java.util.ArrayList;

import java.lang.Exception;
import java.text.ParseException;

import customer.details.PlanType;
import customer.details.Customer;



public class CollectionUtils {

public static ArrayList populateList() throws ParseException {
	
	ArrayList<Customer> customer = new ArrayList<>(100);
	// empty Al
	//String name, String email, String password, double registrationAmt, Date dateOfBirth,PlanType plan
	customer.add(new Customer("Jaya","jaya12@gmail.com","jaya@5050",500.0,sdf.parse("1995-Jan-24"),PlanType.DIAMOND));
	customer.add(new Customer("Monita","monita432@yahoo.com","moni@2020",500.0,sdf.parse("1997-Jul-28"),PlanType.SILVER));
	customer.add(new Customer("Anshika","ansh450@gmail.com","ans@2022",500.0,sdf.parse("2000-May-15"),PlanType.GOLD));
	customer.add(new Customer("Anam","anam12@gmail.com","naina#5050",500.0,sdf.parse("1998-Aug-20"),PlanType.PLATINUM));
	customer.add(new Customer("Jayesh","jash45@gmail.com","jay#2022",500.0,sdf.parse("1993-Jan-25"),PlanType.DIAMOND));
	
	return customer;
	
}



}
