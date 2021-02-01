package com.interface_practice.common;

public interface MakeBurger {
	//버거 생성하는 기능을 강제하는 인터페이스
	//멤버 변수 선언이 불가능함.
	//특정한 기능이 필요한 애들한테 interface를 구현
	
	
	
//	private int count;
//	Illegal modifier for the interface field MakeBurger.count; only public, static & final are permitted
//	이렇게 선언이 불가능하다 오로지 public이랑  static final
	
	public static final int Count =100;
	//무조건 상수만 가능하다.
	String TITLE = "make burger";
//	이러면 자동으로 public static final로 선언됨
	//인터페이스는 생성이 불가능함 > 얘는 생성이 안되니 변수는 모두 static, 
	//그리고 setter/getter가 없겠지 당연히
	
	
	
	//인터페이스 내부에는 추상메소드만 선언이 가능하다.
	
	
	
	public abstract void makeBurger(); /*{
		System.out.println("implement making burger");
	} */
	//Abstract methods do not specify a body
	
	//또한 굳이 abstract로 선언하지 않아도 묵시적으로 abstract로 선언됨
	
	void infoBurger();
	
	public default void test() {
		System.out.println("test");
	}
	//역시나 default는 되는 부분이네
	
	
}
