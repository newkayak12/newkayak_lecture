package com.repeat.break_continue;

import java.util.Scanner;

public class BreakContinue {
	Scanner scn = new Scanner(System.in);

//	분기문은 실행되는 로직을 중간에 중단시키는 예약어
//	break;와 continue;문이 있음
	
//	break는 실행되는 {} 로직을 중단한다. > switch/for/while등에서 사용 (무한루프 로직에서 많이 사용)
//	continue는 실행되는 {} 로직 중에서 continue예약어가 나온 다음 라인에 있는 코드를 생략
//	break문이나 continue문은 일반적으로 조건문에 같이 사용
	
	
	//무한 for에서 루프를 깰 때 사용
	
	public void breakTest() {
		String orderMenu= " ";
			while(true) {
			System.out.println("=====점심 주문 프로그램=====");
			System.out.println("1. 회");
			System.out.println("2. 연어 덮밥");
			System.out.println("3. 감자탕");
			System.out.println("4. 샌드위치");
			System.out.println("========================");
			System.out.print(">");
		int cho = scn.nextInt();
			
			switch(cho) {
				case 1: orderMenu+="회\n";
						break;
				case 2:orderMenu+="연어 덮밥\n";
						break;
				case 3:orderMenu+="감자탕\n";
						break;
				case 4:orderMenu+="샌드위치\n";
						break;		
				
			}
			System.out.println("계속 주문하시겠습니까? (y/n)");
			char select = scn.next().charAt(0);
				if(select=='n') {
					System.out.println("주문내역");
					System.out.println(orderMenu);
					break;
				}
			}   //while종료
			
			
		System.out.println("system terminated");
	} 
	
//	continue : 생략의 개념??
	
	
	public void continueTest() {
		for (int i = 0; i<10; i++) {
			if(i%2==0) {
				continue;
//				continue를 만나면 밑에 있는 코드는 생략하고 for문을 이어서 시작
			}
			System.out.println(i);
		}
	}
	public void continueTest2() {
			
		for ( int m = 1; m<10; m++) {
//			if(m%2==1) {
//				continue;
//			}
			System.out.print(m+"단 출력?? (1.y 2.n)");
			if(scn.nextInt()==2) {
//				continue;
				break;
			}
			for(int j = 1; j<10; j++) {
				System.out.println(m+ " X " +j + " = " + m*j);
			}
		}
		
	}
	
	public void nestedbreak() {
		for (int i =2; i<10; i++) {
			for(int j =1; j<10; j++) {
				if(j>5) {
					break;
				}
				System.out.println(i+ "X" + j + "=" + i*j);
			}
		}
	}
	
	
	public void nestedbreaklabel() {
gugu:   for (int i =2; i<10; i++) {
			for(int j =1; j<10; j++) {
				if(j>5) {
					break gugu;
				}
				System.out.println(i+ "X" + j + "=" + i*j);
			}
		}
	}
	
//	문자열을 입력받고 그 문자열 내에서 중복값이 있으면
//	중복값 발생!이라고 띄우고 * 자기 자신은 제외하고
	
	public void exam01() {
			System.out.print("Enter any vocabularay : ");
		String str = scn.next();
		boolean test = false;
label:		for(int i =0; i<str.length(); i++) {
				
				for(int j =0; j<str.length(); j++) {
					
					if((i!=j)&&str.charAt(i)==str.charAt(j)) {
						System.out.println(str.charAt(j)+"에서 중복값 발생!  " +str+"의 "+(i+1)+" 번째 값"+str.charAt(i)+"과(와)" +(j+1)+"번째 값"+str.charAt(j)+"이 중복됩니다.");
							test=true;
							
					} 
					
				}
					
					
			}

					if(test==false) {
						System.out.println("중복된 값이 없습니다. ");
					}
				
				

				
	
			
	}
	
	
	
	
	
	
}
