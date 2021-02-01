package com.interface_practice.model.vo;

import com.interface_practice.common.MakeBurger;

public class Mcdonals extends Burger implements MakeBurger{
	
	
	public Mcdonals() {
		// TODO Auto-generated constructor stub
	}
	 public Mcdonals(String name, int price, int size) {
		super(name, price, size);
	}
	
	public void  makeMcBurger() {
		System.out.println("Mc's burger : " + super.getName()+ " is " + super.getPrice());
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
