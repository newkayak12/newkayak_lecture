package com.obj.setter_getter;

public class Person {
	//필드
	private String name, address;
	private int age;
	private double height, weight;

	
	//생성자
	public Person() {
		
	}

	
	public Person(String name, String address, int age, double height, double weight) {
		this.name=name;
		this.address = address;
		this.age = age;
		this.height = height;
		this.weight =weight;
		
	}
//	한번에 받을 수 있는 방법은 없네 예를 들어 this.name, address = name, address;같이
	
	
	//메소드

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) throws WrongNumberException {
			if(age<0) {
					throw new WrongNumberException("wrong number");
			} else {
				this.age = age;
			}
		
		
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void inform() {
		System.out.println(name +"\n"+ age +"\n"+ address +"\n"+ height +"\n"+ weight);
	}
	
	
	
}
