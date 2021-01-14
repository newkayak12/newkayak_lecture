package com.condition.controller;

import java.util.Scanner;

public class ConditionController_if {

	Scanner scn  = new Scanner (System.in);
	
//	 기본 if 활용하기
	public void ifTest() {
		
			System.out.print("정수입력을 받습니다.");
//		입력 받은 값이 양수면 = "양수입니다." 아니면 아무것도 하지않음.
		int num = scn.nextInt();
//		삼항연산자를 사용하면 이렇겠지?
			System.out.println( ((num > 0)?  "양수입니다." : " ") );
//		이렇게 작성하겠지?
//		if 문으로 작성하면 어떨까?
			
			if( num > 0 ) { 
					System.out.println("양수입니다.");
				
				String name  = "되니?";
					System.out.println(name);
					System.out.print("이메일 : ");
				String eamil= scn.next();
//				이 안에는 우리가 배운 모든 코드를 다 쓸 수 있다!!!!
//				단 이 안에 있는 코드는 조건이 true가 되는 경우에만 쓸 수 있겠지
			}
			System.out.println("메소드의 끝");
			
//			 들여쓰기의 의미? 가독성을 올려준다. 어디에 어떻게 포함되고 있는지
//			그래서 중괄호 시작하면 들여쓰기하는 식으로 습관을 들이자!
	}
/////	
	
	
// Q.	이름을 입력받고 자신의 이름과 동일한 이름이 입력되면 
//		나는 코딩을 잘 할 수 있다를 출력 , 다르면 아무 것도 하지 않기
	
	public void ifex() {
				
			System.out.print("What is your name?");
		String name = scn.next();
					
			if(name.equals("김상현")) {
					System.out.println("나는 코딩을 잘 할 수 있다.");
			}
				
	}
////////	
//Q.	 국어, 영어, 수학을 입력받고 평균이 60점 이상이면 합격이다 출력하기
	public void cong( ) {
//			System.out.print("score of korean :");
//		int kr = scn.nextInt();
//			System.out.print("score of english :");
//		int en = scn.nextInt();
//			System.out.print("score of math :");
//		int ma = scn.nextInt();
//		double avg = (double)(kr+en+ma)/3;
//			if(avg >= 60) {
//				System.out.println("합격!");
//			}
////////////////////////////////////////// 내가 쓴 코드 (위)
		
			System.out.print("score of korean :");
		int total = scn.nextInt();
			System.out.print("score of english :");
		total += scn.nextInt();
			System.out.print("score of mathmatics :");
		total += scn.nextInt();
			
		if(total / 3.0 >= 60) {
				System.out.println("합격");
			}
//////////////////////////////////////////// 선생님이 쓰신 코드(위)
//			굳이 변수를 여러 번 남발할 필요는 없지? 크게 간단해진 것은 아니지만 이렇게도 쓸 수 있다는 거지!
	}
//////////	
	
	
/////////
//	정수 한 개를 입력 받아 정수가 짝수이면 짝수이다 출력
	public void evenNumber() {
			System.out.print(" enter any number : ");
		int num = scn.nextInt();
			if(num%2 == 0) {
				System.out.println("That is a even number");
			}
	}
/////////////
	
	
/////////////
//Q. 아이디 패스워드 입력받아 id admin, psswd admin 이면 로그인 성공	
	public void login ( ) {
			System.out.print("enter you id : ");
		String id = scn.next();
			System.out.print("enter you password : ");
		String pss = scn.next();
		
			if( (id.equals("admin")&&pss.equals("admin")) )  {
				System.out.println("log ing success");
			}
	}
//	if 문은 이 로직 안에서 1개만 쓸 수 있냐?? NO 여러 개의 if 문 사용 가능!
////////////
	
// 입력 받은 수가 양수이면 "양수이다." 음수이면 "음수이다."를 출력	
	public void ifElseExam() {
//		if ~ else 활용하기
//		if ~ else 는 한 개의 그룹이다. else 단일로는 사용하지 못 한다. 
//		if ~ else 는 조건에 따라 반드시 둘 중 하나만 실행된다.
			System.out.print( " enter any number : " );
		int num = scn.nextInt();
			if( num > 0 ) {
				System.out.println("This is Positive Number");
			} else {
				System.out.println("This is Negative Numeber");
			}
	}
////////////
	
//Q.	미성년자는 가입이 불가능한 로직을 구성
//	가입이 가능하면 "가입가능" , 불가능하면 "불가능"
	
/////////////////////
	public void minors() {
			System.out.print("enter your age : ");
		int age = scn.nextInt();
			if( (age >=20) ) {
					System.out.println("you can sign up");
					System.out.println("--------- info -----------");
					System.out.print(" ID : ");
				String name = scn.next();
					System.out.print("Password : ");
				String pss = scn.next();
					System.out.print("Nick Name :  ");
				String nic = scn.next();
				
				
			}else {
				System.out.println("you can't sign up. go back.");
			}
	}
////////////////////	
	
//  if문을 두 개 쓴거랑 else를 쓴 것의 차이?
//	if를  두 개 쓴 것은 서로 별개의 것이고 if else는 한 몸
	
// if ~ else if ~ else	
//Q.	성적을 입력받아서 그 성적에 따라 A, B, C, D, F로 나눠라
//	A : 100~90, B : 89~80, C : 79~70, D : 69~60, F : 59이하
	public void gra() {
			System.out.print("Enter you score : ");
		int score = scn.nextInt();
		
			if( (score >= 90 && score<=100 ) ) { System.out.println("A");
			} else if (score>=80)  { System.out.println("B");  //조건을 보면 결국에 ((score >= 90 && score<=100)&&score>=80) 이런 느낌
			} else if (score>=70)  { System.out.println("C");
			} else {System.out.println("D"); }
			
			
//			조건이 ((score >= 90 && score<=100)&&score>=80) 이렇게 되는데! 만약 100000을 넣으면
//			(score >= 90 && score<=100) 는 false이다. 근데 문제는 100000이 score>=80애서는 true가 나와서 의도 범위 밖의 값이 나온다.
//			그렇기 때문게 값을 세밀하게 생각하고 설정해야한다. 여기서는 (score<=100&&score>=80)이면 되겠다.
			
	}
//////////////////
	
/////////////////	
//Q.	연령별 메시지 출력
//	10대 : 열심히 공부해야 좋은 대학가지!
//	20대 : 열심히 공부해야 취업하지!
//	30대 : 열심히 일해야 결혼하지!
//	40대 : 열심히 일해야 애키우지
//	50대 : 열심히 일해야 손자,손녀 보지!
	public void hellKorea( ) {
		System.out.print(" enter you age : ");
	int age = scn.nextInt();
		boolean ten,twen,thir,four,fif;
		ten = ( age >= 10 && age <=19);
		twen = ( age >= 20 && age <=29);
		thir = ( age >= 30 && age <= 39);
		four = ( age >= 40 && age <=49);
		fif = (age >=50 && age <=59);
		
			if(ten ) { System.out.println("열심히 공부해야 대학가지");
			
			} else if (twen) { System.out.println("열심히 공부해야 취업하지");
			
			} else if (thir) {System.out.println(" 열심히 일해야 결혼하지");
			
			} else if (four) {System.out.println("열심히 일해야 애키우지");
			
			} else if (fif) {System.out.println("열심히 일해야 손자,손녀보지");
	
			}
//			변수를 더 적게 쓰고, 효율적이게 하는 방향으로 진보해야함..... 어렵네!!!
	
	}
	
//////////////////
	
	
///////////////
	
	public void id() {
			System.out.print(" Enter your id : ");
		String id = scn.next();
			System.out.print(" Enter your password : ");
		String pss = scn.next();
		
			if(id.equals("user01")&&pss.equals("user01")) {
				System.out.println("login success");
			} else if (id.equals("user01")&&!pss.equals("user01")) {
				System.out.println("id or password is incorrect!");
			} else if (!id.equals("user01")&&pss.equals("user01")) {
				System.out.println("id incorrect!");
			} else if (!id.equals("user01")&&!pss.equals("user01")) {
				System.out.println("id and password are incorrect");
			}
	}
////////////////////
	
////////////////
//	 중첩 if 문 사용하기 
	public void nestedIfTest() {
//		중첩 if문은 전제가 되는 조건에 대해서 설정하고 그 안에서 다시 if 문을 사용하는 것
//		나이가 성인이면서, 내국인일 때, 그냥 회원 가입 / 외국인일 때는 외국인 등록번호
//		성인이 아니면 가입할 수 없습니다.
			System.out.println(" ======= kh 클럽 회원 가입 ======= ");
			System.out.print("how old are you? : ");
		int age = scn.nextInt();
			if( age>19 ) {
				
					System.out.println("Are you foreinger?");
					System.out.println(" 1. yes  /   2. no ");
				String choice = scn.next();
					
					if(choice.equals("1")) {
							System.out.println(" Do you foreigner number ");
							System.out.println("   1. yes    /   2.   No");
						
						int cho = scn.nextInt();
							
							if(cho == 1 ) {
								System.out.println("==== sign up =====");
								System.out.print( " name : " );
							String name = scn.next();
								System.out.print( " address : " );
								scn.nextLine();
							String add = scn.nextLine();
								System.out.println("Welcome");
							} else if ( cho == 2 ) {
								System.out.println("you can't join");
							}
						
					} else if (choice.equals("2")) {
							System.out.println("==== sign up =====");
							System.out.print( " name : " );
						String name = scn.next();
							System.out.print( " address : " );
							scn.nextLine();
						String add = scn.nextLine();
							System.out.println("Welcome!!");
					} else {
						System.out.println("you entered wrong number");
					}
					
			} else {
					System.out.println("you can't join. sorry ask for admin");
					}
//		혹시 너무 어렵다면 순서도나 마인드맵 처럼 그려서 먼저 실체화를 해놓는 것도 좋다.
			
			
		
		
	}
	
	
}

