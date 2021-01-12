package com.operator.controller;

import java.util.Scanner;

public class OperatorTest {
//	연산자 테스트 클래스

	
//	단항 연산자 테스트
	public void snglop() {
//		 * 부정연산 : ! (진위형의 반전)
		boolean flag = true;
			System.out.println("\'!\' operator test : " + flag);
		boolean reverseFlag = !flag;
			System.out.println("\'!\' operator test : " + reverseFlag);
			System.out.println("\'!\' operator test _ !parameter : " + !flag);
			System.out.println("\'!!\' operator test _ !parameter : " + !!flag);
//	!연산은 비교연산, 논리연산의 결과를 부정할 때 많이 사용
//	메소드에서 출력하는 논리 값을 부정할 때 사용
		
//		* 증감 연산자 : ++/ -- 값을 1 더하거나 뺀다.
//		값을 기준으로 '++값'은 전위 연산, '값++'은 후위 연산이다.
//		다른 연산과 사용하면 전위, 후위 간의 차이점이 존재한다. 
System.out.println();
System.out.println("증가연산");
//		증가 연산
		int num = 10;
			System.out.println(num);
		num++; // = 10 + 1 이걸 다시 num으로 반환
			System.out.println("num++ : " + num);
		++num; // = 1 + 10 이걸 다시 num으로 반환
			System.out.println("++num : " + num);
		
		num++;
		num++;
		num++;
//		풀어서 쓰면 num +1과 같다. 혹은 num += 1;
		System.out.println();
System.out.println("감소연산");
//		감소 연산
		num--;
			System.out.println("num-- : " + num);
		num--;
		num--;
		num--;
		num--;
		num--;
		num--;
		num--;
		
		System.out.println(num);
System.out.println();
//		풀어서 쓰면 num - 1과 같다. 혹은 num -= 1;
		System.out.println("전위, 후위 연산의 차이");
//		** 전위 연산, 후위 연산의 차이**
		int num1 = 10;
		int result = num1++;
			System.out.println("num1++; : " + result);
			System.out.println("num1++;에 대한 출력이 끝난 후 num1의 값 : " + num1);
		
		num1 =10;
		result = ++num1;
			System.out.println("++num1; : " + result);
//	 	자기 자신을 1 증가 혹은 감소 시키는 연산
//		증가는 for문이나 누적 개수 등을 연산 할 때 사용한다.
	}	
	
		public void calculator() {
//		산술연산은 +, -, *, /, %(나머지)를 구하는 연산
		
//			 '+' 연산
			int num =10, num2 =20;
			System.out.println();
			System.out.println();
			System.out.println(" '+'  연산_ 변수 이용 : " + (num + num2));
			System.out.println(" '+'  연산_ 리터럴 이용 : " + (10+20));
//			 '-'연산
			System.out.println(" '-'  연산 : " + (num - num2));
//			 '*' 연산 
			System.out.println(" '*'  연산 : " + (num * num2));
//			 '/' 연산 
			System.out.println(" '/'  연산_int : " + (num / num2));
//			정수 타입이기 떄문에 소수점을 표현할 수 없어서 소수점자리는 모두 버린다. 
//			
			double dub = 10, dub2 = 20;
			System.out.println(" '/'  연산_double : " + (dub / dub2));
			double numz=5, numy=9;
			double resultz= numz/numy;
			System.out.printf(" * printf로 소수점 자리수 표현 : %.16f\n", resultz);
			int num3 =5, num4 = 9;
			double resulty = (double) num3/ num4;
			System.out.println(" *  타입 변환 : " + resulty);
//			변수 선언할 때 이러한 문제가 생기기 떄문에 최대한의 값 보장을 해줘야한다.
//			실수 많이 하는 것 : double result2 =((double) (num/num2));
//			이러면 (num/num2)계산된 값이 double로 타입 변환되는 거라 의도대로 값이 안 나올 가능성이 농후함. 

//			 '%' 연산
			int z = 13, y=4;
			System.out.println(" '%' 연산 : " +  (z%y));
			int q =5, w=9;
			System.out.println(" * 선생님의 예제 : " + q%w);
//			
		System.out.println();
		System.out.println("3의 배수를 찾아봐?");
//				* 수가 3의 배수인지 확인하기?
			for( int i =1; i<100; i++) {
				if(i%3 == 0) {
					System.out.println( i + "는 3의 배수이다.");
				}
			}
//			패턴, 규칙을 찾아서 연산을 적용하는 것 : 알고리즘!
//			
		for(int g = 1; g<=10; g++) {
			if(g%3 ==1) {
				System.out.println("front");
			} else if( g%3 == 2) {
				System.out.println( "middle" );
			} else if( g%3 == 0  ) {
				System.out.println( " end ");
				System.out.println();
			}
		}
		
//		-------------- 기본 더하기 계산기 만들기 --------------
//		OperatorTest 클래스에 ex_calculator() 메소드를 만들고 
//		두 개의 입력 받은 값을 받아 더하기 연산을 하기
		
				
		}
		
		public void ex_calculator() {
			boolean run = true;
			int fir,  sec;
			Scanner scn = new Scanner(System.in);
			do {
			System.out.print("첫 번째 값을 입력 : ");
			fir = scn.nextInt();
			System.out.print("두 번째 값을 입력 : ");
			sec = scn.nextInt();
			int result = fir + sec;
			System.out.println(fir + "+" + sec +"="  + result);
			System.out.print("다시 한 번 계산하겠습니까? y/n");
			String quit = scn.next();
			
			if(quit.equals("y")) {
				run = true;
			}else if(quit.equals("n")) {
				run =false;
				System.out.println("프로그램을 끝냅니다.");
			} 
			}while(run);
		}	
//			*비교 연산자
//			동등 비교는 '==' eg) a==b;
//			같지 않다는 '!=' eg) a!=b;
//			반환 값은 true / false (boolean형)
		
		
//		 *** 대소 비교 ****
		public void compareOp() {
//				대소 비교 연산자 / 동등 비교 연산자
//				대소 > 수의 크기를 비교
			int age=29 , age2 =27;
			boolean result = age<age2;
				System.out.println(result);
//				변수(or 리터럴) 연산자 변수(|| 리터럴)
//				산출 값은 true/false
//				중요한 건, 이 연산자가 조건이 된다는 것이지...
//				if 문의 흐름제어나 switch문에서 쓰이겠지!
			int age3 = 27;
				System.out.println(age2>age3);
				System.out.println(age2>=age3);
				
//				* 문자에 대한 대소비교는?
			char ch1 = 'A';
			char ch2 = 'C';
			boolean resultgg = ch1>ch2;
				System.out.println(resultgg);
//				된다! char타입은 숫자로 저장해주니까
//				심지어 이것도 된다.
				System.out.println('A'<'B');
				

				
			}
		
//		나이를 입력받고 19살 이상인지 확인		
		public void compareOne( ) {
			Scanner sc = new Scanner(System.in);
			int a;
				System.out.print("비교할 값을 입력하세요 : ");
				a = sc.nextInt();
			
			boolean result = a>19;
			
				if(result == true) {
					System.out.println("값이 19보다 큽니다. 성인입니다.");
				} else {
					System.out.println("값이 19보다 작습니다. 미성년자입니다.");
				}
		}
//			*** 동등 비교 ***
//		>  숫자, 문자, 문자열
		int num =20;
			public void equalIsIt() {
					System.out.println( num == 10 );
					System.out.println( num == 20 );
				Scanner scan = new Scanner ( System.in );
					System.out.println("scanner로 외부변수 받아서 비교");
					System.out.println("비교할 수를 입력해주세요");
				int comp = scan.nextInt();
					System.out.println(num == comp);
					System.out.println();
					System.out.println("char 비교 ");
				char ch1 = 'A';
					System.out.println("ch1 == \'A\' " + (ch1 == 'A'));
//				문자열은???
					System.out.println();
					System.out.println("String 비교");
				String msg = "오늘 수업은 여기까지!";
				String msg2 = "오늘 수업은 여기까지!";
				
					System.out.println("msg == msg2 " +msg == msg2);
				
				String msg3 = new String("오늘 수업은 여기까지!");
					System.out.println("msg == msg3 " +msg == msg3);
//			String은 참조 객체이기 때문에 주소 값을 비교한다. 그래서 msg와 msg3가 일치하지 않는 것이다.
//			String을 비교할 떄는 .equal(); 메소드를 사용한다.
					System.out.println("msg.equals(msg3) " +msg.equals(msg3));
//					int ls2 = msg3.hashCode();
//					int ls3 = msg.hashCode();
//					System.out.println(ls2);
//					System.out.println(ls3);
//					
		}
			
			
//		과제 : -,/,% 메소드 만들기
//			: 입력한 값이 20보다 큰지 확인하는 메소드
//			: 입력받은 값이 영어 대문자인지 확인하는 메소
	
}
