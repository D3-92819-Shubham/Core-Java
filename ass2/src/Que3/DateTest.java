package Que3;

import java.util.*;

public class DateTest extends Date {
	
	
	public void acceptDate()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre the date: ");

		System.out.println("Enter the day: ");
		int day = sc.nextInt();
		this.setDay(day);
		
		System.out.println("Enter the month: ");
		int month = sc.nextInt();
		this.setMonth(month);
		
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		this.setYear(year);
		
	}

	public void displayDate() {
		
		System.out.printf("%d/%d/%d", this.day, this.month, this.year);
	}
	

	public static void main(String[] args) {
	
		

		
		DateTest d1 = new DateTest();
		
		d1.acceptDate();
		d1.displayDate();
		

	}

}
