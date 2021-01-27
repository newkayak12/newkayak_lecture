package com.inherit.model.vo;

import com.inherit.run.Person;

public class Student extends Person{
	
//	이러면 Object와의 상속관계가 끊어진다. 그러나 부모클래스인 Employee가 Object를 상속하고 있으므로 상관이 없는 부분이다.
//	private String name;
//	private int age;
//	private char gender;
	private int grade;
	private int group;
	private int number;
	
	public Student() {
		super();
	}
	public Student(int grade, int group, int number) {
		super();
		this.grade = grade;
		this.group = group;
		this.number = number;
	}
	public Student(String name,int age, String gender, int grade, int group, int number) {
		super(name, age, gender);
		this.grade = grade;
		this.group = group;
		this.number = number;
	}
	
//	public Student(String name, int age, char gender, int grade, int group, int number) {
//		this.name=name;
//		this.age=age;
//		this.gender = gender;
//		this.grade = grade;
//		this.group = group;
//		this.number = number;
//	}
	
	
	
//	public void setName (String name) {
//		this.name = name;
//	}
//	public void setAge(int age) {
//		this.age =age;
//	}
//	public void setGender(char gender) {
//		this.gender=gender;
//	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	

	public void setGroup (int group) {
		this.group=group;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	
	
//	public String getName() {
//		return name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public char getGender() {
//		return gender;
//	}
	public int getGrade() {
		return group;
	}
	public int getGroup() {
		return group;	
	}
	public int getNumber() {
		return number;
	}
	
	
	
	
	
	@Override
		public String toString() {
//객체의 정보를 출력 할 떄 사용했다. 
//		그러나 이번엔 오버라이드하는 느낌적인 느낌이다....
//		자기 멤버 변수는 바로 사용할 수 있다. 
//		그런데 super는??
		
	
	
	
	
		return super.getName()+"\n"+super.getAge()+"\n"+super.getGender()+"\n"+grade+"\n"+group+"\n"+number;
//		String으로 만들어줬지? int랑 String을 더하면 String이 되니까
//		super()는 생성자/ super은 부모클래스의 주소값 
//		name으로 쓰면 The field Person.name is not visible 즉, private
		
		

//		부모에서 멤버변수가 private으로 선언되어있으면 상속관계라도 직접접근이 불가능하다. 
//		만약 자식에서 메소드를 찾았는데 없으면 부모 것을 찾기 시작한다. (이름이 같지 않는다면)
//		그래서 super.getName()으로 안쓰고 getName()으로 써도 부모 것으로 찾아갈 것이다. 
//		클래스 테이블을 그리면서 천천히 접근해가면 코드의 용이성, 유지보수의 용이성을 생각하면서 설계할 수 있다.
		
//		프로그래머가 유지 보수(사용자의 요구에 따라서)를 할 필요성이 생기기 시작한다.
//		그에 따라서 유지보수 자체를 더 효율적으로 할 수 있는 방법은 처음에 제대로 된 설계를 하는 것이다. 
//		
		
		}
}
