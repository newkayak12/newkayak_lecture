package com.poly.abstracttest.animal;

import com.poly.abstracttest.vo.Animal;

public class Bird extends Animal {
	public Bird(String name, String category,  int age, int legs) {
		super(category, name, age, legs);
	}
	
	public String birdGrowl() {
		return "cook-a-doodle-do";
	}
	
	@Override
	public String growl() {
		return birdGrowl();
	}

}
