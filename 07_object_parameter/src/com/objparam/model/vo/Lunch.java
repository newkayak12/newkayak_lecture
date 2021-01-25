package com.objparam.model.vo;

public class Lunch {
	
// field	
	private String category;
	private String name;
	private int price;
	private int capacity;
	
// constructor	
	public Lunch() {
	}
	
	
	public Lunch(String category, String name, int price, int capacity) {
		this.capacity = capacity;
		this.name = name;
		this.price = price;
		this.capacity = capacity;
				
	}

// method
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
