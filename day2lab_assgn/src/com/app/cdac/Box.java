package com.app.cdac;
public class Box
{
	//tight encapsulation by using private access specifier(private state or data members)
		// instance vars (non static) : beb allocated on the heap , upon obj creation
  private double length;
  private double height;
  private double depth;

      //add parameterized constructor to initialize state of the box
		//l,h, depth : method local vars: mem allocated on the stack
  public Box( double l,double h,double depth)
   {
	  length=l;
	  height=h;
	  //depth=depth; here depth which is the method local variable 
		//shadows the actual instance variable thus wrong output is shown
	//To unhide , instance variables from method local variables.(to resolve the conflict or ambiguity problem)
	  this.depth=depth;  
   }
// method declaration(method to return string form of box dims) business logic methods
		public String getBoxDims()
		{
			//this keyword is optional
			// this is a current obj ref.
		return "BoxDim is"+this.length+" "+this.height+" "+this.depth;
		}
// method to compute the volume
		public double computeVolume()
		{
			return length*height*depth;
		}
		public char[] Compare(Box b2) {
			// TODO Auto-generated method stub
			return null;
		}
}
		