package com.obj.model.vo;

public class Animal {

	private String sort, name;
	private int age, legs;
	private static int temp;
	//static이지만 private로 선언을 해놔서 
	
	public Animal() {
		
	}
	////////////////////////////////////////
//	public void setTemp(int temp) {
////		this.temp = temp;
//		Animal.temp = temp;
////		this는 객체를 지칭
//		
//	}
//	
////	The static field Animal.temp should be accessed in a static way > 얘는 static영역에 선언되는 부분이니까
//	
//	public int getTemp() {
//		return temp;
//	}
	////////////////////////////////////////// > 이러면 static을 사용하는 이유가 없지?? Animal.setTemp(20); 이렇게도 안되고?
	
	public static void setTemp(int temp) {
		Animal.temp = temp;
	}
	
	public static int getTemp() {
		return temp;
	}
	
	///////////////////////////////////////// > private static에 접근하려면 그 메소드도 static에 올려두는게 맞지 
//	그러면 Animal.setTemp(20); 이렇게 가능하지

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
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
	
	
}
