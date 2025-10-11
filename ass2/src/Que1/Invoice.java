package Que1;

public class Invoice {

	private String partno;
	private String partdesc;
	private int quantity ;
	private double price;		
	
	public Invoice()
	{
		
	}
	
	
	public Invoice(String partno, String partdesc, int quantity, double price) {
	
		this.partno = partno;
		this.partdesc = partdesc;
		this.quantity = quantity;
		this.price = price;
	}


	public String getPartno() {
		return partno;
	}


	public void setPartno(String partno) {
		this.partno = partno;
	}


	public String getPartdesc() {
		return partdesc;
	}


	public void setPartdesc(String partdesc) {
		this.partdesc = partdesc;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
}
