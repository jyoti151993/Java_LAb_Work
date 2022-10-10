package com.tester;

import com.app.cdac.Custmr;
import java.util.*;

//UI : to   display customer details
class CustomerRegister
{
      public static void main(String[] args)
   {
            Scanner sc= new Scanner(System.in);
			//1. create scanner object to read i/ps 
            System.out.println("Enter the customer name, email, age and credit");
          Custmr c1;// ref. created in the stack
          c1=new Custmr();// cx type of object created in the heap area
             c1.setName(sc.next());
		     c1.setEmail(sc.next());
			 c1.setAge(sc.nextInt());
		     c1.setCredit(sc.nextDouble());
			
		   System.out.println("The new Cx name is :  "+c1.getName());
	       System.out.println("The new Cx email is : "+" "+c1.getEmail());
	       System.out.println("The new Cx age is : "+" "+c1.getAge());
		   System.out.println("The new Cx credit is : "+" "+c1.getCredit());
			
		   sc.close();	
     }

 }
