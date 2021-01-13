package com.complexoperator.controller;

import java.util.Scanner;

public class Operator {
//변수에 있는 값에 특정 연산을 한 후에 다시 대입하는 연산자.
	public void complexOp() {
	System.out.println("숫자 누적 연산");
	int su =100;
//	su ++; // su = su+1
//	변수 += 수 > 변수 = 변수 +수;
	su+=200;
//	System.out.println(su);
//	su+=200 > su = su +200;
//	누적합계를 계산할 수 있다.
	int total = 0;
	total += 10000; // 만원 입금하고
	total += 20000; // 이만원 입급했는데 잔고가? // total = total +20000; 이거랑 같음
			System.out.println("잔고는 "+total);
	total*=3;
			System.out.println("잔고를 세 배로! : " + total);}
	
	public void strPlus() {
		System.out.println();
//	문자열 누적 연산
		System.out.println("문자열 누적 연산");
//	문자열 + 문자열 = 결합연산
	String msg = "Hello";
	msg += "안녕하세요";
//	어? 이게되네????????????????????????????????????????????????
		System.out.println(msg);
//	그냥 결합 연산이랑 똑같아져버리는 부분이네?
//	나중에 서버로 가면
	msg += "<html>";
	msg += "<body>";
	msg += "<h1>안녕하세요</h1>";
		System.out.println(msg);}
	
	
	public void mes() {
		
		System.out.println();
		System.out.println("연속으로 메시지 입력 받고 누적하기 ");
//	사용자에게 5번 입력을 받고 입력 받은 값을 모두 출력하세요
	Scanner sc = new Scanner(System.in);
		System.out.print("메시지 입력 : ");
	String message = sc.nextLine();
		System.out.print("메시지 입력 : ");
	message += sc.nextLine();
		System.out.print("메시지 입력 : ");
	message += sc.nextLine();
		System.out.print("메시지 입력 : ");
	message += sc.nextLine();
		System.out.print("메시지 입력 : ");
	message += sc.nextLine();
	System.out.println(message);
	}
//	이렇게 문자열도 누적이 된다!!!
}
