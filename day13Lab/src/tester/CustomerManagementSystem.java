package tester;

import static java.time.LocalDate.parse;
import static utils.CollectionUtils.populateMap;

import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import custome.exception.CustomerHandlingExceptions;
import customer.details.Customer;
import customer.details.PlanType;

public class CustomerManagementSystem {

	public static void main(String[] args) throws ParseException {
		try (Scanner sc = new Scanner(System.in)) {
			
			HashMap<String, Customer> customerMap = populateMap();
			boolean exit = false;
			// initialisation phase
			while (!exit) {

				System.out.println("---Options---");
				System.out.println("[1] Register Customer");
				System.out.println("[2] Display details of the Registered Customers");
				System.out.println("[3] Customer Login");
				System.out.println("[4] Change password");
				System.out.println("[5] Unsubscribe customer");
				System.out.println("[6] Exit");
				System.out.println("Select the option");

				// servicing phase
				try {
					//menu based app
					switch (sc.nextInt()) {

					case 1://reg cus
						System.out.println("Available PlanTypes : " + Arrays.toString(PlanType.values()));
						System.out.println("Enter the email id");
						String email=sc.next();
						if(customerMap.containsKey(email))
							throw new CustomerHandlingExceptions("Account already exists with this email...");
						System.out.println("Enter the name, email, password, registrationAmt ,dateOfBirth(yy-mom-day) ,plan ");
							System.out.println("Added "+customerMap.put(sc.next(),new Customer(sc.next(),sc.next(),sc.next(),
									sc.nextDouble(),parse(sc.next()),PlanType.valueOf(sc.next().toUpperCase()))));
				           break;

					case 2:
						System.out.println("All registered Customers.......");
                             for(Customer c:customerMap.values())		
	                           System.out.println(c);
                             break;

					case 3:
					    System.out.println("Enter the email Id ");
					    if(customerMap.get(sc.next())==null)
					    System.out.println("Invalid Id!!!!!!!!Customer not registered yet...... ");
                      System.out.println(">>Successfully Loggedin<< "+customerMap.get(sc.next()));
						break;
						
//					case 4:System.out.println("Change the password...");
//						System.out.println("Enter the  Email_Id & old_password");
//				       String email=checkForDupEmail(sc.next(), customerList);
//				       String old_pass=validatePassword(sc.next());
//				       System.out.println("Enter the new password.. ");
//					    String new_pass=validatePassword(sc.next());
//					  for(Customer c :customerList)
//                        if(c.getPassword()!=null)
//                        	c.setPassword(new_pass);
//					      System.out.println("Password Updated..........");
                      // break;
                    
					case 5:
						System.out.println("Enter the emailId for unsubscribing ");
//						if(customerMap.remove(sc.next())==null)
//							System.out.println("Customer with this ID does not exists!!!!!!!");
//						else
						System.out.println("Removed Customer "+customerMap.remove(sc.next()));
					 break;
					
					case 6:
						exit = true;
						break;

					default:
						break;

					}

				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Invalid Input...try Again");

					sc.nextLine();
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid Input...try Again");
		}
	}

	

}
