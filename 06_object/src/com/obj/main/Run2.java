package com.obj.main;

import com.obj.controller.*;

public class Run2 {

	public static void main(String[] args) {
		FunctionalTest fnct = new FunctionalTest();
//		객체는 무조건 만들어 놓고 사용해야한다.
		
//		System.out.println("result = "+ fnct.calcul1());
		
// 		멤버 변수/생성자/타입은 > 무조건 객체를 만들어야(할당해야 = new 연산자로 생성해야한다.)
//		static이 붙은 멤버 변수는 '클래스 변수'라고 한다.
//		그냥 접근 할 수 있고, 메모리에 탑재되는 층위도 다르니까
		
//		double result = new FunctionalTest();
//		이것은 double result = FunctionalTest().result;
//		
//		반환한 값으 변수에 저장할 수도 있다.
		
		
//		System.out.println(fnct.calcul1());
		
//		return이 있는 녀석을 응용
		
//		double r = fnct.calcul1()+300;
		
//		가능하지 fnct.calcu1()는 그냥 값을 반환하는 거니까!
		
		
		
		
		
//		매개변수 있는 메소드를 호출...
		
//		fnct.calc2(10, '+', 20);
		
//		이렇게 쓰면 Scanner를 여기서 만들어야겠지??? 매개 변수를 안 넣어주면 안되는거니까...
		
//		fnct.calc2(20, 0, 0);
		
//		이렇게 부족하게 입력하면 안되니까...
//		호출할 때에는 (매개 변수를 있는 매소드를)
//		반드시 선언된 매개변수 값을 모두 전달해야한다.
		
		
//		double result = fnct.calc2(10, '*', 10);
		
//		Type mismatch: cannot convert from void to double
//		void 값을 double로 넣으려고 하니까...
		
//		System.out.println(fnct.calc2(10, '/', 10));
//		The method println(boolean) in the type PrintStream is not applicable for the arguments (void)
//		void로 overload된 println이 없으니까.
		
//		fnct.calc3();

		System.gc();
		
		double res = fnct.calc4(20, 40, '*');
			System.out.println(res);
			System.out.println("계산 결과 : " +  fnct.calc4(20, 20, '/'));
			
			
			
			
	}

}
