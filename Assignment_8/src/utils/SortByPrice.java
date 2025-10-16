package utils;

import java.util.Comparator;

import domain.Book;

public class SortByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return - (Double.compare(o1.getPrice(), o2.getPrice()));
	}
  
}
