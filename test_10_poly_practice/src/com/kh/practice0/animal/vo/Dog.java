package com.kh.practice0.animal.vo;

public class Dog extends Animal{
	
	public Dog(String sort, String name, int age, int legs) {
		super(sort, name, age, legs);
		// TODO Auto-generated constructor stub
	}

	public void dogGrowl() {
		System.out.println("bowwow");
	}
	@Override
	public void growl() {
		System.out.println("bowow");
	}
}
//bark 오버라이