package test_ex02_obj_restart.model.vo;

public class Student {
	private String name, address, school;
	private int age, java, c, python, swift;
	public Student(String name, String address, String school, int age, int java, int c, int python, int swift) {
		super();
		this.name = name;
		this.address = address;
		this.school = school;
		this.age = age;
		this.java = java;
		this.c = c;
		this.python = python;
		this.swift = swift;
	}
	
	
	
	public Student(String name, String address, String school, int age) {
		super();
		this.name = name;
		this.address = address;
		this.school = school;
		this.age = age;
	}



	public Student() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getJava() {
		return java;
	}


	public void setJava(int java) {
		this.java = java;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	public int getPython() {
		return python;
	}


	public void setPython(int python) {
		this.python = python;
	}


	public int getSwift() {
		return swift;
	}


	public void setSwift(int swift) {
		this.swift = swift;
	}
	
	@Override
	public String toString() {
		
		
		return name+"\t"+age+"\t"+school+"\t"+address+"\t"+java+"\t"+c+"\t"+python+"\t"+swift+"\n";
	}
	
}
