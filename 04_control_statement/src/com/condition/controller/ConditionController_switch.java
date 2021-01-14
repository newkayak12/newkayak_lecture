package com.condition.controller;

import java.util.Scanner;

public class ConditionController_switch {

//	switch활용하기
	Scanner scn = new Scanner(System.in);
	
	public void switchTest( ) {
//		switch 문은 조건문으로 예상의 되는 값에 따라 분기처리를 하는 방식이다.
//		동등비교를 실행함
			System.out.println("============= MENU =============");
			System.out.println( " 1. Pasta");
			System.out.println( " 2. Sandwich");
			System.out.println( " 3. Pizza");
			System.out.println( " 4. Fried chicken");
		int choice = scn.nextInt();
			
			switch (choice) {
			
				case 1 : System.out.println("Italian");
						break;
				case 2 : System.out.println("American");
						break;
				case 3 : System.out.println("Italian Food");
						break;
				case 4 : System.out.println("American Food");
						break;
				default : System.out.println("please choose number in menu ");
						break;
//			중괄호 안에 있으면 최대한 들여쓰기로 깔끔하게!!
			}
	}
	
//	case에 붙어야하는 것들이 많으면 차라리 if로 하는게 나을 수도 있어 아니면 그냥 case별로 메소드를 호출하는 것도 좋지
//	switch ( A )  /  A 안에 들어갈 수 있는 값은? (변수의 타입은?)
//				> 정수/ 문자열 / 문자(char)
//	String name = "pasta";
//	switch (name) {
//	case "pasta" : ~~~ break; 
//	}
//	> 가능해 이런 기괴한 짓도 
	
	
	
////////////////////
	
	
////////////////////
	
	public void swch() {
//		int su =100;
//			switch(su>50) {
//				case true : break;
//				case false : break;
//			}
//	}
// boolean은 불가능!

//		double dnum =3.14;
//		
//			switch(dnum) {
//			
//			}
	
// 소수점도 불가능 
		
		
//		다시 정리하면 문자, 정수, 문자열 만 들어갈 수 있다 조건에
//		boolean, 실수형도 안 된다.
}
	
	
//	> 남은 switch에서 배울 것 
//	break;
	

}
