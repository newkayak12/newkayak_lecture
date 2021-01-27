package com.inherit.model.vo;

import com.inherit.run.Person;

public class Employee extends Person {
	
	private String department;
	private String job;
	private int salary;
	
	


	public String getDepartment() {
		return department;
	}

	public Employee() {
		super();
	}
	
	
	public Employee(String department, String job, int salary) {
		super();
		this.department = department;
		this.job = job;
		this.salary = salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job)  {
		this.job = job;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}




	
	
	
	
}
