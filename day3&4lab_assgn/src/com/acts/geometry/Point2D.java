/**
 * 
 */
package com.acts.geometry;
import static java.lang.Math.*;
public class Point2D {
	
private double x;
private double y;

 public Point2D (double x, double y)
{
   this.x=x;
   this.y=y;
}

 public String show() {
	  
	 return "x coord is "+" "+x+" "+"y coord is"+" "+y;
	 }
// public String getCoord() 
// {
//	return this.x+" "+this.y; 
// }
//  
 public boolean isEqual(Point2D p)
 {
    return (this.x==p.x && this.y==p.y);
 }
 
 public double computeDistance(Point2D p)
 { 
	 if(this.isEqual(p))
	 return 0;
	 else
		 return sqrt(pow((this.x-p.x),2) + (pow((this.y- p.y),2)));
		 
 }
 }
 
 

