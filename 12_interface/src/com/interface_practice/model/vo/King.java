package com.interface_practice.model.vo;

import com.interface_practice.common.MakeBurger;

public class King extends Burger implements MakeBurger{
	
	
	
	public King(String name, int price, int size) {
		super(name, price, size);
		
	}
	
	public void makeKingBurger() {
		System.out.println("King 's burger : " + super.getName()+ " is " + super.getPrice());
	}

	@Override
	public void makeBurger() {
		makeKingBurger();
	}

	@Override
	public void infoBurger() {
		// TODO Auto-generated method stub
		
	}
}
