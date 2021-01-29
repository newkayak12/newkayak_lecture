package com.kh.practice0.animal.vo;

public class Cat extends Animal {
	public Cat(String sort, String name, int age, int legs) {
		super(sort, name, age, legs);
	}
	
	public void catGrowl()	{
		System.out.println("Meow");
	}
	@Override
	public void growl() {
		System.out.println("meow");
	}
}
// bark 오버라이