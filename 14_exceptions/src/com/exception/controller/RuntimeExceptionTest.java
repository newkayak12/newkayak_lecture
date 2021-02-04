package com.exception.controller;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class RuntimeExceptionTest  {

	public static void main(String[] args) /* throws FileNotFoundException */ {
		
		// 01.  arithmeticException : 수학적으로 계산이 불가능한 경우에 발생
		
		Scanner scn = new Scanner(System.in);
			
//		try {
//				System.out.println(" number : ");
//			int su = scn.nextInt();
//				System.out.println(" number : ");
//			int su2 = scn.nextInt();
//			
//		
//			System.out.println(su/su2);
//		} catch (ArithmeticException e) {
////			System.out.println("예외 처리 완료!");
////			예는 catch에 있는 것 실행하고 계속 밑으로 내려간다고
////			
//////			ArithmeticException e 얘는 저 클래스 타입의 변수 선언 > 에러에 대한 정보를 e에 대입
//			e.getMessage(); // Exception message java.lang.ArithmeticException: : /by zero같은.. 원인이 되는 
//			e.printStackTrace(); //Exception 발생 위치 추적 :/모든 에러 발생 지점을 추적하는 출력 구문
//			
////			
////			
//		}
		
		
		
		
//			su2에 '0' 대입
//			double로 계산하면 소수점이라 Infinity
			
			/*
			 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
			 * com.exception.controller.RuntimExceptionTest.main(RuntimExceptionTest.java:
			 * 18)
			 */
//			
//			JVM이 처리
			
			
		
		
		
			
			
		// 02. negativeArraySizeException : 배열의 길이를 0보다 작은 수를 넣었을 때(음수)
		
		try {
			int[] arr = new int [-10];
//		컴파일 에러는 안 나네
		} catch(NegativeArraySizeException e) {
			System.out.println("예외 처리 완료!");
//			e.printStackTrace();

			
//		오타내고 발견 못하겠다??  모니터를 제 삼자인양 보라?? ㅋㅋㅋㅋㅋㅋ
			
		}
		
		/*
		 * Exception in thread "main" java.lang.NegativeArraySizeException: -10 at
		 * com.exception.controller.RuntimExceptionTest.main(RuntimExceptionTest.java:
		 * 35)
		 */
		
		
//		물론 if로도 처리할 수 있지
		
		
		
		
		
		
		
		//03. ArrayIndexOutOfBounds : 접근한 인덱스가 배열의 길이를 초과함
		int[] arr = new int[2];
		
		try {
			
			arr[3] = 3;
//		runtime에러라 컴파일 단계에서는 못잡음
//			System.out.println("실행 되니???"); //아니??
		} catch (ArrayIndexOutOfBoundsException e ) {
			 int[] temp = new int[arr.length+10];
			 System.arraycopy(arr, 0, temp, 0, arr.length);
			 arr = temp;
			 
			 arr[3] = 3;
			 System.out.println(arr[3]);
		}
		
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
//		at com.exception.controller.RuntimExceptionTest.main(RuntimExceptionTest.java:53)

		
		
		
		
		
		
		
		
		
		
		//04. ClassCastingException : 클래스 형 변환 시에 잘못된 타입으로 형변환 할 경우
		try {
			Object obj = new String("안냥!");
			Scanner sc = (Scanner) obj;
		} catch (ClassCastException e) {
			e.getStackTrace();
		}
		
//		Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class 
//		java.util.Scanner (java.lang.String and java.util.Scanner are in module java.base of loader 'bootstrap')
//		at com.exception.controller.RuntimExceptionTest.main(RuntimExceptionTest.java:73)
		
//	예외 처리는 정말 중요한 부분이다. 프로그램이 예상치 못하게 꺼지는건 진짜 답도 없는 상황이니	
		
		
		
		
		//05. NullpointerException : null인 곳에 직접 접근할 때
		
		
		//checkedException example
		
		try {
//			FileReader fr = new FileReader("Test.txt");
//			Unhandled exception type FileNotFoundException > try - catch or throws로 처리
//			이렇게 무조건 예외처리를 요구하는 경우 checkedException
			
			new ExceptionHandled().testException();
//			throws로 예외를 떠넘김
		} catch(FileNotFoundException e) {
//			예는 무조건 적어도 한 번 이상 예외를 try-catch로 처리를 해야한다.
//			메인에서 떠넘기면 JVM한테 가고 그러면 에러를 발생시킴(컴파일 에러처럼)
		}

		
		new ExceptionHandled().tryCatchTest();
//		다시 정상 흐름으로 돌아온다고요!
		
		
		
		
	}

}
