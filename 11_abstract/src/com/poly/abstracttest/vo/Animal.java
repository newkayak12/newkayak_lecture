package com.poly.abstracttest.vo;

public abstract class  Animal {
//  public class Animal{
	private String category, name;
	private int age, legs;
	
	@Override
	public String toString() {
		return "Animal [category=" + category + ", name=" + name + ", age=" + age + ", legs=" + legs + "]";
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public Animal(String category, String name, int age, int legs) {
		this.category = category;
		this.name = name;
		this.age = age;
		this.legs = legs;
	}
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	
//	public String growl()	{
//		
//		return "growls";
//	}
	//자식 객체에서 재정의해서 쓰는 메소드 즉 이 녀석 자체로는 큰 의미가 없음
//	그래서 이런 애들을 추산 메소드로 만든다. 
	
	
	public abstract String growl();
	//추상메소드 선언 > 무조건 추상메소드는 추상클래스에서만 사용할 수 있다. 
}
