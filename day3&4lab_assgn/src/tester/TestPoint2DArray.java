package tester;
import com.acts.geometry.Point2D;
import java.util.Scanner;
public class TestPoint2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no. of points you want to plot ?");
		Point2D[] points=new Point2D [sc.nextInt()];
		
		//display the ref of the array contents
		for(Point2D p:points)
		{
			System.out.println(p);
		}
		
		for (i=0;i<points.length;i++)
		{
			System.out.println("Enter the coordinates of the point");
			points[i]=new Point2D (sc.nextDouble(), sc.nextDouble());
			
		}
		
	for(Point2D p :points) //p=points[0], p=points[1] , ...
	{
		System.out.println(p.show());
		}
	for(Point2D p:points) {
	System.out.println(p);
	System.out.println("Array class"+" "+points.getClass());
	}
	System.out.println("Enter the coordinates of the indices that you want to compare:");
//	int a= sc.nextInt();
//	int b=sc.nextInt();
	System.out.println((points[0].isEqual(points[1])? "the points are equal":"the points are not equal"));
    System.out.println((points[0].computeDistance(points[1])));
   
     sc.close();
	}

}
