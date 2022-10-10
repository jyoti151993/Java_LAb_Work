package tester;
import com.app.org.*;

import static utils.IncrementValidationRules.validateInc;
import static utils.EmpIdValidationRules.validateId;

import java.util.*;
public class TestOrganization extends Exception {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total number of Employees you want to hire"); 
		Emp[] employees = new Emp [sc.nextInt()]; //1 array object created in heap
		boolean exit=false;
		int counter=0;
		while(!exit)
		{
			System.out.println("****************Option**********************");
			System.out.println("Option[1].Hire Manager");//+" "+"Option[2].Hire Workers"+" "+"Option[3].Display Employee Information"+" "+"Option[4].Update Basic_salary"+" "+"Option[5].Exit");
			System.out.println("Option[2].Hire Workers");
			System.out.println("Option[3].Display Employee Information");
			System.out.println("Option[4].Update Basic_salary");
			System.out.println("Option[5].Exit");
			System.out.println("Enter option--> ");
		switch(sc.nextInt())	
		{
		case 1:
			//validate
			if (counter<employees.length)
			{
				System.out.println("Enter the Manager details : Name, deptId, basic,performanceBonus");
				employees[counter++]=new Mgr(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble()); //up casting Emp---->Mgr
			}
			else
			{
				System.out.println("Vacancy Over!!!!!!");
			}
		break;
		
		case 2:
			//validate
			if (counter<employees.length)
			{
				System.out.println("Enter the Worker details : Name, deptId, basic,hoursWorked, hourlyRate");
				employees[counter++]=new Worker(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()); //up casting Emp---->Worker
			}
			else {
				System.out.println("Hiring Freezed!!!!");
			}
			
			break;	
		case 3:
			for (Emp e : employees)
			if (e != null)
			{
				System.out.println(e+"Net salary"+e.computeNetSalary());
		      
		    }
		break;
		
		case 4:
			try {
				System.out.println("Enter the empId ");
				int index = sc.nextInt()-1;
				validateId(index);
				System.out.println("Enter the amount to be incremented in the basic salary");
				employees[index].setIncPer(sc.nextDouble());
			   validateInc(employees[index].getBasic());
			    }catch(Exception e) {
					e.printStackTrace();
				}
			 System.out.println("End!!!!!!!");
			   
			
			
			
//			System.out.println("Enter the empID for increment and Basic Salary ");
//			int index = sc.nextInt()-1;
//	        validateId(employees[index]);
//			/*if (index>=0 && index<counter)
//			{
//			System.out.println("Enter the amount to be incremented");
//             employees[index].setBasic(sc.nextDouble());
//
//			System.out.println(employees[index].getBasic());
//		   }
//			else
//			{
//				System.out.println("Invalid Id !!!!!!!!!!!!!!!!!!!!!!!");
//			}*/
//			break;
//		
	
		case 5:
			 exit=true;
			break;
			
			default:  
				
				break;
		    }
			}

		sc.close();
		
	}
}




