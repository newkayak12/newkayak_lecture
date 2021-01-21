package com.obj.controller;

public class FieldTest {
//	필드 선언하기
//    접근제한자(public, protected, (default), privat)
//		예약어
//		자료형
//		번수명 순
//	 접근제한자 예약어 자료형 변수명;
	
	public String name;
	int age;
	private String email;
//	접근제한자/예약어/자료형/변수명
	
//	private는 직접 접근을 제한함
	public void test() {
		System.out.println(email);
	}
		
//		static 변수 선언하기
	public static String nickName;
	private double height;
	
//	public final char ch;
//	final 초기화 안 하면 안 됨
//	final은 수정할 수가 없다. 
//	그리고 초기화하면 ' ' 가 들어가는데 의미가 있음??
	
//	그래서 어차피 수정도 불가능하니까 처음부터 init하라고 하는 얘기이다.
	public final char ch='A';
//	만약 생성과 같이 초기화하기 싫으면 필드 초기화블록, 생성자를 이용해서 초기화할 수 있다.
	
	public final char en;
	{
		en ='C';
	}
//	이게 초기화 블록이다. static블록 없이도 가능하네??
	
	
}
