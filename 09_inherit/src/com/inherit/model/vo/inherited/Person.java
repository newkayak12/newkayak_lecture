package com.inherit.model.vo.inherited;

public /*final*/ class Person {
	
//	The type Employee cannot subclass the final class Person
//	final 모체에 선언하면 자식 객체에 위와 같은 에러를 뿜는다.
//	이 역시 설계단계에서 고려한다. 
//	final 클래스의 예시 String 클래스...
	
	
	private String name;
	private int age;
	private String gender;
	protected String email;
	
	
	public Person() {
	}
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
//	 부모의 메소드 지정 -> 객체 정보를 출력하는 메소드
	public void print()	{
		System.out.print((name+" "+age+" "+gender));
	}
	
}
