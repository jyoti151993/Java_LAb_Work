package tester;
import static utils.IncrementValidationRules.validateInc;
import java.util.Scanner;

public class TestCustomException2 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner (System.in)){
			System.out.println("Enter the Incremented Salary");
			validateInc(sc.nextDouble());
			System.out.println("Valid/Correct Increment");
		}catch(Exception e) {
			e.printStackTrace();
		}
        System.out.println();
	}

	}


