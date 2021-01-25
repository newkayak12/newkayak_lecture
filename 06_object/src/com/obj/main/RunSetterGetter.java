package com.obj.main;

import com.obj.setter_getter.Person;
import com.obj.setter_getter.WrongNumberException;

public class RunSetterGetter {

	public static void main(String[] args) {
		
		Person per = new Person();
		per.setName("유병승");
		per.setAddress("경기도 시흥");
		
		try {
			per.setAge(19);	
		} catch ( WrongNumberException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
		
		per.setHeight(180.5);
		per.setWeight(65.5);
		per.inform();
		
		//객체 출력
//		System.out.println(per.getName() + " "+ per.getAddress() ...............per.getHeight());
		
//		Class[] person = new Class [10];
		
		
//		프레임워크로 가면 getter/setter를 자주 이용 _ 이 규약을 준수하는 편이 좋음...
//		프레임워크가 간혹 못 찾을 수도 있음
//		또한 private String pName 이렇게 한글자만 쓰지 않는게 좋다. 간혹 오작동할 수도 있음(못찾을 수도)
//		
		
//		per.name = "김상현";
//		안되겠지?? private로 선언해서 함부로 진입 자체가 안되겠지???(캡슐화...)
//		이 멤버 변수에 접근할 수 있게(필드/멤버 변수) 메소드를 추가한다. > 클래스 내부에서는 private 인 녀석에 접근 할 수 있으니까
		
		
		
		
		Person per2 = new Person("kim", "guro", 29,170.1,70.2);
		
		
	}

}
