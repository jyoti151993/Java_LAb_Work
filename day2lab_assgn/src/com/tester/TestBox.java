package com.tester;

import com.app.cdac.Box;
import java.util.*;

//UI : accept box dims from user n display dims n computed vol
class TestBox
{
      public static void main(String[] args)
   {
   
			//1. create scanner object to read uner i/ps 
           Scanner sc= new Scanner(System.in); //here sc is a type of variable
	   //2.Accept box dims from user
	   System.out.println("Enter the box length, height and depth");
	   Box b1; // class type of ref var, method local variable , memory on stack as per the jvm
	   b1=new Box(sc.nextDouble(), sc.nextDouble(),sc.nextDouble()); //box type of object its memory allocated at heap and is ref address (ref)
	        // is stored in b1
	           //displays box dims
	       // System.out.println(b1.width); java error
	   System.out.println(b1.getBoxDims());
	   System.out.println("Volume = "+b1.computeVolume());
	    
	    Box b2 =new Box(1, 2, 3);
            System.out.println(b2.getBoxDims());
	    System.out.println("Volume = "+b2.computeVolume());
	   
	   
	  Box b3=b1; //copy of reference to object b1
	   System.out.println(b3.getBoxDims());
	   System.out.println("volume = "+b3.computeVolume());
			//b1=null  //NULL pointer exception
	    		
			sc.close();	
     }

 }
