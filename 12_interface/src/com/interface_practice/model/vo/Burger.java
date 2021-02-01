package com.interface_practice.model.vo;

public class Burger {
	private String name;
	private int price;
	private int size;
	
	public Burger() {
		// TODO Auto-generated constructor stub
	}
	
	public Burger(String name, int price, int size) {
		this.name = name;
		this.price = price;
		this.size = size;
	}

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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
