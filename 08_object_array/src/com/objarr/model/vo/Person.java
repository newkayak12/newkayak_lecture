package com.objarr.model.vo;

public class Person {
	private String name,gen,pNum;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age, String gen, String pNum) {
		this.name = name;
		this.age = age;
		this.gen = gen;
		this.pNum = pNum;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getpNum() {
		return pNum;
	}
	public void setpNum(String pNum) {
		this.pNum = pNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
		@Override
		public String toString() {
			
			
			return " " + name +" " + age+" " +gen+" " +pNum;
		}
	
}
