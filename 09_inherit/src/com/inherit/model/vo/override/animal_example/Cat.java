package com.inherit.model.vo.override.animal_example;

import com.inherit.model.vo.override.Animal;

public class Cat extends Animal{
	
	public Cat(String name, int age, String category) {
	super(name, age, category);
	}
	
	@Override
	public String growl() {
		return "meow";
	}
}
