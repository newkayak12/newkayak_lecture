package com.kh.practice1.rectangle;

import com.kh.practice1.model.Shape;

public class Rectangle extends Shape{
	private int width, height;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public String draw() {
		String value = "가로\t세로\t넓이\n";
		value += width+"\t"+height+"\t"+(width*height)+"\t"+(width+height)*2;
		return value;
	}
}
