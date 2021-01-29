package com.kh.practice0.animal.vo;

public class Monkey extends Animal{
	
	
	public Monkey(String sort, String name, int age, int legs) {
		super(sort, name, age, legs);
		// TODO Auto-generated constructor stub
	}

	public void monkeyGrowl()	{
		System.out.println("kikikikik");
	}
	@Override
	public void growl() {
		System.out.println("kikiki");
	}
}
//bark 오버라이