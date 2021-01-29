package com.poly.controller;

import com.poly.model.vo.*;

public class PolyController {
	
	
	
	public void printObjedct(Person person) {
		if(person instanceof Student) {
			Student s= (Student) person;
				System.out.println(s.getName()+" "+s.getGrade()+" "+s.getClassNo()+" "+s.getName());
			
		} else if(person instanceof Employee) {
			Employee e = (Employee) person;
			System.out.println(e.getName()+" "+e.getDeploy()+" "+e.getJob());
		}
	}
	
	
	
	
	
	public void printStudent(Student s) {
		System.out.println(s.getName()+" "+s.getGrade()+" "+s.getClassNo()+" "+s.getName());
	}
	
	public void printTeacher( Teacher t) {
		System.out.println(t.getName()+" "+t.getSubject()+" "+t.getMajor());
	}
	public void printEmployee( Employee e ) {
		System.out.println(e);
	}
}
