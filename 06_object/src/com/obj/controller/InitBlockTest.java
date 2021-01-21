package com.obj.controller;

public class InitBlockTest {
	
	
//	원래는 private로 하는데 ....
	public String name;
	public int age;
	public double height;
	public final String email;
	public static String address;
//	
	
	public static String don;
	
//	초기화 블럭 사용
//	필드(멤버변수)의 초기값을 세팅
//	여기에서는 연산자를 사용할 수 있다.
//	메소드를 호출해서 값을 지정할 수 있다.
	{
		System.out.println("initianlize");
		name = "김상현";
		age = 29;
		height = 170.1;
		email="newkayak12@gmail.com";
		don = "donggyu kawai";
//		static초기화 가능?? 가능
	}
	
	
	// static 초기화 블록
//	static으로 선언된 변수를 초기화 활 때 사용한다.
	static {
		System.out.println("static initialize");
		address ="hey";
//		name="유병승";
		
//		Cannot make a static reference to the non-static field name
//		순서가 static > heap이니까
//		순서상 접근이 불가능하다. 
//		따라서 static 필드만 초기화가 가능하다. 
//		일반 필드는 초기화를 하지 못한다. 
		
		
	}
	
	public InitBlockTest() {
		
	}
}
