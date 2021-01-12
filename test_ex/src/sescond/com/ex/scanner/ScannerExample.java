package sescond.com.ex.scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			String name, addr;
			int age;
			double height, weight;
				System.out.print("your name?");
				name=sc.nextLine();
				System.out.print("your age?");
				age=sc.nextInt();
				System.out.print("your height?");
				height=sc.nextDouble();
				System.out.print("your weight?");
				weight=sc.nextDouble();
				System.out.print("your address?");
				sc.nextLine();
				addr = sc.nextLine();
				
				System.out.println("\n name : " +  name +"\n age : " + age + "\n height : " + height + "\n weight : " + weight + "\n address : " + addr);
				
	}

}
