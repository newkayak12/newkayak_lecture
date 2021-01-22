package com.obj.controller;

import java.util.Scanner;

public class FunctionalTest {
Scanner scn = new Scanner(System.in);
// 타입 / 변수 = new  연산자 /Scanner(생성자) /( 매개변수 = inputstream);
/*
 *   public static final InputStream in
The "standard" input stream. 
This stream is already open and ready to supply input data.
Typically this stream corresponds to keyboard input or another input source specified by the host environment or user.
 */

	
// 얘같은 경우는 기능 제공용 클래스라고 부르면 된다.
//	즉, 메소드만 쭉 선언해도 된다는 소리이다.
	
	
	
//	기능을 제공할 때  공통적으로 필요한 요소가 있을 수도 있다.
//	물론 이렇게 되면 선언을 하면되는데
//	기본적으로 메소드만 가지고 있는 클래스이다.
//	일전에 했던  Student의 경우는 정보 저장용 클래스라고 볼 수 있다.
	
	
//	계샨기 기능을 추가하자!
	
//	수 두 개 , 연산자, 결과값 저장
//	물론 이것도 설계하기 나름이다.
//	1. return이 있고 매개변수가 없는 것(메소드)
//		반환형은 무조건 한 개만 있어야한다. 
//		public double, String, char calc()
//		이런짓은 안된다.
//		만약 반환하는 값이 여러 개라면 배열로 넣어주면 될 것이다.
//		자료형이 다 다른 값을 출력하고 싶다. 위의 상황처럼, 그러면 class를 return으로 주면 될 것이다.
//	 	 결국 return은 하나인데 여러 가지 짓을 하고 싶으면 그냥 객체로 때려 넣으면 된다.
//			사람들 잘하넼ㅋㅋ 
	
	
//	결과적으로 여러 개의 반환을 하고 싶으면 배열, 여러 개의 타입을 반환하고 싶으면 클래스
	
	
	
	
	
	
	public double calcul1() {
//		여러 개의 값이 나올 것 같으면 더 넓은 값으로 선언하는게 좋다.
//		반환형을 선언하면 반환 값이 있어야한다. 무조건 return 이 있어야한다.
//		this method must return a result of type double
//		double으로 return이 있어야한다. 
		
			System.out.println("enter any Integer number");
//		System객체에 . out이라는 멤버 변수. println이라는 메소드
			
///////////////////////////////////////////////////////////////////////////////////////
/*
 * public static final PrintStream out
 * 
The "standard" output stream. This stream is already open and ready to accept output data. Typically this stream corresponds to display output or another output destination specified by the host environment or user.
For simple stand-alone Java applications, a typical way to write a line of output data is:

     System.out.println(data)
 
See the println methods in class PrintStream.
	 */
///////////////////////////////////////////////////////////////////////////////////////		
			
			
			
		int su = scn.nextInt();
	 		System.out.println("enter any Integer number");
 		int su2 = scn.nextInt();
 			System.out.println("operator");
		char op =scn.next().charAt(0);
		double result =0.0;
//		로컬 변수는 무조건 초기화 해야한다. 정 할 값이 없으면 default값을 넣자
			switch(op) {
			
				case '+' :
					result = su+ su2;
					break;
				case '-' :
					result = su- su2;
					break;
				case '/' :
					result = (double)su/ su2;
					break;
				case '*' :
					result = su* su2;
					break;
			}
		
		return result;//자신을 호출한 곳으로 return 뒤의 값을 반환(보내주는 녀석)
	}
	
//	blahblah () > 거의 대부분 메소드를 호출한다는 의미
	
	
//	매개 변수가 있고 반환형이 없는 메소드 생성
	
	public void calc2(int num, char op, int num2) {
	double result =0.0;
//	로컬 변수는 무조건 초기화 해야한다. 정 할 값이 없으면 default값을 넣자
		switch(op) {
		
			case '+' :
				result = num+ num2;
				break;
			case '-' :
				result = num- num2;
				break;
			case '/' :
				result = (double)num/ num2;
				break;
			case '*' :
				result = num* num2;
				break;
		}
		
		System.out.println(result);
		
	}
	
	
//	반환형이 없고 매개변수도 없는 메소드
	public void calc3 () {
			System.out.print("cacl3");
			System.out.println("enter any Integer number");
		int su = scn.nextInt();
 			System.out.println("enter any Integer number");
		int su2 = scn.nextInt();
			System.out.println("operator");
	char op =scn.next().charAt(0);
//	Scanner 타입의 next메소드를 실행하고 
//	이는 String타입으로 return된다.
//	결과적으로 charAt은 그 reutrn 된 String에서 실행되는 것으로 볼 수 있다.
//  String 클래스에 charAt이라는 클래스가 존재하고 결국 
//	scn.next()가 반환하는 String 타입의 값에서 String클래스에 있는 CharAt() 을 이용하는 것과 같다. 
	
	double result =0.0;
//	로컬 변수는 무조건 초기화 해야한다. 정 할 값이 없으면 default값을 넣자
		switch(op) {
		
			case '+' :
				result = su+ su2;
				break;
			case '-' :
				result = su- su2;
				break;
			case '/' :
				result = (double)su/ su2;
				break;
			case '*' :
				result = su* su2;
				break;
		}
		
		System.out.println(result);
	}
	
// 우리가 지금까지 과제를 만들 떄 했던 일이지	
//
	
	
	
//	Q.생성자와 메소드의 차이점??
//	둘 다 기능을 수행하는 것은 맞다. 그러나 역할이 다르다.
//	생성자는 생성할 떄만 사용하고 메소드는 계속 사용할 수 있다.(객체를 생성한 후에 )
//	메소드는 '반드시' 반환형이 있다. 생성자는 객체를 생성하고 필드를 초기화하는
//	역할을 한다. 그러니까 결국 논리적으로 생각할 때 반환이 없다.
//	생성자는 반환형을 쓰지 않는다. 
//	생성자는 클래스 명과 같고 메소드는 내가 정하고 싶은 이름으로 정하면 된다.
//	물론 메소드도 기능을 기반으로 작명을 하는 것이 맞다.
	

	
	
	
//	꼭 반환형을 받아야하는 경우가 있다...
//	웹 프로그래밍 때 결국 우리는 server에서 값을 받아야 하는 경우가 있다.
//	이 경우 parameter(매개변수)로 받아서 사용해야 한다.
//	또, 뭔가 logic이 돌고 그걸 반환 받아서 네트워크 통신으로 보내야하는 경우도 있는데 이 때도 return을 해야하는 경우가 있다.
	
	
	
//	반환형이 있고 매개변수도 있고 
	
	public double calc4(int su, int su2, char op) {
		double result = 0.0;
		switch(op) {
		
		case '+' :
			result = su+ su2;
			break;
		case '-' :
			result = su- su2;
			break;
		case '/' :
			result = (double)su/ su2;
			break;
		case '*' :
			result = su* su2;
			break;
	}
		return result;
	}
	
	
	
}
