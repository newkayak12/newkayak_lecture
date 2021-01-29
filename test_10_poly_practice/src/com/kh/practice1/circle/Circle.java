package com.kh.practice1.circle;

import com.kh.practice1.model.Shape;

public class Circle extends Shape{
	public double pi = Math.PI;
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		this.radius = radius;
	}
	
	public String draw() {
		String value = "반지름\t\t넓이\t\t\t둘레\n";
		value += radius+"\t"+(radius*radius*Math.PI)+"\t"+(radius*2)*Math.PI;
		return value;
	}
	
}
