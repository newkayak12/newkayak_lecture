package com.kh.run;

import java.util.ArrayList;// call ArrayList class
import java.util.Date; // call Date class

public class FirstMyObject {
//자바 프로젝트가 실행이 되려면 
//반드시 한 개의 public static void main( String[]  args )메소드가 존재해야한다.  
	public static void main ( String[] args ) {
//프로젝트를 실행시키려면 main()메소드를 찾아서 실행한다. 		
		System.out.println( " Hello Rclass!" );
		
		// String, System = 클래스; 대문자를 클래스에만 쓰는 이유가 여기서 나오지요
		
		// call external class and print date
		System.out.println(new Date());
		
	}
	
}
