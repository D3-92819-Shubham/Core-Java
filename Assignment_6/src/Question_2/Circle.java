package Question_2;

import java.util.Scanner;

public class Circle {

	private double myX, myY;
	private double myDiameter;
	
	
	public Circle() {
		this.myX = 0;
		this.myY = 0;
		this.myDiameter = 100;

	}
	
	public void setMyX(double myX) {
		this.myX = myX;
	}

	public void setMyY(double myY) {
		this.myY = myY;
	}

	public double getMyDiameter() {
		return myDiameter;
	}
	
	public void setMyDiameter(double diameter) throws DiameterNotNegative {
	     if (diameter < 0) throw new DiameterNotNegative();
	     this.myDiameter = diameter;
	}

	public void accpetRecord() throws DiameterNotNegative{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter myX : ");
		double x = sc.nextDouble();
		this.setMyX(x);
		
		System.out.print("Enter myY : ");
		double y = sc.nextDouble();
		this.setMyY(y);
		
		System.out.print("Enter Diameter : ");
		double dia = sc.nextDouble();
		
		if (dia < 0) throw new DiameterNotNegative();
		this.setMyDiameter(dia);
				
	}
	

	public Circle(double myX, double myY, double myDiameter) {
		this.myX = myX;
		this.myY = myY;
		this.myDiameter = myDiameter;
	}
	
	public void accessor() {
		System.out.println("myX : " + myX);
		System.out.println("myY : " + myX);
		System.out.println("myDiameter : " + myDiameter);
	}
	
	
}


 



