package com.printer_interface.model.vo;

import com.printer_interface.common.PrintDriver;

public class SamsungPrinter implements PrintDriver {

	
	
	
	public void samsungPrint() {
		System.out.println("SAMSUNGprinter is printing");
	}

	@Override
	public void print() {
		samsungPrint();
		
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
