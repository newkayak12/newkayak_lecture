package com.obj.controller;

public class Animal {
	String type, name, gen, live;
	int age, leg; 
	public Animal(String type, String name, String live, String gen, int age, int leg ) {
		this.type=type;
		this.name=name;
		this.gen=gen;
		this.live=live;
		this.age=age;
		this.leg=leg;
		
		System.out.println("type : " + type);
		System.out.println("name : " + name);
		System.out.println("gen : " + gen);
		System.out.println("live in : " + live);
		System.out.println("age : " + age);
		System.out.println("legs : " + leg);		
	}
}
