package tester;
import static utils.EmpIdValidationRules.validateId;

import java.util.Scanner;
public class TestCustomException extends Exception {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the EmpID for validation");
			validateId(sc.nextInt());
			System.out.println("Eligible for Increment");
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		System.out.println("Thankyou");	
		}
				
		// TODO Auto-generated method stub

	}


