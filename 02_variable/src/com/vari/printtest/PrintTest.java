package com.vari.printtest;

public class PrintTest {

	public static void main(String[] args) {

//		System.out.print(); 와 System.out.println();의 차이 
		String name="김상현";
		int age = 29;
		double height = 171.1;
		double weight = 70.2;
		char gender= 'M';
		
		
		System.out.println("System.out.print();의 사용 : ");
		System.out.print(name);
		System.out.print(age);
		System.out.print(height);
		System.out.print(weight);
		System.out.print(gender);
		
		System.out.println();
		System.out.println();
		System.out.println("System.out.println();의 사용 : ");
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(gender);
		
		System.out.println();
//		printf(f = 포맷, 일정한 형태의 의미)
//		System.out.printf(name, args);
//		형식으로 되어 있고 "%형식", 변수 로 사용
		System.out.printf("키는 %f 입니다.\n", height);
//		%d : 정수형 
//		%c : 문자
//		%f : 실수
//		%s : 문자열
//		%b : 논리형s
//		%e : 지수형태표현
//		%g : 대입 값
//		%o : 8진수
//		%x : 16진수
		
//		정렬방법
//		- %5d : 5칸을 확보하고 오른쪽 정렬
//		- %-5d : 5칸을 확보하고 왼쪽 정렬
//		- %.2f : 소수점 아래 2자리까지만 표시
		System.out.printf("이름은 %s 입니다.\n \n", name);
		System.out.printf(" 이름은 %s입니다. \n 나이는 %d입니다. \n 키는 %f입니다. \n 몸무게는 %f입니다. \n 성별은 %c 입니다.\n", name,age,height,weight,gender);
		
//		printf는 값의 정렬, 소수점자리수 표현을 쉽게 할 수 있다.
//		eg) 유병승, 정진, 장연재
		System.out.println();
		System.out.println("println으로 출력\n");
		System.out.println("유병승, 19세");
		System.out.println("정진, 20세");
		System.out.println("장연재, 21세\n\n");
		
//		printf로 출력하면 정렬해서 출력이 가능하다.
		System.out.println("printf를 통해 출력\n");
		System.out.printf("%10s %d\n", "유병승", 19);
		System.out.printf("%10s %d\n", "정진", 20);
		System.out.printf("%10s %d\n", "장연재", 21);
		System.out.printf("%-10s %10d\n", "김상현", 29);
//		소수점 표시에 대해서 설정할 수 있다.
		System.out.println("\n\n\n\n");
		
		
		System.out.printf("소수점 다섯 자리까지 출력 : %f\n", height);
		System.out.printf("소수점 두 자리까지 출력 : %.2f\n", height);
		
//		몸무게를 소수점 세 자리까지 출력 해보기
		System.out.printf("소수점 세 자리까지 몸무게를 출력 : %.3f\n\n\n", weight);
		
//		printf는 웹프로그래밍에서 변수 확인하는 데에 주로 사용, 솔직히 많이 쓰지는 않는다.
	
		
		
//	printf로 
//		나는 000이고, 나이는 00이고, 성별은 0, 키는 00, 몸무게는 00.0 입니다.
		System.out.printf(" 이름은 %s입니다.  나이는 %d입니다.  키는 %.2f입니다.  몸무게는 %.3f입니다.  성별은 %c 입니다.\n\n", name,age,height,weight,gender);
//		개행을 하는 경우
		System.out.printf(" 이름은 %s입니다. \n 나이는 %d입니다. \n 키는 %.2f입니다. \n 몸무게는 %.3f입니다. \n 성별은 %c 입니다.\n", name,age,height,weight,gender);
	
	
	
	//escape문 = 특정 기능을 수행하는 문자 리터럴
		
		System.out.println("-------------------");
//		\t는 일정 간격의 띄어쓰기
		String msg = "안녕     하세요 ";
		System.out.println(msg);
//		/t : 탭 참고로 탭은 space 5칸이다.
		msg = "안녕\t하셨쎄요?";
		System.out.println(msg);
//		/n : 개
		msg = "안녕\n하셨쎄요?";
		System.out.println(msg);
//		/' : ' html5할 때 씁니다.
		msg = "\'안녕하셨쎄요?\'";
		System.out.println(msg);
//		/" : " html5할 때 씁니다.
		msg = "\"안녕하셨쎄요?\"";
		System.out.println(msg);
//		'//' = '/'
		msg = "\\안녕하셨쎄요/?";
		System.out.println(msg);
//		경로 관련해서 C:'\'Users'\'user1를 쓰고 싶을 때 아래와 같이 쓴다.
//		
		String path = "C:\\Users\\user1";
		System.out.println(path);

		////////////////     변수 사용은 여기까지... ///////////////////
		/////////////// 변수 활용은 또 다른 얘기지...///////////////

	}

}
