package com.printer_interface.model.vo;

import com.printer_interface.common.PrintDriver;

public class HpPrinter implements PrintDriver{
	
	
	
	
	
	
	public void printHP() {
		System.out.println("HPprinter is printing");
	}

	@Override
	public void print() {
		printHP();
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void copy() {
		// TODO Auto-generated method stub
		PrintDriver.super.copy();
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
