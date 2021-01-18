package com.repeat.controller_if;

import java.util.Scanner;

public class RepeatController {
	Scanner scn = new Scanner(System.in);
	
	
//	기본 for 
	public void basicFor() {
//		for문 작성하기
//		
//		for(초기식; 조건식; 증감식) {
//			반복될 코드가 들어가는 곳
//		}
		
//		초기식 : 변수의 선언 > 반복할 때 기준이 되는 값
//		조건식 : for문이 반복될 조건 > 컴퓨터가 반복문을 중단할 수 있는 조건 > True이면 반복 / False이면 반복을 중단
//				ㄴ * 대부분 초기식에서 선언한 변수를 사용한다. 
//		증감식 : for문의 반복 횟수를 세는 곳 > 초기식에서 선언한 변수를 변경시키는 연산
		
//		안녕하세요?라는 문구를 5번 출력
//		System.out.println("안녕하세요"); 1	
//		System.out.println("안녕하세요");	2  
//		System.out.println("안녕하세요");   3
//		System.out.println("안녕하세요");    4
//		System.out.println("안녕하세요");     5
		
		
//		그럼 100번을 출력해보자.... 할 수 있음??
//		그래서! for문을 사용해서 이 명령을 처리하는 것
		
		for (int i = 1; i<=100; i++) {
			System.out.println("안녕하세요?");
		}
		
// 	System.out.println("안녕하세요"); 이렇게 말이다.
		
//		초기식으로 변수를 받고, 조건식으로 이 for를 실행시킬지 말지를 결정한다.
		
		}
///////////////////////		
		
	
////////////////////	
//	 1부터 50까지 출력하는 반복문 
	public void onetofif() {
		for (int i =1; i<=50; i++) {
			System.out.println(i);
		}
	}
////////////////////////////	
	
	
////////////////////////////
//	짝수만
	public void even() {
		System.out.println("even");
		for (int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println();
	}
///////////////////////////
// 홀수만
	public void odd() {
		System.out.println("odd");
		for ( int i=1; i<=100; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		System.out.println();
	}
	
//				or
	
	public void oddOhter( ) {
		System.out.println("odd other");
		for( int i=1; i<=100; i+=2) {
			System.out.println(i);
		}
	}
	
	public void evenOther() {
		System.out.println("even other");
		for(int i =2; i<=100; i+=2) {
			System.out.println(i);
		}
	}
// 진짜 다양하게 구성할 수 있다. 한 가지 결과를 내기 위해서 여러 가지 방법으로 생각해보고 
//	가장 좋은 코드를 골라 쓸 수 있는 연습을 좀 하는게 맞는 것 같아. 
//	 논리적으로 사고하면 더 단순하게 구성할 수도 있는거잖아
//	  내가 조금 더 생각하면 프로그램이 가벼워질 수 있다. 
	
	
//	학생 정보를 입력받아 출력하는 프로그램이 5명의 학생을 입력받아 출력
	public void classinfo( ) {
		String[] na = new String [5], ad = new String [5];
		int[] cla = new int [5], age = new int [5];
		
			for(int i=0; i<=4; i++) {
				
					System.out.print("name : ");
				na[i] = scn.next();
					System.out.print("grade : ");
				cla[i] = scn.nextInt();
					System.out.print("age :");
				age[i] = scn.nextInt();
					System.out.print("address : ");
					scn.nextLine();
				ad[i] = scn.nextLine();
			}
			System.out.println(" name | class | age | address ");
			for(int i=0; i<=4; i++) {
				System.out.printf(" %s %d %d %s\n", na[i], cla[i], age[i], ad[i]);
			}
			
	}
/////////////////////////
	
	public void triple ( ) {
//		1~50까지 짝수면 짝 홀수면 홀
		for ( int i = 1; i<=50; i++) {
			if (i%2 == 0) {
				System.out.println(i + " is " + "even");
			} else  {
				System.out.println(i + " is " + "odd");
			}
		}

	}
	
///////////////////	//
// 100부터 1까지	
	public void hundToOn() {
		for (int i= 100; i>0; i--) {
			System.out.println(i);
		}
				
	}
	
///////////////////////////////////////////////	
	
//////////////////////////////////////
//	for문 활용하기
//	for문에 초기식, 조건식, 증감식을 다 활용해야하는가?????
//	안 써도 상관은 없다.
	String msg = scn.next();
	public void fortwist( ) {
		for (; !msg.equals("0");) {
//		    초기식,              증감식 이 빠져 있다.  > 에러는 안 난다.  
			System.out.println("2");
		}
	}
	
//	무한 for 문이라고 한다 이런 경우... > 조건식이 무조건  true인 경우
	
	
	public void infiniteFor( ) {
		for (;;) {
			System.out.println("무한이다!!!");
		}
	}
//	위의 것은 진정한 무한 for 문이다..... 쓰기는 한대....
//	무한 루핑은 사실 while이 더 많이 쓰임
//	for는 정해진 숫자만큼 돌릴 때 많이 쓰고
	
	
	public void extraFor () {
//  사용자가 입력한 수 만큼 반복하는 for
		Scanner sc = new Scanner(System.in);
			System.out.print("반복하고 싶은 수를 입력하세요");
		int repeatnum = sc.nextInt();
			for( int i = 1; i<=repeatnum; i++) {
				System.out.println(i + "번 째 반복합니다.");
			}
		
// 학생 정보를 입력받아 출력하는 프로그램
//		5명에 대해서 입력받아
//		입력할 학생의 수를 입력받고 그 수 만큼 학생 정보를 입출력하는 프로그램
	
	}
	
	public void extrasec ( ) {
		System.out.print("반복할 횟수를 입력하세요 : ");
		int a = scn.nextInt();
		String[] na = new String [a], ad = new String [a];
		int[] cla = new int [a], age = new int [a];
		
			for(int i=0; i<=(a-1); i++) {
				
					System.out.print("name : ");
				na[i] = scn.next();
					System.out.print("grade : ");
				cla[i] = scn.nextInt();
					System.out.print("age :");
				age[i] = scn.nextInt();
					System.out.print("address : ");
					scn.nextLine();
				ad[i] = scn.nextLine();
			}
			System.out.println(" name | class | age | address ");
			for(int i=0; i<=a-1; i++) {
				System.out.printf(" %s %d %d %s\n", na[i], cla[i], age[i], ad[i]);
			}
	}
////////////////////////////	
//	 성적의 합계, 평균을 구해주는 프로그램 작성
//	학생 수를 입력받고 학생에 대한 국어, 영어, 수학 점수를 입력받아
//	학생수 별 하계외 평균을 구하시오
	
	public void stusco () {
			System.out.print("학생 수를 입력하시오");
		int num = scn.nextInt();
		int[] kr = new int [num],ma = new int [num],en = new int [num], result = new int [num];
		double[] avg = new double[num];
				
			for (int i = 0; i<= num-1; i++) {
					System.out.print((i+1)+"번 째 학생의 국어 성적을 입력하시오 : ");
				kr[i] = scn.nextInt();
					System.out.print((i+1)+"번 째 학생의 국어 성적을 입력하시오 : ");
				ma[i] = scn.nextInt();
					System.out.print((i+1)+"번 째 학생의 국어 성적을 입력하시오 : ");
				en[i] = scn.nextInt();
				}
			
			for ( int i = 0; i<=num-1; i++) {
				 result[i] =  kr[i] + en[i] + en[i];
				 avg[i] = (double)result[i]/3;
				 	System.out.println((i+1)+"번 째 학생의 총 점은 " + result[i]+ " 평균은 " + avg[i]);
			}
	}
///////////////////////////////	
//  이걸 생각을 못하네....
	
	public void wow( ) {
		
			System.out.println("enter : ");
		int cout = scn.nextInt();
		String name = " ";
		int age=0;
		String print = " ";
			for(int i = 1; i<=cout; i++) {
				System.out.println("name");
			name = scn.next();
				System.out.println("age");
			age = scn.nextInt();
			print += name +  " " + age + "\n";
			}
				System.out.println(print);
	}
////////////////////////////////
//	for문을 공부 할 때 생각할 법한 것?
	
//Q	변수를 선언할 때 i 값을 사용할 수 있나요?? for 문의 조건이나 초기값 같은??
	
//	for(int i=0; i<=5; i++) {
//		int변수 +i =0;
//	}
//	
//		변수명은 동적으로 선언할 수 없다. 
//	변수명은 항상 내가 고정시켜야해!
//	즉, 오로지 정적으로만 사용해야함
/////////////////////////////////////////////	
//////////////////////////////////////////////
//Q	for문 안에서 선언한 i 값을 다른 곳에서 사용할 수 있을까?
//	A	외부로 들고 나갈 수 없다. 
//Q for 내부에서 선언한 변수 바깥으로 들고 나갈 수 있나?
//	A   외부로 못 나간다.
	
	
	
	
	
//	계산기 프로그램 만들기 
//	1. 한 번만 실행
//	2. 입력한 수 만큼 쓸 수 있는 계산기
	
	
	public void calc () {
			System.out.print("how many times do you use? : ");
		int count = scn.nextInt();
			for(int i =0; i<count; i++) {
					System.out.print("first num : ");
				int num1 = scn.nextInt();
					System.out.print("operator : ");
				String op = scn.next();
					System.out.print("second num : ");
				int num2 = scn.nextInt();
					
	caclc:			switch (op) {
					
						case "+" :
							System.out.println(num1+" + "+num2+" = "+ (num1 + num2));
							break;
						case "-" :
							System.out.println(num1+" - "+num2+" = "+ (num1 - num2));
							break;
						case "*" :
							System.out.println(num1+" * "+num2+" = "+ (num1 * num2));
							break;
						case "/" :
							System.out.println(num1+" / "+num2+" = "+ (num1 / num2));
							break;
						default : 
							System.out.println("invalid operator");
							break caclc;
							
					}
			}
	}
	
	
}
