package com.kh.practice1.controller;

import com.kh.practice1.circle.Circle;
import com.kh.practice1.model.Shape;
import com.kh.practice1.rectangle.Rectangle;

public class Controller {
	public static void main(String [] args) {
		Circle[] circle = new Circle[3];
		Rectangle[] rectangle = new Rectangle[3];
		for(int i=0; i<circle.length; i++) {
			circle[i]= new Circle(i+1);
			rectangle[i]= new Rectangle(i+1,i+1);
			
			circle[i].draw();
			rectangle[i].draw();
		}
		
		
		
		
		Shape[] shape = new Shape[3];
		for(int i=0; i<shape.length; i++) {
			shape[i] = new Circle(i+1);
			System.out.println(( (Circle) shape[i]).draw());
			shape[i] = new Rectangle(i+1,i+1);
			System.out.println(( (Rectangle) shape[i]).draw());
		}
	}
	
	
}
