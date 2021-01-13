package com.triple_operator.control;

import java.util.Scanner;

public class Controller {
// 이전에 대소비교나 논리 연산을 한 것이 조건으로 들어가기 시작하는 그림이 나온다!
	Scanner scn = new Scanner(System.in);
// 	필드 (위)

	public Controller() {
		
	}
//	생성자(위)
	
	
	
// 	메소드 (아래)
	public void tripleOp() {
			System.out.println("삼항 연산자 ");
			System.out.println("-----------");
//		삼항 연산자는 조건식에 의해 실행 된 구문을 결정하는 연산 
//		조건문 ? true일 때 실행 될 구문 : false일 떄 실행 될 구문;
//		
		int su = 12;
//		'su 가 10이면 10이다.'를 출력, 'su 가 10이 아니면 10이 아니다.'를 출력
		
		String result =((su == 10)? "10이다." : "10이 아니다.");
			System.out.println(result);
			System.out.println();
		
//		조건에 따라서 다른 로직을 실행할 수 있게 만드는 것을 쓰고 있음
		
	}
	
	

	
//	숫자를 입력받아 100보다 큰 수면 "우와 크다" 출력 아니면 "에이 작다" 출력
	
	public void ooah( ) {
			System.out.print(" input number : ");
		int num = scn.nextInt();
		String result = ((num >100)? "우와! 크다" : "에이 작다");
			System.out.println(result);
		
	}
	
//	미성년이면 "공부나하세요!" 아니면 "취업 좀 하세요"
	
	public void whatThe( ) {
			System.out.print("몇 살이에요?");
		int age = scn.nextInt();
		
		String result = ((age>0&&age<=19)? "공부나 하세요!" : "취업 좀 하세요 ");
		
			System.out.println( result );
	}
//	나이가 19 이하인 사람 > 나이를 입력 받았을 때 그 입력값이 19이하이면
//	> 나이를 저장할 저장소가 필요하겠네!
	
	
	
//	kh학생이면 코딩하세요 아니면 취업하세요
//	학생 여부를 입력받아 처리
	public void go() {
			System.out.println("kh학생입니까 y/n");
			
//			kh학생인지 어떻게 알까? _ 흔히 '요구 사항'이라고 하지...
//			이렇게 명세해서 알려주지 않아. 
//			뭉뚱그려서 말한 것을 우리가 해체해서 하나씩 천천히 구상하고
//			만들어야지
//			그러기 위해서는 우리의 사고의 흐름을 정리할 필요가 있어
//			마인드 맵도 좋고 주석으로 하나씩 정리해 나가면서 하면 좋지
		
//			1. String으로 받는 방법
			
//		String input = scn.next();
//		String result = ( ( input.equals("y") )? "코딩하세요" : "취업하세요" );

//			2. char로 받는 방법 
		char choice = scn.next().charAt(0);
		String result = ( ( choice == 'y' )? "코딩하세요" : "취업하세요" );
			System.out.println( result );
	}
	
//	미성년인지 확인하고 미성년이 아니고 남자면 왼쪽으로 가세요, 아니면 오른쪽으로 가세요
//	미성년이면 나이 더 먹고 오세요~
	
	public void nestedtriple( ) {
		int age;
		char gen;
		
			System.out.print("몇 살이세요?");
		age = scn.nextInt();
			System.out.println("성별이 어떻게 되세요? (M/W) ");
		gen = scn.next().charAt(0);
		String result = ( (age>19)? ( (gen == 'M')? "왼쪽으로 가세요" : "오른쪽으로 가세요" ) : "나이 더 먹고 오세요." );
		
		System.out.println(result);
		
		
//		 더 복합으로 구성해볼까?
		
		
		String result2 = ( (age>19)? ( (gen == 'M')? "왼쪽으로 가세요" : "오른쪽으로 가세요" ) : ( (17<=age&& age<=19)? "고딩? 수능 공부해라 " : "요구르트 한 잔 해!") );
		
		System.out.println(result2);
		
//		실전에서는 삼항 연산자는 이렇게 복잡하게 쓰지는 않아
//		javaScript에서 설정값을 주거나 하는 때 간단하게 쓰지!
		

	}
	
//	비트 연산에 대해서 
	
	public void bitOp() {
//		비트 연산 실행하기 
		
//		저장소에 있는 비트끼리의 연산을 의미함.
//		연산에는 & : (A&B) : 각 비트가 모두 1일 때 ‘0’ 다르면 ‘1’
//				|: (A|B) : 각 비트 중 하나라도 1일 때 1 아니면 0
//				^(XOR): (A^B) : 두 비트가 다른 값을 가질 때 1 같으면 0 
//				~: (A~B) : 1일 때 0, 0일 때 1
		
		int a = 10, b = 22;
		String basic = " ";
		for ( int i = 0; i<32; i++ ) {
			basic += "0";
			
		}
		String bit = basic+Integer.toBinaryString( a );
		bit = bit.substring( bit.length() - 32 );
			System.out.println( bit + " > a의 비트값" );
		bit = basic+Integer.toBinaryString( b );
		bit = bit.substring( bit.length() - 32 );
			System.out.println( bit + " > b의 비트값 " );
			System.out.println("-------------------------------------------");
			
		bit = basic+Integer.toBinaryString( a&b );
		bit = bit.substring( bit.length() - 32 );
			System.out.println( bit + " > a&b의 비트값 " );
			System.out.println();
			
		bit = basic+Integer.toBinaryString( a|b );
		bit = bit.substring( bit.length() - 32 );
			System.out.println( bit + " > a|b의 비트값 " );
			System.out.println();
			
		bit = basic+Integer.toBinaryString( a^b );
		bit = bit.substring( bit.length() - 32 );
			System.out.println( bit + " > a^b의 비트값 " );
			System.out.println();
			
		bit = basic+Integer.toBinaryString( ~a );
		bit = bit.substring( bit.length() - 32 );
			System.out.println( bit + " > ~a의 비트값 " );
//		객체의 substring 다시 한 번 
		
	}
	
	
}
