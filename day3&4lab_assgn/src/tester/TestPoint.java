package tester;
import com.acts.geometry.Point2D;
import java.util.*;

public class TestPoint {
	public static void main(String[] args) {
		
	  Scanner sc =new Scanner(System.in);
	   System.out.println("Enter x and y coordinate for p1 point : x y");
	   Point2D p1 = new Point2D(sc.nextDouble(), sc.nextDouble());
		 System.out.println("The coordinate x and y are : "+p1.show());

			System.out.println("Enter x and y coordinate for p2 point : x y"); 
          Point2D p2 =new Point2D(sc.nextDouble(), sc.nextDouble());
	      System.out.println("The coordinate x and y are : "+p2.show());
		
          System.out.println("The coordinate of the two points are Equal"+" "+p1.isEqual(p2));
sc.close();
	}
		
	
}