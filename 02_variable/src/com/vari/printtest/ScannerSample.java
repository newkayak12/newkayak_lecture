package com.vari.printtest;

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
//		�л������� �Է��ϰ� ����ϴ� ���α׷� �����
//		�л����� > �̸�, ����, ����, �ּ�, �г�, Ű
		
		String name, gender, addr;
		int age, grade;
		double height;
		
			System.out.print("name ? ");
			name = sc.nextLine();  // String을 받는다.
			System.out.print("age ? ");
			age = sc.nextInt(); //int를 받는다.
			System.out.print("gender ? ");
			sc.nextLine(); // int로 성별을 받는다.
			gender = sc.nextLine(); //버퍼를 비운다.
			System.out.print("address ? ");
			addr = sc.nextLine();//String으로 주소를 받는다. 
			System.out.print("grade ? ");
			grade = sc.nextInt(); // int로 학년을 받는다.
			System.out.print("height ? ");
			height = sc.nextDouble(); //double로 키를 받는다.
			
				
				System.out.println();
				System.out.println("---Personal Data---");
				System.out.println("name    : " + name);
				System.out.println("age     : " + age);
				System.out.println("gender  : " + gender);
				System.out.println("address : " + addr);
				System.out.println("grade   : " + grade);
				System.out.println("height  : " + height);
				System.out.println("-------------------");
				System.out.println("printf");
				System.out.printf("\n 이름은 %s \n 나이는 %d \n 성별은 %s \n 주소는 %s \n 학년은 %d학년 \n 키는 %.3f \n", name, age, gender, addr, grade, height );
				
//				 ** 단일 문자 입력 받기 **
//				Scanner에서 char 입력 받는 메소드는 따로 없다.
//				String이 제공하는 메소드를 통해 단일 문자를 가져올 수 있다. (배열 개념)
//				만약 김 / 상 / 현이라고 쓰면 글자를 컴퓨터는 인식 X 
//				코드로 연결된 숫자의 집합으로 '김상현'을 출력하는 것
//				그러면 컴퓨터는 unicode로 이를 받아서 [김][상][현]으로 배열 저장하고
//				String 참조 객체는 이를 묶어주는 하나의 배열이 된다.
				char[] character = new char[3];// 이런식으로
//				그리고 각 배열마다 
				character[0] = '김';
				character[1] = '상';
				character[2] = '현';
//				이렇게 말이다. 
//				그리고 문자열은 이들을 모두 모아서 출력해준다.
				char exam = character[0];
				char exam1 = character[1];
				char exam2 = character[2];
				System.out.println(exam + exam1 + exam2);
//				 ---------- 선생님 설명 ----------
				char first = "ABC".charAt(0);
//				String에서 0번 배열 객체의 위치를 찾는가봄
				System.out.println(first);
				char second = "ABC".charAt(1);
				System.out.println(second);
				char third = "ABC".charAt(2);
				System.out.println(third);

//				String indexOutOfBound : 인덱스 범위 초과
				char fourth = "ABC".charAt(3);
				System.out.println(fourth);
				
				String name1 = "이우식";
				 char char1 = name.charAt(1);
				 System.out.println(char1);
						
//				 Scanner를 통해서 입력 받은 값을 charAt으로 가져오려면?
				 
				
	}

}
