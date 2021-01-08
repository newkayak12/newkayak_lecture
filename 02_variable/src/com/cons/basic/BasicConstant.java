package com.cons.basic;

public class BasicConstant {

	public static void main ( String [] args ) {
		final String admin;
		admin = "master";
		System.out.println(admin);
//		admin ="slave";
//		final로 선언했기 때문에 첫번째 대입 이후 수정이 불가능 하다
		System.out.println(admin);
	}
}

//프로젝트를 새로 생성해서 com.homework.main패키지를 만들고 homework클래스에 나이, 성명, 주소, 성별, 키, 몸무게를 변수에 저장하고 출력 
