package com.triple_operator.main;

import com.triple_operator.control.Controller;

public class Main {
// 필드 (선언 안 됨)
	
	public Main () {
		
	}
//	생성자(위)
	
//	메소드(아래)
	public static void main(String[] args) {
		Controller cont = new Controller();
//	cont.tripleOp(); //조건 연산자로 "10이냐? 아니냐?"를 출력
//	cont.ooah(); //우와 작다 or 에이 작다. 
//	cont.whatThe(); // 몇 살이에요 > 공부 or 취업
//	cont.go();	//KH? 코딩 or 취업
//	cont.nestedtriple(); // 중첩 삼항 연산자
	cont.bitOp(); // 비트 연산
	}

}
