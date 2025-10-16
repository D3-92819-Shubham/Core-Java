package domain;

import java.util.Objects;

public class Book implements Comparable<Book>{
   
   private int bId;
   private String name;
   private double price;
   private String authorName;
   private int quantity;
   
   
   public Book() {

	}


public int getbId() {
	return bId;
}


public void setbId(int bId) {
	this.bId = bId;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public String getAuthorName() {
	return authorName;
}


public void setAuthorName(String authorName) {
	this.authorName = authorName;
}

@Override
	public int compareTo(Book o) {
		return this.getbId() - o.getbId();
	}


public int getQuantity() {
	return quantity;
}


public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public Book(int bId, String name, double price, String authorName, int quantity) {

	this.bId = bId;
	this.name = name;
	this.price = price;
	this.authorName = authorName;
	this.quantity = quantity;
}




@Override
public String toString() {
	return String.format("Book [bId=%s,   name=%s,               price=%s,     authorName=%s,      quantity=%s]", bId, name, price, authorName,
			quantity);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;

	Book other = (Book) obj;
	return this.getbId() == other.getbId();
}





    
   
}
