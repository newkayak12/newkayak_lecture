package com.printer_interface.main;

import com.interface_practice.common.MakeBurger;
import com.printer_interface.common.PrintDriveObj;
import com.printer_interface.common.PrintDriver;
import com.printer_interface.controller.PrintController;
import com.printer_interface.model.vo.CannonPrinter;

public class Main {

	public static void main(String[] args) {
		
		new PrintController(new CannonPrinter()).print();
		
		MakeBurger  maker = new CannonPrinter();
		PrintDriveObj printobj = new CannonPrinter();
		PrintDriver printpo = new CannonPrinter();
		
		
//		캐논도 들어가고 ..... 객체를 지금 여러 개 받고 있는데 
		
//		왜??? 가능할까???
		
		
		PrintDriver prin = new PrintDriver(){

			@Override
			public void makeBurger() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void infoBurger() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void scan() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		
		PrintDriveObj obj = new PrintDriveObj() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
