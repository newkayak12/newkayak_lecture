package com.vari.programstructure;

import java.util.Scanner;

// 기능 클래스
public class Functional {
// 클래스 이름에  'class'라는 단어를 쓰지 않는다. 
	
	 
	public void inputData () {
		System.out.println("===== 회원 정보 입력 =====");
		 Scanner sc = new Scanner(System.in);
		 
		 	System.out.print(" 회원 아이디 : ");
		 	String usrid = sc.nextLine();
		 	System.out.print(" 패스워드 : ");
		 	String psswd = sc.nextLine();
		 	System.out.print(" 나이  : ");
		 	int age = sc.nextInt();
		 	System.out.print(" 성별  : ");
		 	char gender = sc.next().charAt(0);
		 	
		 	System.out.println(usrid + "\n" + psswd +"\n" + age + "\n" + gender);
	}
	
}
