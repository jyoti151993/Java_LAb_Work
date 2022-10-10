package tester;
import com.app.org.*;

import java.util.*;
public class TestOrganization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no. of employee to hire"); 
		Emp[] employees = new Emp [sc.nextInt()]; //1 array object created in heap
		boolean exit=false;
		int counter=0;
		while(!exit)
		{
			System.out.println("Option 1. Hire Manager"+ "Option 2. Hire Workers "+"Option 3. Display employee information"+"Option 4.Update basic salary"+"Option 5.Exit");
			System.out.println("Enter option");
		switch(sc.nextInt())	
		{
		case 1:
			//validate
			if (counter<employees.length)
			{
				System.out.println("Enter the Manager details : name, deptId, basic,performanceBonus");
				employees[counter++]=new Mgr(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble()); //up casting Emp---->Mgr
			}
			else
			{
				System.out.println("Hiring is over now");
			}
		break;
		
		case 2:
			//validate
			if (counter<employees.length)
			{
				System.out.println("Enter the Worker details : name,deptId, basic,hoursWorked, hourlyRate");
				employees[counter++]=new Worker(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()); //up casting Emp---->Worker
			}
			else {
				System.out.println("Hiring is over now");
			}
			
			break;	
		case 3:
			for (Emp e : employees)
			if (e != null)
			{
				System.out.println(e+"Net salary"+e.computeNetSalary());
		        if (e instanceof Mgr)	
		        {
		        	 ((Mgr)e).getPerformanceBonus();
		        	System.out.println();
		        }
		        else
		        {
		        	 ((Worker)e).getHourlyRate();
		        }
			}
		        else
		        {
		        	System.out.println("Invalid id!!!!!!!!");
		        }

		break;
		
		case 4:
			System.out.println("Enter the employee id");
		
			int index = sc.nextInt()-1;
			if (index >= 0 && index < counter)
			{
			System.out.println("Enter the amount to be incremented");
			double b =sc.nextDouble();
			employees[index].incSalary(b);
			System.out.println("Basic Salary post increment "+employees[index].getBasic());
			System.out.println("Net Salary post Increment " +employees[index].computeNetSalary());
			}
			else
			{
				System.out.println("Invalid Id !!!!!!!!!!!!!!!!!!!!!!!");
			}
			break;
		
	
		case 5:
			 exit=true;
			break;
			
			default:  
				
				break;
		}
			
			
		}
		
		
	}
}


