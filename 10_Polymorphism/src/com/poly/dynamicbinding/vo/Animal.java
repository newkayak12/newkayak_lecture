package com.poly.dynamicbinding.vo;

public class Animal {
	private String category, name;
	private int age, legs;
	
	@Override
	public String toString() {
		return "Animal [category=" + category + ", name=" + name + ", age=" + age + ", legs=" + legs + "]";
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public Animal(String category, String name, int age, int legs) {
		this.category = category;
		this.name = name;
		this.age = age;
		this.legs = legs;
	}
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String growl()	{
		
		return "growls";
	}
	
}
