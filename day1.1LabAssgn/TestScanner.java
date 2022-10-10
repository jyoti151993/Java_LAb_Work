
import java.util.*;
class AcceptEmpDetails

{
   public static void main(String[] args)
   {
  
       Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the employee id");
       int empId = sc.nextInt();
	   System.out.println("Enter the employee name");
	   String name = sc.next();
	   System.out.println("Enter the employee salary");
	   double salary=nextDouble();
	   System.out.println("Is Employee Permanent");
	   boolean ispermanent = nextBoolean();
	   System.out.printf("EmpId : %d  Name : %s Salary :.2%f permanent status : %b,empId,name,salary,ispermanent);
       sc.close();
   }
}
 