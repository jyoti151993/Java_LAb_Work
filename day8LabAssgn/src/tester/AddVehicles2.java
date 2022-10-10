package tester;
import static string_date.Vehicle.sdf;
import java.text.ParseException;

/*
 * Accept complete vehicle details from the user (for 2 vehicles), display them
 * Display same or differents(based upon equals)
 * 
 */
import java.util.Scanner;

import string_date.Vehicle;

public class AddVehicles2 {

	public static void main(String[] args) throws ParseException {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the 1st vehicles details: chasisNo, model,price,Manufacturedate yy-MMM-dd");
			Vehicle v1=new Vehicle(sc.next(),sc.next(),sc.nextDouble(),sdf.parse(sc.next()));
			System.out.println("Enter the 2nd vehicles details: chasisNo, model,price,Manufacturedate yy-MMM-dd");
			Vehicle v2=new Vehicle(sc.next(),sc.next(),sc.nextDouble(),sdf.parse(sc.next()));
			System.out.println(v1.equals(v2));
		System.out.println("1st vehicle"+v1);
		}
		System.out.println("main over.....");

	}

}
