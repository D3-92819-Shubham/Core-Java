package Que2;

public class Employee {

	private String fname;
	private String lname;
	private double salary;
	
	public Employee()
	{
		
	}

	public Employee(String fname, String lname, double salary) {
		
		this.fname = fname;
		this.lname = lname;
		this.salary = salary ;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
