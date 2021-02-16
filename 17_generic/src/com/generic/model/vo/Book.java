package com.generic.model.vo;

public class Book {
	
	private String title, author;
	private int price;
	private double discount;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	
	public Book(String title, String author, int price, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.discount = discount;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		return title+" "+author+" "+price+" "+discount;
	}
	
	
	
}
