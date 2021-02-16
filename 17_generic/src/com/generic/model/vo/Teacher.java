package com.generic.model.vo;

public class Teacher extends Person{
	private String subject;
	private String major;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String subject, String major) {
		super();
		this.subject = subject;
		this.major = major;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
