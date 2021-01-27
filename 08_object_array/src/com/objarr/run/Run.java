package com.objarr.run;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.objarr.model.vo.Person;

public class Run {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Person[] persons;
		persons= new Person[5];
		
//		persons[0] = new Person("유병승", 19, "남", "01036446259");
//		persons[1] = new Person("김상현", 29, "남", "01027114160");
//		persons[2] = new Person("김태희", 26, "남", "01031223428");
//		persons[3] = new Person("김예진", 26, "여", "01022209928");
//		persons[4] = new Person();
		
		
			for(int i =0; i<persons.length; i++) {
					System.out.print("name : ");
//				persons[i].setName(scn.next());
//				NullPointerException  >  배열만 만들었지 그 안에 들어가는 객체는 안 만들어서
				String name = scn.next();
					System.out.print("age : ");
				int age = scn.nextInt();
					System.out.print("gender : ");
				String gen = scn.next();
					System.out.print("phoneNumber : ");
				String pNo = scn.next();
				String proto = "\\d{3}-\\d{3,4}-\\d{3,4}";
				boolean pNoMatch = Pattern.matches(proto, pNo);
				String tpNo=" ";
					if(pNoMatch) {
						tpNo = pNo;
					} else {
						System.out.println("잘못된 전화 번호");
					}
					
				persons[i]	= new Person(name, age, gen, tpNo);
				System.out.println(persons[i]);
//				이렇게 해도 toString 오버라이드 된게 호출되는구나...
			}
			
//				for(int i =0; i<persons.length; i++) {
//					System.out.println(persons[i].getName()+"\t"+persons[i].getAge()+"\t"+persons[i].getGen()+"\t"+persons[i].getpNum());
//				}
			
	}

}
