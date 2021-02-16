package com.generic.model.vo;

import java.util.Objects;

public class Person {

	private String name, address;
	private int age;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}


	public Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}


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


	public void setAge(int age) {
		this.age = age;
	}
	
//	@Override
//	public String toString() {
//		return name+" "+age+" "+address;
//	}
	@Override
	public int hashCode() {
		return Objects.hash(name,age,address);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		
		if(obj instanceof Person) {
			Person other = (Person) obj;
			
			if( (name.equals(other.name)&&(age==other.age)&& (address.equals(other.address)))){
				return true;
			}
		}
		
		return false;
	}
}
