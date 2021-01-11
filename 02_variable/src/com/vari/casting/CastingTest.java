
package com.vari.casting;

public class CastingTest {
	public static void main ( String [] args ) {
//		 자료형 변환 알아보기
//		byte bnum = 200;
		byte bnum = 100;
//	    타입 : 바이트 = 타입 : 인트
//		엄연히 말하면 위의 수는 int 타입인데 byte에 대입됐다.
//		이런걸 자동 형 변환이라고 한다.
		
//		추가적으로 저렇게 값이 초과됐을 떄, 두 가지 선택지를 제시하는데 casting
		System.out.println(bnum);
		
		long lnum = 10000;
		
//		이 역시 자동 형 변환이 된 것이다.
		System.out.println(3.14 + 100);
//		여기서 3.14의 자료형 double, 100은 int이다. 
//		원래는 계산이 안되야 맞는 것, 그러나 자동 형 변환으로 계산이 되게 만들었다.
//		이 경우 int를 double로 변환하는 자동 형 변환을 지원한다.
		
		String msg = "김상현" + 19 + "살";
//		이 역시 자동 형변환이다.
		
//		 조건은 작은 자료형에서 큰 자료형으로 갈 때만 자동으로 타입을 변환해준다.
		
		
//		반대로 큰 자료형에서 작은 자료형으로 변환하는 것은?
//		데이터의 손실이 일어남. > 물론 무조건적으로 그런 것은 아니고, 작은 자료형에서 받아들일 수 있는 경우에는 전혀 문제가 안 된다.
		
		double weight = 65.5;
		int weightInt;
		
//		weightInt = weight;
//		이런 경우 자동적으로 형 변환이 안 된다. 형 변환 시 데이터 손실이 일어날 수 있기 떄문이다.
//		그럼에도 만약 형 변환을 해야한다면 () 안에 데이터 형을 적고 값 혹은 리터럴 앞에 놓아주면 강제 형 변환이 발생된다.
		weightInt = (int) weight;
//		변수 명 = (데이터 형) 리터럴;
		System.out.println();
		System.out.println("변환 전 값 : " + weight);
		System.out.println("변환 후 값 : " + weightInt);
//		이런 경우 65.5라는 값에서 0.5 라는 값이 손실 된 것을 볼 수 있다. 
		
//		형의 변환은 리터럴만 가능하다. 변수는 형 변환이 불가능함.
//		여기서 의문이 들 수 있다. 저 위에 weight는 변수가 아니야?
//		응, 아니야 단지 리터럴 값을 호출하는 주소를 가지고 있는 녀석이지
//		즉, 위의 의미는 weightInt = (int) 65.5;의 의미이다.
//		또, (double) weightInt = weight; 이런식의 코드가 안 된다는 의미입니다.
		
		int num = 290;
//		bnum = num;
//		bnum은 byte, num은 int 심지어 값도 290;
		bnum = (byte) num;
		System.out.println();
		System.out.println("num의 원본 값 :" + num);
		System.out.println("변환된 값 : " +bnum);
		
		
//		자동형변환( 정수형 ) 의 특이점
//		기본적인 산술연산에 대한 값은 int형으로 처리가 된다. 
		byte bnum1= 100;
		byte bnum2= 10;
//		byte result = bnum1+bnum2;  오 이것도 에러가 뜨네... int값을 byte에 집어 넣어서 그렇다.

		
//		soultion 1.
		byte result = (byte) (bnum1+bnum2);
//		soultion 2.	
		int num0 = bnum1+bnum2;
		
		
		int num1 = 100;
		double dnum =180.5;
//		int result1 = num1 + dnum;
//		이 경우는 double을 계산해서 int에 집어 넣으려고 하니까 문제가 생기는 부분임
//		이럴 경우, 위의 솔루션과 같이 강제로 내리던가 아니면 결과 값의 자료형을 double로 바꾸든 해야한다.
		
//		혹은 double을 int 로 바꿔주는 방법도 있다.
		
		int result1 = num1 + (int) dnum;
		
//		이런식으로 강제로 double을 int 로 바꿔준다. 그러나 이러한 방법은 그리 바람직하지는 않다.
//		이럴 경우 180.5에서 0.5라는 값이 손실되며 결과적으로 산출물이 부정확해지기 때문이다.
		
		
		
//		char형에 대한 자료형 변환
//		숫자와 문자를 매칭시킨 유니코드를 통해서 글자를 표현한다. 즉, char타입은 글자를 저장하는 것이 아니라 숫자를 저장한다는 의미이다.
		
		char ch = 'A';
		int alpha = ch;
		
//		문자를 int에 집어넣는 기괴한 일들이 가능한 것도 char타입이 자연수를 저장하고 있고, 유니코드로 변환해서 글자를 출력하기 때문이다.
//		심지어 char타입의 크기가 int 보다 작기 때문에 자동 형 변환 역시 된다.
		System.out.println(alpha);
		
		System.out.println((char) alpha);
		++ch; //66
//		char ch2 = (char ) ( char +1);과 같다.
		System.out.println(ch);
	}
}
