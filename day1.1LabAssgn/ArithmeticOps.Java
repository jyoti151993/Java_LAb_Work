
import java.util.*;
class TestScanner

{
   public static void main(String[] args)
   {
  
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first double value");
    double d1=sc.nexrDouble();
    System.out.println("Enter the first double value");
    double d2=sc.nextdouble();
    System.out.println("sum of two double nos is "+ (d1+d2));
	sc.close();
   }
}
 