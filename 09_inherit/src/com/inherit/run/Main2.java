package com.inherit.run;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Student;

public class Main2 {

	public static void main(String[] args) {

		Student stu = new Student("유병승", 19, "남", 1,3,3);
		stu.print();
		Employee emp = new Employee("김상현", 29, "남","개발팀", "개발자",100);
		emp.print();		
//		우리가 만든 객체의 정보를 출력하는 메소드
		
//		참조형 자료형 변수는 변수를 호출했을 때 주소가 나와야한다.(toString)
//		자바 내부에서 참조형 자료형 변수를 호출했을 때 Object클래스의 toString()메소드를
//		호출하게 되어있다.
//		
		System.out.println(emp);
//		com.inherit.model.vo.Employee@3d012ddd
//		stu의 경우는 override를 했기 때문에 오버라이드를 한 녀석을 끌고 오는데
//		emp는 오버라이드를 안 했기 때문에! Object 클래스의 메소드를 사용
		
//		오버라이드를 하면  emp의 녀석을 끌고 옴 
		
		
		
//		.... 오버라이드를 응용
//		Object에 있는 녀석을 주로 오버라이드 많이 함
		
//		1. 객체의 동등성 비교
		
		Student bs = new Student("유병승", 19, "남", 1, 3, 1);
		Student sh = new Student("김상현", 19, "남", 1, 3, 1);
		
		System.out.println(bs == sh); // false 이러면 주소 값을 비교하는데?????????????????
		System.out.println(bs.equals(sh)); // false 
//		재정의한 것을 사용해볼까? == true;
		
//		 public boolean equals(Object obj) {
//        return (this == obj);
//	 	}
		
//		(String에서 equals는 오버라이드 됨)
		

		Employee ksh = new Employee("유병승", 29, "남", "개발부", "PM", 1000);
		Employee ybs = new Employee("유병승", 19, "남", "개발부", "PM", 1000);
		
		System.out.println("emp override : " + ksh.equals(ybs));
		
		
//		2.  동등성 비교할 때 주소 값고 가상으로 동일하게 해주기
//		Object hashcode()메소드를 재정의함
//		hashcod() :  객체의 주소를 출력해주는 메소드
//		equals 오버라이드 하여 구현할 때 hashcode메소드 까지
//		같이 오버리딩해서 처리해야
		
//		그래야 내부적으로 돌아갈 떄 잘 처리 됨
		
		
		System.out.println(ksh.hashCode());
		System.out.println(ybs.hashCode());
		
	}

}
