package com.vari.printtest;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		//	키보드에서 입력한 값 가져오기 + Ram에 저장하기
		Scanner scanner = new Scanner(System.in);
//		Scanner클래스를 이용한다. 자바 기본 API에 포함된
//		스캐너는 java.util패키지에 있음
//			1. java.util.Scanner를 import한다.
//			2. 클래스를 사용하려면 반드시 생성자를 생성한다. (new 연산자를 이용해서)
//				new 클래스명();  > new Scanner(System.in);
//				얘는 참조형 객체임 
//			3. Scanner가 제공하는 기능 ( 메소드 )를 이용해서 키보드 입력 값을 가져온다.
//					
//						Scanner가 제공하는 기능
//		    1. nextInt(), nextDouble(), next(), nextLine()
//				nextInt() : int 타입의 정수를 받는다.
//				nextDouble() : double 타입의 값을 받는다.
//				next() : 문자열(String)을 받는다. / 띄어쓰기를 기준으로 가져온다. 
//											> 띄어쓰기 앞의 문자를 가져옴
//				nextLine() : 문자열을 받는다.  / 개행을 기준으로 가져온다. 
//											> 개행 앞의 문자열을 가져옴. 

		
//		String input;
//		input = scanner.next();
//		System.out.println(input);
//		
//		System.out.print("입력해주세요");
//		int input;
//		input = scanner.nextInt();
//		System.out.println(20+input);
		
		String input0;
		System.out.print("당신의 이름을 입력해주세요 >");
//		input0 = scanner.next();
		input0 = scanner.nextLine();
		
		int input1 ;
		System.out.print("당신의 나이를 입력해주세요 > ");
		input1 = scanner.nextInt();
//		정수를 입력 받을 때 사
//		사용자가 편하게 사용할 수 있게 만들어줘야한다. UX제고를 위해서!
		
		double input2;
		System.out.print("당신의 키를 입력해주세요 > ");
		input2 = scanner.nextDouble();
//		실수를 입력 받을 때
		
		
		
		String input3;
		System.out.println("당신의 주소를 입력해주세요. >");
		input3 = scanner.next();
//		받을 String에서 띄어쓰기가 필요가 없다. next()로 받으면 
		scanner.nextLine();
		System.out.println(" 주소 2");
		String input4 = scanner.nextLine();
//		받을 String에서 띄어쓰기가 필요하다! nextLine()
		
		System.out.println(input0);
		System.out.println(input1 + "age");
		System.out.println(input2 + " cm");
		System.out.println("next" + input3);
		System.out.println("nextLine" + input4);
		
//		정수, 실수, 문자(next())를 입력 받고 nextLine을 입력 받을 경우 
//		반드시 buffer를 비워줘야함. nextLine()을 한 번 더 입력해서 버퍼를 비운다.
		
//		이유?
//		cpu가 입력 받은 값을 처리할 때 전기적 신호로 받지, 
//		입력 받는 속도보다 처리 속도가 더 빠르다.
//		
//		'가다' 라고 쳤을 때  둘 간의 속도 차이로 ㄱ 만 처리되고 ㅏ다는 날아감
//	
//		그래서 만든게 중간에 메모리인 'buffer'를 둬서 그 차이를 메꿈
//		안녕 이라는 입력을 했을 떄 버퍼에는 ㅇㅏㄴㄴㅕㅇ\n(enterkey) 으로 입력되고
//		next();를 사용하면 버퍼에 접속해서 \n 앞 까지 가져온다.
//		그러면 남은 잔류물인 \n가 남아 있지
//		
//		그 다음  19라는 입력을 하면 \n를 또 남김 int, double next 이 녀석들 다 \n를 
//		남기고 (입력)\n\n\n\n\n\n 이런식으로 쌓임
//		근데 nextLine은 \n을 인식하고 그걸 그대로 출력해버림 그래서 이렇게 쌓인 \n를 비우기 위해서 
//		nextLine()으로 이 녀석을 먼저 없애준다.
	
	}

}
