package com.obj.controller;

public class BasicObjTest { // 클래스 선언부
// 접근제한자 클래스(예약어) 클래스 이름 {}

	
	
	
//	클래스 내부에는 필드(멤버변수) > 데이터 저장 (생략 가능)
//				생성자		> 클래스를 인스턴스화 시킬 때 실행하는 것, 객체로 생성할 때 사용 (생략하면 안되는 부분이라 JVM이 자동생성해줌)
//				메소드 		> 기능/동작 등이 포함된다. 이 객체의 역할에 따라 달라진다. (생략 가능)
//					가 들어간다. 
	
	
	DefaultTest dt = new DefaultTest();
//	 얘는 같은 패키지 내부에 있어서 default든 뭐든 사용 가능하다.
	public void fieldTest() {
		FieldTest ft = new FieldTest();
		System.out.println(ft.name);
		System.out.println(ft.age);
//		System.out.println(ft.email;);
//		private라
//		The field FieldTest.email is not visible
//		에러 출력
//		결국 얘는 (private)는 결국 선언한 클래스에서만 사용할 수 있다는 것을 알 수 있다.
	}
}
