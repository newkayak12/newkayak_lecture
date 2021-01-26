package com.objarr.run;

import com.objarr.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons;
		persons= new Person[5];
		
		persons[0] = new Person("유병승", 19, "남", "01036446259");
		persons[1] = new Person("김상현", 29, "남", "01027114160");
		persons[2] = new Person("김태희", 26, "남", "01031223428");
		persons[3] = new Person("김예진", 26, "여", "01022209928");
		persons[4] = new Person();
			
				for(int i =0; i<persons.length; i++) {
					System.out.println(persons[i].getName()+"\t"+persons[i].getAge()+"\t"+persons[i].getGen()+"\t"+persons[i].getpNum());
				}
			
	}

}
