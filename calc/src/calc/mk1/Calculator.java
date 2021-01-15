package calc.mk1;

import java.util.Scanner;

public class Calculator {

//		계산기 프로그램 만들기 
//		1. 한 번만 실행
//		2. 입력한 수 만큼 쓸 수 있는 계산기
		Scanner sc = new Scanner(System.in);
		
		public void calc () {
			
			System.out.println("number");
		int n1 = sc.nextInt();
			System.out.println("operator");
		String op = sc.next();
			System.out.println("number");
		int n2 = sc.nextInt();
			
		double result;
		if(op.equals("+")) {
			result =(double)n1+n2;
			System.out.println(result);
		} else if(op.equals("-")) {
			result =(double)n1-n2;
			System.out.println(result);
		} else if(op.equals("*")) {
			result =(double)n1*n2;
			System.out.println(result);
		} else if(op.equals("/")) {
			result =(double)n1/n2;
			System.out.println(result);
		}
		
		}
		
////////////////////////////////////////////////		
		public void trycalc ( ) {
				System.out.println("count : ");
			int count = sc.nextInt();
			for (int i = 1; i <=count; i++) {

				System.out.println("number");
			int n1 = sc.nextInt();
				System.out.println("operator");
			String op = sc.next();
				System.out.println("number");
			int n2 = sc.nextInt();
				
			double result;
			if(op.equals("+")) {
				result =(double)n1+n2;
				System.out.println(result);
			} else if(op.equals("-")) {
				result =(double)n1-n2;
				System.out.println(result);
			} else if(op.equals("*")) {
				result =(double)n1*n2;
				System.out.println(result);
			} else if(op.equals("/")) {
				result =(double)n1/n2;
				System.out.println(result);
			} 
				
			}
		}
		
		
		
}
