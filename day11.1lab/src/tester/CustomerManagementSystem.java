package tester;

import static utils.ValidationRules.*;

import java.text.ParseException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

import static customer.details.Customer.sdf;
import customer.details.Customer;
import customer.details.PlanType;
import customer.exception.CustomerHandlingExceptions;

import static utils.CollectionUtils.populateList;
import java.util.Iterator;

public class CustomerManagementSystem {

	public static void main(String[] args) throws ParseException {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Customer> customerList = populateList();
			boolean exit = false;
			// ini
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
					switch (sc.nextInt()) {

					case 1:
						System.out.println("Select PlanTypes : " + Arrays.toString(PlanType.values()));
						System.out.println("Enter the email id");
						String mail=checkForDupEmail(sc.next(),customerList);
						System.out.println("Enter the Customer's Details-->Name,Email-Id,Password,Registration_Amount:,DateOfBirth:yyyy-MMM-dd and Plantype");
						Customer newCus = new Customer(sc.next(), mail,validatePassword(sc.next()), sc.nextDouble(), sdf.parse(sc.next()), PlanType.valueOf(sc.next().toUpperCase()));
						System.out.println("Register Customer " +customerList.add(newCus));
				           break;

					case 2:
						System.out.println("Customer Info explicitly with iterator...");
//				for(Customer c :cx)
//				if(c!=null)
//				 System.out.println(c);
						Iterator<Customer> itr = customerList.iterator();
						while (itr.hasNext())
							System.out.println(itr.next());

						break;

					case 3:
						System.out.println("Customer Login credentials: ");
						System.out.println("Enter the email Id and Password");
                        System.out.println(lookByEmailAndPassword(sc.next(),sc.next(),customerList));
                        System.out.println(">>Successfully Loggedin<<");
						break;
						
					case 4:System.out.println("Change the password...");
						System.out.println("Enter the  Email_Id & old_password");
				       String email=checkForDupEmail(sc.next(), customerList);
				       String old_pass=validatePassword(sc.next());
				       System.out.println("Enter the new password.. ");
					    String new_pass=validatePassword(sc.next());
					  for(Customer c :customerList)
                        if(c.getPassword()!=null)
                        	c.setPassword(new_pass);
					      System.out.println("Password Updated..........");
                      break;
                    
					case 5:
						System.out.println("Enter the emailId and Password ");
						System.out.println("Does the Customer got Unscubscribed ? "+customerList.remove(lookByEmailAndPassword(sc.next(),sc.next(),customerList)));
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
