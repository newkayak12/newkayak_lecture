package com.poly.dynamicbinding.model;

import com.poly.dynamicbinding.vo.Animal;

public class Cat extends Animal {
	
	public Cat() {
		super();
	}
	
	public Cat(String name, String category, int age, int legs) {
		super(category, name,  age, legs);
	}
	
	
	public String catGrowl()	{
		return "meow";
	}
	
	@Override
	public String growl() {
		return catGrowl();
	}

	@Override
	public String toString() {
		return "Cat [getCategory()=" + getCategory() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getLegs()=" + getLegs() + "]";
	}
	
	
}
