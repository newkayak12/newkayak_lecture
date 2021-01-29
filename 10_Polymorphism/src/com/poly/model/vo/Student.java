package com.poly.model.vo;

import java.util.Objects;

public class Student extends Person	{
	private int grade, classNo, number;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int grade, int classNo, int number) {
		super();
		this.grade = grade;
		this.classNo = classNo;
		this.number = number;
	}
	public Student(String name, int age, String address, int grade, int classNo, int number) {
		super(name, address, age );
		this.grade = grade;
		this.classNo = classNo;
		this.number = number;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public void setClassNO(int classNo) {
		this.classNo = classNo;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
	return super.getName()+" "+super.getAge()+" "+super.getAddress()+" "+grade+" "+classNo+" "+number;
	}
	
	@Override
	public boolean equals(Object obj) {
	if(this==obj) {
		return true;
	}
//	
	if(obj instanceof Person) {
		Student other = (Student) obj;
		
		if( (super.getName().equals(other.getName())&&(super.getAge()==other.getAge())&& (grade==other.grade)&&(super.getAddress().equals(other.getAddress()))&&(classNo==other.classNo)&&(number==other.number))){
			return true;
		}
	}
	
	return false;
	}
	
	@Override
	public int hashCode() {
	return Objects.hash(super.getName(),super.getAge(),super.getAddress(), classNo, number, grade);
	}
	
}
