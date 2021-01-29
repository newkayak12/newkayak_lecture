package com.kh.practice0.animal.vo;

public class Animal {
	protected String sort, name;
	protected int age, legs;
	public Animal(String sort, String name, int age, int legs) {
		super();
		this.sort = sort;
		this.name = name;
		this.age = age;
		this.legs = legs;
	}
	

	public void growl() {
	}
}
// 종류 이름 나이 다리 수