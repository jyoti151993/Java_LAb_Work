package tester;

import static customer.details.Customer.sdf;
import static utils.ValidationRules.*;

import java.util.Arrays;
import java.util.Scanner;

import customer.details.Customer;
import customer.details.PlanType;
import customerHandlingException.CustomerHandlingExceptions;

public class CustomerManagementSystem {
	
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the total no.of customer you want to register");
			Customer[] cx = new Customer[sc.nextInt()];
			boolean exit = false;
			int counter = 0;
			// initilsation phase
			while (!exit) {

				System.out.println("---Options---");
				System.out.println("[1] Register Customer");
				System.out.println("[2] Display details of the Registered Customers");
				System.out.println("[3] Link Aadhar Card for the Registered customers");
				System.out.println("[4] Exit");
				System.out.println("Select the option");

				// servicing phase of the App
				try {
					switch (sc.nextInt()) {

					case 1:
						if (counter < cx.length) {
							System.out.println("Select PlanTypes : " + Arrays.toString(PlanType.values()));
							System.out.println("Validate Email Id....");
							System.out.println(
									"Enter the Customer's Details-->Name,Email-Id,Password,Registration_Amount:,DateOfBirth:yyyy-MMM-dd and Plantype");
							Customer newCus = new Customer(sc.next(), checkDupEmail(sc.next(), cx), sc.next(),
									sc.nextDouble(), sdf.parse(sc.next()), PlanType.valueOf(sc.next().toUpperCase()));
							cx[counter++] = newCus;
						} else
							System.out.println("Registration Full!!!!!!!!!!");
						break;

					case 2:
						System.out.println("Customer Info...");
						for (Customer c : cx)
							if (c != null)
								System.out.println(c);
						break;

					case 3:
						System.out.println("Enter the email Id");
						Customer custmr=findByEmailAndPass(sc.next(),sc.next(), cx);
						System.out.println("Account Exists"+custmr);
						if (custmr.getAadhar()!= null)
							throw new CustomerHandlingExceptions("Already linked....");
						// Customer available
						System.out.println("Enter Gender, address and father's name");
						// linking the aadhar
						System.out.println(custmr.linkAadharCard(sc.next(), sc.next(), sc.next()));

						break;

					case 4:
						exit = true;
						break;

					default:
						break;

					}

				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Invalid Input...try Again");
                // readoff the pending inputs from the scanner
					sc.nextLine();
				}

			}

		}
	
	}

	
		}


