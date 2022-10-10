package utils;
import static java.time.LocalDate.parse;

import java.text.ParseException;
import java.util.HashMap;

import customer.details.Customer;
import customer.details.PlanType;

public class CollectionUtils {

public static HashMap<String,Customer> populateMap() throws ParseException {
	
	HashMap<String,Customer> map = new HashMap<>();// size=0; capacity=16; loadfactor=.75
	// empty HashMap
	//String name, String email, String password, double registrationAmt, Date dateOfBirth,PlanType plan
	System.out.println("Added "+map.put("jaya20@gmail.com",new Customer("Jaya Kumari", "jaya20@gmail.com", "secret@123", 7000.0,
			parse("1994-04-20"), PlanType.DIAMOND)));

	
	System.out.println("Added "+map.put("mohit24@gmail.com",new Customer("Mohit Srivastava", "mohit24@gmail.com", "Cool_dude$123", 3000.0,
			parse("1998-07-24"), PlanType.SILVER)));
	
	System.out.println("Added "+map.put("nats25@gmail.com",new Customer("Natasha Kaur", "nats25@gmail.com", "dreamy#321", 10000.0,
			parse("1996-04-19"), PlanType.PLATINUM)));
	
	System.out.println("Added "+map.put("anam_mystery@yahoo.com",new Customer("Anam Singh", "anam_mystery@yahoo.com", "secret@5050", 5000.0,
			parse("1993-08-30"), PlanType.GOLD)));
	
	System.out.println("Added "+map.put("samswt@gmail.com",new Customer("Sambhavi kaushik", "samswt@gmail.com", "power!123", 7000.0,
			parse("1994-04-19"), PlanType.DIAMOND)));
	
	System.out.println("Size of the map  "+map.size());
	
	return map;
	
}



}
