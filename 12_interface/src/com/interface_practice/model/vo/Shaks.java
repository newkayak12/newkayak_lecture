package com.interface_practice.model.vo;

import com.interface_practice.common.MakeBurger;

public class Shaks extends Burger implements MakeBurger{
	
	public Shaks(String name, int price, int size) {
		super(name, price, size);
	}
	
	public void makeShaksBurger() {
		System.out.println("Shaks' burger : "+super.getName()+ " is " + super.getPrice());
	}

	@Override
	public void makeBurger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void infoBurger() {
		// TODO Auto-generated method stub
		
	}
}
