package com.generic.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.generic.model.vo.Book;

public class BookDao {
	
	
	public static List<Book> totalBook = new ArrayList<>();
	
	static {
		
		totalBook.add( new Book("one","유병승",10000,0.2));
		totalBook.add( new Book("two","김상현",20000,0.5));
		totalBook.add( new Book("three","이민아",30000,1.2));
		totalBook.add( new Book("four","김예진",40000,2.2));
	}

	public static List<Book> getTotalBook() {
		return totalBook;
	}
	
	
	
	
}
