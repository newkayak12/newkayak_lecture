package com.api.controller;

public class WrapperTest {
	public static void main(String[] args) {
		int age = 19;
		Integer ageobj = age;
//		boxing 기본 자료형을 객체화
		
		int unboxing = ageobj;
//		unboxing 객체를 기본 자료형화
		
		
		test(age);
//		Boxing
//		이럴 때는 상속일 때 뺴고는 안되는데, Integer가 object를 상속했고 primitve type을 boxing 했기 때문
		
		age = Integer.parseInt("3");
//		parseInt는 웹에서 굉장히 많이 쓰실거예요.
		
		test(age);
		
		
		
		boolean flag = true;
		Boolean flagObjExample = flag;
			System.out.println("Boolean : "+ flagObjExample);
		Boolean flagObj = Boolean.parseBoolean("false");
		
		test("boolean : "+flag);
		
		
		
		double weight = 65.5;
		Double weightObj = weight;
			System.out.println(weightObj);
		weightObj = Double.parseDouble("185.5");
		
		test("double : "+ weightObj);
		
		
		
		
	}
	
	
	
	public static void test(Object obj)	{
		System.out.println(obj instanceof Integer);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(obj);
//		Integer는  직접접근이 가능하다. 
//		int 는 기본자료형이라 직접접근이 X
		
		
	}
	
//	또 우리가 많이 쓰는 것은 문자열을 기본 자료형으로 변환하는 메소드 parseInt 
	
}
