package com.vari.programstructure;

import com.vari.programstructure_func.*;
//	실행용 클래스 : 메인 메소드가 있어야함
public class Run {

	public static void main(String[] args) {

//		외부클래스에 있는 기능 이용하기
		Functional fuc =new Functional();
		
			fuc.inputData();
		
//		다른 패키지에 있는 외부 클래스 이용하기
		Functional2 fuc2 = new Functional2();
		
			fuc2.printData();
		
//		참고로 메인이랑 api랑은 다른 패키지를 사용하는 경우가 많다.
		
	}

}
