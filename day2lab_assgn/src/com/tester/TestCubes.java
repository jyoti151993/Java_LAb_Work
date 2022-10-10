package com.tester;

import com.app.cdac.Box;
import java.util.*;

//UI : accept box dims from user n display dims n computed vol
class TestBox1
{
      public static void main(String[] args)
   {
   
			//1. create scanner object to read uner i/ps 
           Scanner sc= new Scanner(System.in); //here sc is a type of variable
	   //2.Accept box dims from user
	      System.out.println("Enter the box length,width and depth of two boxes to be compared");
	       Box b1; // class type of ref var, method local variable , memory on stack as per the jvm
	       b1=new Box(sc.nextDouble(), sc.nextDouble(),sc.nextDouble()); //box type of object its memory allocated at heap and is ref address (ref)
	        // is stored in b1
	           //displays box dims
	       // System.out.println(b1.width); java error
	          System.out.println(b1.getBoxDims());
	     Box  b2=new Box(sc.nextDouble(), sc.nextDouble(),sc.nextDouble());
		     System.out.println(b1.getBoxDims());
            System.out.println(b1.Compare(b2));
	    
	   
	   
	  
			sc.close();	
     }

 }
