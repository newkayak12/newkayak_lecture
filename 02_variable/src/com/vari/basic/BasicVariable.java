package com.vari.basic;

public class BasicVariable {
	
	public static void main( String [] agrs ) {
//		 set variables > 저장공간확보하기
//		 변수 선언하는 방법 > 자료형 변수명 ; eg) int i ;
		boolean fact;
//			boolean은 true or false를 저장하는 공간을 선언한다.

		
//		     이 이름을 설정할 때 일종의 규약이 존재한다.
//		
//		
//			1. 대소문자의 구분이 되며 길이의 제한은 없음
		char Fact;
//				boolean의 fact와 char의 Fact는 다른 변수이다. (참고로 대문자로 사용하지 않는다. 쓸 수는 있지만 클래스에만 대문자를 사용한다.
//			2. 예약어(자바예약어)를 사용하지 않는다. 예를 들어  abstract, boolean, implements, extends 등의 자바 내부에서 지정된 용어들이 있다.
//				eg) String public
//			3. 변수 명칭을 지정할 때 첫 글자를 숫자로 지정하지 않는다.
//				eg) int 1number;
//			4. 특수문자 사용할 수 있다. ('_' 와 '$'만 사용 가능) 단, 일부만 사용 가능하다.
		int _number;
		int $number;
		int num$ber;
//			5. 여러 단어로 변수 명을 작성할 때는 첫 글자는 소문자로, 그 이후 이어지는 새로운 단어는 대문자로 작성 (이렇게 사용하는 것을 'CamelCase'라고 부른다.
		int varialbeSetting;
		String memberName;
//			6. 변수 명칭을 정할 때에는 해당 변수명으로 그 값을 예상할 수 있게 지정해야한다.
//			7. 변수명은 한글로 쓸 수 있지만 안 쓰는 것을 추천(네트워크 통신 때 한글이 깨져서 인코딩에 쓸 데 없는 노력을 들여야함)
		String 안녕;
			
//			변수 선언시 주의점!
//			동일한 영역(scope{} 안에 코드를 작성할 때 동일한 변수 명이 존재하면 안된다. 중복 불가!
//			메소드 내부에 있는 변수 로컬변수 
//			클래스 중괄호 안에 있는 변수 멤버변수/필드 
	
//			값의 대입 
//			변수에 값을 넣을 때에는 대입연산자 '='을 이용함
//			대입연산사용 : 변수명 = 대입 할 값
		int mathRecord;
//		타입  변수명; 으로 생성
		
		mathRecord = 92;
//			변수명 = 리터럴; 으로 초기화
		
		int mathRecord2 = 82;
//			이렇게 생성과 동시에 초기화를 해도 된다.
			
			System.out.println(mathRecord);
			System.out.println(mathRecord2);
			mathRecord2=20;
			mathRecord2=40;
			mathRecord2=60;
			System.out.println(mathRecord2);
			
//			숫자(정수) 이외의 값을 저장하려면 어떻게 해야할까?
//			문자형/논리형/실수형 등
//			논리형은 true/false
			fact = true;
			fact = false;
//			여기서 대입되는 '값'들은 리터럴이라고 부른다.
			
			char gender;
			gender = '남';
//			char의 데이터는 ''로 감싸준다. > 여기서 '남'은 문자 리터럴이라고 부른다.
			String email = "newkayak12@gmail.com";
//			문자열은 String으로 타입을 선언해서 사용한다.
			
			
			
			double height = 170.1;
//			실수는 double이나 float으로 저장한다. 참고로 float이 4바이트 double이 8바이트로 double이 더 표현할 수 있는 범위가 넓다. 
//			실수는 부동소수계산을 하며 해당 값의 근사 값에 해당하는 값을 출력한다. 그에 따라 1은 0.9....로 1에 가까운 값이다. 
//			실수의 표현방법의 한계는 간혹 사칙연산 혹은 일반연산에서 예상하는 값과 다르게 출력되기도 한다.
			
			float weight = 70.2f;
//			Type mismatch : cannot convert from double to float 
//			기본 타입이 double 이므로 기본 자료형 역시 double이다. 위의 에러는 자료형과 리터럴의 타입이 일치 하지 않는다는 내용이다.
//			그에 따라서 타입을 float으로 바꿔주거나 리터럴의 자료형을 바꿔줘야한다. > 그래서 70.2'f'가 된 것이다.
			
			long longNum;
			longNum=100;
//			그러면 longNum은 long이고 100은 int인데 왜 에러를 출력하지 않을까?
//			자동타입변환(promote)이 되서 그렇다.
			
			longNum=10000000000000000L;
//			이렇게 long범위에 있는 경우! int의 범위 밖이어서 자동 타입변환이 진행되지 않는다. 그렇다면 이렇게 큰 수는 long에 어떻게 저장해야하나
//			해당 값에 float과 같이 'L'을 넣어주면 자료형이 long으로 변하면서 문제 없이 저장된다.
			





/* 문자열은 String + ""
 * 문자 리터럴은  char + ''
 * 정수 리터럴은 숫자
 * 정수 long타입은 숫자L
 * 실수 float은 숫자.숫자f
 * 실수 double은 숫자.숫자
 
 * 변수 선언과 동시에 초기화 하는 방법은
 * 타입 변수 = 값; 형태로 쓰며, 변수의 선언과 동시에 초기화를 하는 방법이다.
 * eg) int i = 0; 이런식으로 말이다.
 * eg) String name = "Kim SangHyeon";
 * 
 * 				동일한 자료형의 변수를 여러 개 선언할 때는
 * eg) int age1, age2, age3, age4;이런식으로 선언하고 나중에 초기화 할 수 있다. 
 * 
 *			 혹은 여러 개를 선언과 동시에 초기화 할 수도 있다.
 * eg) char alpha='a', alpha2='b', alpha3='c';이런식으로 말이다.
 */
		

		/* 문자열에 대한 추가 학습
		 * 문자열클래스는 객체이다.*/
		
		  String nickName="kayak";
		  String nickName1 = new String("kayak");
		  
		/* new연산자로 객체를 생성할 수도 있다. String이 class이니까.*/
		  System.out.println(nickName);
		  System.out.println(nickName1);
		  System.out.println(nickName.equals(nickName1));
		  System.out.println(nickName==nickName1);
		  
		/* 문자열은 '+' 연산을 통해서 붙여서 쓸 수 있다. 
		 * 예를 들어 "김" + "상현" 이라고 하면 이는 출력 될 때 김상현으로 출력된다.
		 * */
		  System.out.println("곧 " + "쉬는 시간");
		 
		  String msg="오늘은" + " 금요일";
		  System.out.println(msg);
		   
//		  변수명 + 변수명은 가능할까?
		  
		  String msg1 = " 이야 신난다!";
		  System.out.println(msg + msg1);
		  
//		  가능하다. "오늘은"+" 금요일" + " 이야 신난다!"와 같기 떄문
		  
		  msg1 =" 내일은 토요일이네!";
		  System.out.println(msg + msg1);
//		  변수에 새로운 값을 대입하면 바뀐 그대로 메시지를 출력한다.
		  
		  System.out.println("jdk " + 11.0);
//		  숫자와 문자열로 연산하면 숫자를 문자열로 그냥 변환해버린다. 그래서 jdk 11.0으로 출력이 되는 것
//		  문자열과 연산하면 단순히 숫자뿐만 아니라 여러 가지가 다 그냥 문자로 변환되어 문자열 + 문자열과 똑같이 출력된다.
		  System.out.println(nickName+height+weight+gender);
		  
//		  순서가 문자 + 숫자 +숫자 이런식이면 그냥 문자열끼리 더해지고
		  
		  System.out.println(height+weight+nickName+gender);
		  
//		  은 숫자 + 숫자 + 문자+ 문자이기 때문에 실수끼리 계산을 하고, 나머지 문자는 결합 연산을 한다.
		  
		  /* 진행 방향이 좌에서 우로 가기 때문에, 값이 어떻게 되어 있는지에 따라서 결과 같이 바뀔 수도 있다.
		   * 
		   * 그러나 원하는 연산 결과를 만들기 위해서 괄호를 이용해서 수학적으로 이용할 수 있다.
		   * */
		  System.out.println(nickName + (height +weight) + gender);
		  System.out.println(height + (weight + nickName + gender));
//		                           or
		  System.out.println(""+height+weight+nickName+gender);
		
	}
	int mathRecord2 = 100;
//		메소드 내에 선언되는 변수는 로컬변수, 그 밖에 선언되는 변수는 멤버변수 혹은 필
//	 	{} 안에서 같은 이름을 두 개 선언하면 중복 단, {}의 영역이 다르면 상관 없음
		
}