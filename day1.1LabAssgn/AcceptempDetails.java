
import java.util.*;
class IsDouble

{
   public static void main(String[] args)
   {
  
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the two double values");
       double d1 = sc.nextDouble();
	   double d2 = sc.nextDouble();
	{
	    if (sc.hasNextDouble())
			System.out.println("Invalis data type");
		else
			System.out.println("The numbers are double and their average is : " +(d1+d2)2);

       sc.close();
   }
}
 