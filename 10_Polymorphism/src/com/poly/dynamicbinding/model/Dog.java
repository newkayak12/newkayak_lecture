package com.poly.dynamicbinding.model;

import com.poly.dynamicbinding.vo.Animal;

public class Dog extends Animal{
	
	public Dog() {
		super();
	}
	
	public Dog(String name, String category, int age, int legs) {
		super(category, name,  age, legs);
	}
	
	public String dogGrowl() {
		
		return "bowow";
	}
	
	
	@Override
	public String growl() {
		return dogGrowl();
	}

	@Override
	public String toString() {
		return "Dog [getCategory()=" + getCategory() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getLegs()=" + getLegs() + "]";
	}
	
	
	
	
}
