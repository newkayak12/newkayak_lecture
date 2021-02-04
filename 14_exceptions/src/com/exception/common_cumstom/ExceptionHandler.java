package com.exception.common_cumstom;

import java.util.Scanner;

public class ExceptionHandler {

	public static void main(String[] args) {
		
		
		try {
			new ExceptionHandler().myExceptionUse();
//		Unhandled exception type CustomException
		} catch ( CustomException e ) {
				System.out.println(e.getMessage());
			e.printStackTrace();
			
			
//			암호가 다릅니다. ()-> 우리가 만든 Exception에서 매개변수로 받던 message
			
//			com.exception.common_cumstom.CustomException: 암호가 다릅니다.
//				at com.exception.common_cumstom.ExceptionHandler.myExceptionUse(ExceptionHandler.java:35)
//				at com.exception.common_cumstom.ExceptionHandler.main(ExceptionHandler.java:11)

			
//			웹에서는 throw로 던지면 survlet이 받아서 내가 지정한 페이지로 이동하게 만듦
		}
		
		
	}
	
	
	
	
	
	
	public void myExceptionUse() throws CustomException{
		Scanner scn = new Scanner(System.in);
		
			System.out.print("Enter Password : ");
		String psswd = scn.next();
			if(!psswd.equals("1234")) {
//				나의 예외를 발생
				throw new CustomException("암호가 다릅니다.");
			}
	}

}
