package com.inherit.model.vo.override.animal_example;

import com.inherit.model.vo.override.Animal;

public class Dog extends Animal {
	
	public Dog(String name, int age, String category) {
		super(name, age, category);
		}
	@Override
	public String growl() {
		return "bark";
	}
//	final을 사용하면 Cannot override the final method from Animal 이라고 나온다.
}
