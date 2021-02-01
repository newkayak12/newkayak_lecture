package com.poly.dynamicbinding.model;

import com.poly.dynamicbinding.vo.Animal;

public class Monkey extends Animal{
	public Monkey() {
		super();
	}
	
	public Monkey(String name, String category, int age, int legs) {
		super(category, name,  age, legs);
	}
	
	
	
	public String monkeyGrowl() {
		
		return "kikikik";
	}
	
	@Override
	public String growl() {
		return monkeyGrowl();
	}

	@Override
	public String toString() {
		return "Monkey [getCategory()=" + getCategory() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getLegs()=" + getLegs() + "]";
	}
	
	
}
