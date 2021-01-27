package com.inherit.run;

import java.util.Scanner;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Student;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		Employee e1 = new Employee();
		
		System.out.println(s1.hashCode());
//		클래스는 기본적으로 Object클래스를 상속받고 있다. > hashCode는 Object에 있는 메소드를 상속받아서 사용하는 것
		System.out.println(e1.toString());
		System.out.println(e1.hashCode());
		
		
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println(scn.hashCode());
		
		
		
//		상속관계를 설정하면 자식클래스(sub)는 부모클래스(super)의 멤버 변수,메소드를 사용할 수 있다. 
//		s.get이러면 자기 것만 나옴.
//		상속하면??
//		s.get에 상속받은 녀석의 것들 다 나옴...
//		s.setDepartment("java");
//		System.out.println(s.getDepartment());
//		System.out.println(e.getDepartment());
//		이러면 부모 클래스의 녀석은 바뀌지 않고, 상속받은 녀석의 값을 바꾼다. 심지어 자식에 선언이 따로 안되어있는데도 말이다..
		
//		호환성을 위해 char를 String으로 바꾸면서 Person에 기본 멤버변수를 옮겼다. 그리고 Person을 Student와 Employee가 상속받으면서
//		기본 정보를 그대로 사용할 수 있게 되었다.
		Student s = new Student();
		 
		s.setName("유병승");
		s.setAge(19);
		s.setGender("남자");
		s.setGrade(1);
		s.setGroup(3);
		s.setNumber(9);
		
		System.out.println(s.getName()+s.getAge()+s.getGender());
		
//		Student 클래스에 name, age, gender가 없음에도 사용할 수가 있다. 이게 상속 때문이다... 
		
		Employee e = new Employee();
		e.setName("이민아");
		e.setAge(26);
		e.setGender("남성");
		e.setDepartment("연부");
		e.setJob("연기");
		e.setSalary(10000);
		
		System.out.println(e.getName()+e.getAge()+e.getGender());
		
//		생성시부터 데이터를 넣고 초기화하기 > 생성자를 이용한다. 
		
		Student s2 = new Student("유병승",19,"남성",3,3,9);
			System.out.println(s2.getName()+s2.getAge()+s2.getGender()+s2.getGrade()+s2.getGroup()+s2.getNumber());
//		자식생성자에서 부모 생성자를 호출할 수 있음 (super();)
//		생성된 부모클래스를 지칭하는 예약어는 > super();>부모 클래스의 생성자를 호출....
			
//			자기 자신의 생성자를 호출한다고????
//		this() > 나 자신의 생성자를 호출
//		 이걸 응용하면 부모는 
//			super();
			
			
			
		
	}

}
