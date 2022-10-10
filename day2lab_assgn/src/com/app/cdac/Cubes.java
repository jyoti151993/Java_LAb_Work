package com.app.cdac;
public class Cubes
{
	//tight encapsulation by using private access specifier(private state or data members)
		// instance vars (non static) : mem allocated on the heap , upon obj creation
  private double side;


      //add parameterized constructor to initialize state of the cube
		//s : method local vars: mem allocated on the stack
  public Cubes( double s)
   {
	  side=s;
   }
// method declaration(method to return string form of box dims) business logic methods
		public String getCubeDims()
		{
			//this keyword is optional
			// this is a current obj ref.
		return "CubeDim is"+" "+this.side;
		}
// method to compute the volume
		public double computeVolume()
		{
			return side*side*side;
		}
}
		