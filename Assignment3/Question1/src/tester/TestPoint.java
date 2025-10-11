package tester;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		
		Point2D p1 = new Point2D();
		System.out.println("Enter Details of point1 :");
		System.out.print("Enter x :");
		p1.setX(x.nextInt());
		
		System.out.print("Enter y :");
		p1.setY(x.nextInt());
		
		
		Point2D p2 = new Point2D();
		System.out.println("Enter Details of point2 : ");
		System.out.print("Enter x :");
		p2.setX(x.nextInt());
		
		System.out.print("Enter y :");
		p2.setY(x.nextInt());
		
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
	
		if(p1.isEqual(p2)) {
			System.out.println("points are Same ");
		}else {
		  System.out.println("Distance between points is :"+ p1.calculateDistance(p2));
		}

	}

}
