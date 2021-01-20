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
	
//	private는 직접 접근을 제한함
	public void test() {
		System.out.println(email);
	}
}
