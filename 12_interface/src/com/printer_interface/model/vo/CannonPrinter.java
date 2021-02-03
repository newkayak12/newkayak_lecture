package com.printer_interface.model.vo;

import com.interface_practice.common.MakeBurger;
import com.printer_interface.common.PrintDriveObj;
import com.printer_interface.common.PrintDriver;

public class CannonPrinter extends PrintDriveObj implements PrintDriver, MakeBurger {

	@Override
	public void print() {
		System.out.println("Canonprinter is printing");
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
