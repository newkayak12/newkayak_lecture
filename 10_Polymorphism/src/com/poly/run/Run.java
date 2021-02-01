package com.poly.run;

import java.util.*;


import com.poly.controller.PolyController;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Student;
import com.poly.model.vo.Teacher;

public class Run {

	public static void main(String[] args) {
		Person p = new Person("기본",  "서울시", 20);
		System.out.println(p.getName()+p.getAge()+p.getAddress());
		
		Student s = new Student("유병승", 19, "경기도 시흥", 1, 3, 3);
		
		Employee e = new Employee("김상현", 29, "서울시", "개발", "사원", 100);
		
		System.out.println(s);
		System.out.println(e);
		
//		다형성
//		부모 변수가 자식객체를 보관할 수 있게 하는 것
		p = s;
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddress());
//		s=e;
//		Type mismatch: cannot convert from Employee to Student
//		서로 다른 자식인데 어떻게??
		p = e;
//		상호 상속 관계니까 가능한거지
		Person p1 = new Employee();
		
		p1= new Student();
//		p1=new Scanner(); 상속 관계가 아니기 때문에 들어갈 수 없음
//		p1 = new Teacher(); 상속 관계가 아니니
		p1 = new Teacher(); //상속 받으면 된다고요
		
//		부모타입의 변수에 자식 객체를 대입했을 떄
//		그 변수는 부모 클래스에서 선언한 내용만 접근이 가능합니다.
//		p.
		
		
		
//		다시 자식객체에 접근하려면 강제 형 변환을 하면 된다.
//		(Employee) p.
		Employee j = (Employee) p;
		
		
		
//		Person p에 Person/Employee/Student/Teacher 누가 들어갈지 모르지
//		>가능성이 있는거지
//		그래서 부모 변수에 자식 객체가 어떤 것인지 확인하고 싶을 때
//		instanceof를 사용한다.
//		[부모에 들어간 변수 명 instanceof 확인할 클래스](부모에 들어간 애가 확인할 클래스랑 같은 타입이니?)
//		맞으면  true; 아니면 false
		
		
		System.out.println(p instanceof Student); //p 가 Student니?
		System.out.println(p instanceof Employee);
		
//		이걸로 분기 처리를 할 수 있지
		
		
		
		
		
//		Object의 강력함??
		
		Object obj;
		obj= new Scanner(System.in);
		obj= new Date();
		obj= "이거봐라?";
		
//		이렇게 superclass인 Object 타입으로 넣으면 다 되네
		
		System.out.println(s.equals("유병승"));
		/*
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * java.lang.String cannot be cast to class com.poly.model.vo.Student
		 * (java.lang.String is in module java.base of loader 'bootstrap';
		 * com.poly.model.vo.Student is in unnamed module of loader 'app') at
		 * com.poly.model.vo.Student.equals(Student.java:56) at
		 * com.poly.run.Run.main(Run.java:77)
		 */
		
//		instanceof를 안썼을때..
		
		
		PolyController poly = new PolyController();
		poly.printEmployee(e);
		poly.printStudent(s);
		poly.printTeacher(new Teacher("자바", "음악"));
		
//		이렇게나 많이 만들어야되??? 거의 객체 마다 만들어야되네?
		
		
		poly.printObjedct(e);
//		메소드 안에서 사용할 수 있다고요
		
		
//		다형성을 이용하면 데이터 관리를 더 편하게 할 수 있다.
		
		Student[] students = new Student[10];
		Employee[] emps = new Employee[10];
		Teacher[] teachers = new Teacher[10];
		
//		프로그램에서 관리하고 있는 data를 구하세요
		
		students[0] = new Student("유병승",19	,"시흥",1,2,3);
		students[1] = new Student("홍서연", 27, "왕십리", 2,3,13);
		emps[0] = new Employee("김예진", 26, "서울시", "개발팀", "개발자", 200);
		emps[1] = new Employee("김태희", 26, "건대", "영업팀", "영업부장", 100);
		
		int count = 0;
			for(int i =0; i<students.length; i++) {
				if(students[i]!=null) {
					count++;
				}
			}
		
			for(int i =0; i<emps.length; i++) {
				if(emps[i]!=null) {
					count++;
				}
			}	
			
			for(int i =0; i<teachers.length; i++) {
				if(teachers[i]!=null) {
					count++;
				}
			}
		
		System.out.println("관리 중인 사람의 수 : "+count);
//		이러면 굉장히 많아지지???
//		그러면 어떻게 할거야... 다형성을 이용해서 한 개 자료형으로 객체 배열에 보관하면 편리하게 관리할 수 있다.
		
		Person[] persons = new Person[40];
		persons[0] = new Student("유병승",19	,"시흥",1,2,3);
		persons[1] = new Student("홍서연", 27, "왕십리", 2,3,13);
		persons[2] = new Employee("김예진", 26, "서울시", "개발팀", "개발자", 200);
		persons[3] = new Employee("김태희", 26, "건대", "영업팀", "영업부장", 100);
		
		
		int icount =0;
		for(int i =0; i<persons.length; i++	) {
			if(persons[i]!= null) {
				icount ++;
			}
		}
		System.out.println("관리 중인 사람 : "+icount);
		
		System.out.println("===============");
//		배열에서 각각의 자료를 출력하고 싶다.
		
		
		
//		예시
		for(int i =0; i<persons.length; i++	) {
			System.out.println(persons[i]);
		}
//		()-> 동적 바인딩
		
		
		
		
		
		
		System.out.println("\n\n\n\n\n");
		int rcount =0;
		for(int i =0; i<persons.length; i++	) {
			if(persons[i]!= null) {
				
				if(persons[i] instanceof Student) {
					Student s1 = (Student) persons[i];
					System.out.println(s1.getName()+" "+s1.getGrade());
				} else if(persons[i] instanceof Employee) {
					Employee em = (Employee) persons[i];
					System.out.println(em.getName()+" "+em.getJob());
				}
			}
		}
		
		
		
//		for - each 문 /advanced for
		for(Person p0 : persons) {
			
			if(p0!= null) {
				
				if(p0 instanceof Student) {
					Student s1 = (Student) p0;
					System.out.println(s1.getName()+" "+s1.getGrade());
				} else if(p0 instanceof Employee) {
					Employee em = (Employee) p0;
					System.out.println(em.getName()+" "+em.getJob());
				}
			}
		}
		
	}
	
	
	
	
	
	
	

}
