package com.printer_interface.controller;

import com.printer_interface.common.PrintDriver;


public class PrintController {

//	private HpPrinter hp = new HpPrinter();
//	private LgPrinter lg = new LgPrinter();
//	private SamsungPrinter samsung = new SamsungPrinter();
	
	
	private PrintDriver print;
	
	public PrintController(PrintDriver print) {
//		이러면 PrintDriver를 구현한 녀석이 인자가 되어 들어갈 수 있다.
		
		this.print = print;
	}
	
		public void print() {
//			연결될 프린터기를 이용한 인쇄하는 기능
//			hp.printHP();
//			lg.lgPrint();
			print.print();
			print.copy();
		
			
		}
		
		
}



//이러면 얘는 독립적이네....???