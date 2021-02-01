package com.poly.abstracttest.animal;

import com.poly.abstracttest.vo.Animal;

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
//	The type Monkey must implement the inherited abstract method Animal.growl()
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
