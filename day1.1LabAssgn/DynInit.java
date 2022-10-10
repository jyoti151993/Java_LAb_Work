
import java .util.*;
class ArithmeticOps

{
   public static void main(String[] args)
   {
     double d1=0;
	 double d2=0;
	Scanner sc=new Scanner(System.in)
	System.out.println("Enter the two double values ");
		sc double d1=nextdouble();
        sc double d2=nextdouble();

      boolean exit=false
	  while(!exit)
	  {
		 System.out.println("Enter the ops to performed from 1.add 2.mult 3.subs 4.div 5.quit :");
		 switch (sc.next())
		 {
		   case "add":System.out.println("add of two double is :"+d1+2);break;
		   case "mult":System.out.println("add of two double is :"+d1-d2); break;
		   
		   case "subs":System.out.println("add of two double is :"+d1*2); break;
		   
		   case "div":System.out.println("add of two double is :"+d1/d2); break;
		   case "quit":System.exit; break;
		   default:
		    System.out.println("Get Lost");
	     }
		 exit=true;
      }
	  sc.cclose();
}
}
 