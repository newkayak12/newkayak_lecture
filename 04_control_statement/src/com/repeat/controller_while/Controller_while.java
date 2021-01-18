package com.repeat.controller_while;

//import java.io.FileInputStream;
import java.util.Scanner;

public class Controller_while {
//	기본적인 while문 사용하기
	Scanner scn = new Scanner(System.in);
	
	public void whileTest() {
//		1~100까지 출력해보기
		int i = 0; //while에 초기식으로 사용할 변수
			while(i<100) {
				
				System.out.println(i);
				i++;
			}
			
			
//			for(int i =0; i<100; i++) {
//			} 이거랑 위에 있는 거랑 똑같은 거임....
			
//			while은 1. 무한 반복 2. 특정 조건에 의해 반복문이 중단할 때
			
	}
	
	
	public void calcWhile() {
		while(true) {
			System.out.print("how many times do you use? : ");
			int count = scn.nextInt();
				for(int i =1; i<=count; i++) {
						System.out.print("first num : ");
					int num1 = scn.nextInt();
						System.out.print("operator : ");
					String op = scn.next();
						System.out.print("second num : ");
					int num2 = scn.nextInt();
						
		caclc:			switch (op) {
						
							case "+" :
								System.out.println(num1+" + "+num2+" = "+ (num1 + num2));
								break;
							case "-" :
								System.out.println(num1+" - "+num2+" = "+ (num1 - num2));
								break;
							case "*" :
								System.out.println(num1+" * "+num2+" = "+ (num1 * num2));
								break;
							case "/" :
								System.out.println(num1+" / "+num2+" = "+ (num1 / num2));
								break;
							default : 
								System.out.println("invalid operator");
								break caclc;
								
						}
				}
		}
	}
	
	
	
	
//	조건에 메소드를 넣어 처리하는 경우
//	파일의 내용을 가져올 때
//	stream을 가져올 때 > 더 이상 가져올 값이 없으면...
	
	
//	
//	int data = -1;
//	FileInputStream fis = new FileInputStream("test.txt")
//	while(data=fis.read())!=-1)
//	이런식으로... 이거 this is java에서 쪼금 맛 본거 아닌가? > 기본  API에서 봤던 것 같아!
	
	
//	for랑 반복문 문제..?만들기??
	
	
	public void doWhile() {
//		일단 반복될 구문을 최소 한 번은 실행한다.
//		그 후 조건을 확인해서 더 반복할지 혹은 중지할지 정한다.
		
		int a= 10;
		while(a>10) {
			System.out.println(a);
		}
		
//		위의 것은 한 번도 안돌죠?
		
		do {
			System.out.println(a);
		}while(a>10);
//		얘는 적어도 한 번은 돋아요...
//		while과 do while은 이런 차이점이 있어요
	}
	
	
	
//	중첩 반복문!!!
	public void nestedFor() {
			for (int i =0; i<10; i++) {
				System.out.println("==========");
					System.out.println("외곽 :"+i);
					System.out.println();
					for(int j=0; j<10; j++) {
							System.out.println("내곽 :"+j);
					}
			}
		
	}
	
	
	public void nine() {
		for (int i =2; i<10; i++) {
				System.out.println("========"+i+"단"+"=======");
				for(int k = 1; k<=9; k++) {
					System.out.println(i + " X " + k + " = " + i*k );
				}
				System.out.println();
		
		}
	}
	
//	많이 실수하는 것
	
	public void nineMistake() {
		for (int i =2; i<10; i++) {
				System.out.println("========"+i+"단"+"=======");
				for(int k = 1; i<=9; i++) {
					System.out.println(i + " X " + k + " = " + i*k );
				}
				System.out.println();
		
		}
	}
	
	
//	apple을 입력받고 각 문자별 중복 되는 개수의 확인
	public void compareString() {
		System.out.println("enter any vocabulary");
		String input = scn.next();
		char[] str = new char[input.length()];
			for(int i =0; i<input.length(); i++) {
				str[i] = input.charAt(i);
				
			}
			
			for(int i =0; i<input.length(); i++) {
				
					for(int j = 0; j<input.length(); j++) {
						if(str[i]==str[j]) {
							if(i!=j) {
								System.out.print(input+"의 "+(i+1)+" 번째 위치에 있는 "+ str[i]);
							System.out.println("가 "+ (j+1)+ "번째에 위치해 있는 " + str[j]+"와 중복됩니다.");
							}
						}	
					}
			}
		
	}
	
//	숫자야구 로직!
	
//	별을 또 찍어보아요
	
	
	public void fuckingStar() {
		System.out.println("나는 별이 진짜 싫어");
		for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print("*");
					if(j>=i) {
						System.out.println();
						break;
					}
				}
				
		}
		System.out.println("그만 찍을 때도 됐잖아!");
		for(int i =0; i<5; i++) {
				for(int j=4; j>=0; j--) {
					System.out.print("*");
					if(j<=i) {
						System.out.println();
						break;
					}
				}
		}
		
	}
}
