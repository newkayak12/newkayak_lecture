package com.printer_interface.common;

import com.interface_practice.common.MakeBurger;

public interface PrintDriver extends MakeBurger {
	
	 void print();
	 
	 void scan();
	 
	 default void copy() {
		 System.out.println("copy...");
	 }
	 //예외적으로 default메소드를 선언할 수 있다.(java8부터 지원)
	
	 
//	 인터페이스는 상속이 가능하다. 인터페이스끼리 가능
	 
	
}
