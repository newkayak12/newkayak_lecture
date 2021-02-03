package com.printer_interface.model.vo;

import com.printer_interface.common.PrintDriver;

public class LgPrinter implements PrintDriver{

	
	
	public void lgPrint() {
		
		System.out.println("LGprinter is printing");
	}

	@Override
	public void print() {
		lgPrint();
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
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
