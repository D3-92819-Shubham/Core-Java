package Que2;

import java.util.*;

public class EmployeeTest extends Employee {
	
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data of Emp: ");
		
		System.out.println("Enter the First Name :-");
		String s1 = sc.nextLine();
		this.setFname(s1);
		
		
		System.out.println("Enter the Last Name:- ");
		String s2 = sc.nextLine();
		this.setLname(s2);
		
		System.out.println("Enter the salary of Emp:- ");
		double sal = sc.nextDouble();
		
		if(sal<0)
		{
			this.setSalary(0);
		}
		else
			this.setSalary(sal);
	}
	
	public void printData()
	{
		System.out.println("First Name of Emp is: "+this.getFname());
		System.out.println("Last Name of Emp is : "+this.getLname());
		System.out.println("Salary of tha emp is : "+this.getSalary());
		
	}
	
	public void raiseSal()
	{
		double sal1 = (this.getSalary() + this.getSalary() * 0.10);
		this.setSalary(sal1);
		
		System.out.println("Salary After 10% Hike is :"+this.getSalary());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EmployeeTest e1 = new EmployeeTest();
		
		e1.acceptData();
		e1.printData();
		 
		e1.raiseSal();

		
		

	}

}
