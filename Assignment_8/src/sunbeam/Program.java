package sunbeam;

import domain.*;
import utils.ReverseOrder;
import utils.SortByBookName;
import utils.SortByPrice;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class Program {
	
	public static Scanner sc = new Scanner(System.in);
	private static ArrayList<Book> bookList = new ArrayList<>();
	
	private static void getInstance() {
		Collections.addAll(bookList, 
			    new Book(1, "The Alchemist", 493.23, "Paulo Coelho", 10),
			    new Book(2, "The Archer", 723.53, "Paulo Coelho", 7),
			    new Book(3, "The Fountainhead", 652.73, "Ayn Rand", 12),
			    new Book(4, "Atlas Shrugged", 872.94, "Ayn Rand", 8),
			    new Book(5, "Harry Potter and the Sorcerer's Stone", 423.68, "J.K. Rowling", 20)
//			    new Book(6, "The Lord of the Rings", 621.53, "J.R.R. Tolkien", 15),
//			    new Book(7, "To Kill a Mockingbird", 512.35, "Harper Lee", 9),
//			    new Book(8, "1984", 398.45, "George Orwell", 14),
//			    new Book(9, "Pride and Prejudice", 455.90, "Jane Austen", 11),
//			    new Book(10, "The Great Gatsby", 589.75, "F. Scott Fitzgerald", 6)
			 );

	}
	
	 
	private static void addNewBook() {
		Book newBook = new Book();
		System.out.println("Enter Book Data...");
		
		System.out.print("Enter book id : ");
		newBook.setbId(sc.nextInt());
		sc.nextLine();
		
		boolean isPresent = bookList.contains(newBook);
		
		if (isPresent) {
			System.out.println("this id already exits");
			return;
		}
		
		System.out.print("Enter book name : ");
		newBook.setName(sc.nextLine());
	
		System.out.print("Enter book Price : ");
		newBook.setPrice(sc.nextDouble());
		
		sc.nextLine();
	
		System.out.print("Enter book Authors name : ");
		newBook.setAuthorName(sc.nextLine());
		
		System.out.print("Enter book Authors Quantity : ");
		newBook.setQuantity(sc.nextInt());
	
		bookList.add(newBook);
	}
	
	private static void displayAllBook() {
		for (Book b : bookList) {
			System.out.println(b.toString());
		}
		
	}
	
	private static void displayAllBookForwardOrder() {
		Comparator<Book> comparator = new SortByBookName();
		Collections.sort(bookList, comparator);
        displayAllBook();
		
	}
	
	private static void displayAllBookReverseOrder() {
		Collections.sort(bookList, new ReverseOrder());
		displayAllBook();
	}
	
	private static void deleteBookByIndex() {
		System.out.print("Enter id of book that you want to delete : ");
		int id = sc.nextInt();
		
		Book key = new Book();
		key.setbId(id);
		
		int index = bookList.indexOf(key);
		if (index != -1) {
			bookList.remove(key);
		}
		else {
			System.out.println("Book not found");
		}
		
	}
	
	private static void sortByPriceDesc() {
		Collections.sort(bookList, new SortByPrice());
		displayAllBook();
	}
	
	public static int menuList() {
		
		System.out.println("0.Exit");
		System.out.println("1.Add new book in list");
		System.out.println("2.Display all books in forward order");
		System.out.println("3.Display all books in reverse order");
		System.out.println("4.Delete a book at given index.");
		System.out.println("5.Sort all books by price in desc order");
		System.out.println("6. Display All book");
		System.out.println("Enter the choice : ");
		return sc.nextInt(); 
	}
  
public static void main(String[] args) {
	getInstance();
	 int choice;

	 while ((choice = menuList()) != 0) {
    
	switch (choice) {
		case 1:
			   addNewBook();  
			break;
			
		case 2: 
			displayAllBookForwardOrder();
			break;
			
		case 3:
			displayAllBookReverseOrder();
			break;
			
		case 4: 
			 deleteBookByIndex();
			 break;
			 
		case 5:
			 sortByPriceDesc();
			 break;
			
		case 6: 
			   displayAllBook();
			   break;

		default:
			break;
		}
	 }
}





}
