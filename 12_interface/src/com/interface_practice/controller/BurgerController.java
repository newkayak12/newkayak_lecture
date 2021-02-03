package com.interface_practice.controller;

import com.interface_practice.common.MakeBurger;

public class BurgerController {
//	private BurgerDao  dao = new BurgerDao();
	private MakeBurger dao;
	
	public void makeBurger()	{
		dao.makeBurger();
	}
}
