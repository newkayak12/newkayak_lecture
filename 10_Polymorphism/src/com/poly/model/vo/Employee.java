package com.poly.model.vo;

import java.util.Objects;

public class Employee extends Person {
 private String deploy, job;
 private int salary;
	 public Employee() {
		// TODO Auto-generated constructor stub
	 }
	 
	 public Employee(String name, int age, String address) {
		 super(name, address, age);
	 }
	 
	 
		
	public Employee(String name, int age, String address, String deploy, String job, int salary) {
//		this(name, age, address, deploy, job, salary);
		super(name, address, age );
		this.deploy = deploy;
		this.job = job;
		this.salary = salary;
	}
	public String getDeploy() {
		return deploy;
	}

	public void setDeploy(String deploy) {
		this.deploy = deploy;
	}

	public String getDepoly() {
		return deploy;
	}
	public void setDepoly(String depoly) {
		this.deploy = depoly;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
		public String toString() {
		return super.getName()+" "+super.getAge()+" "+super.getAddress()+" "+deploy+" "+job+" "+salary;
		}
	@Override
		public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		
		if(obj instanceof Person) {
			Employee other = (Employee) obj;
			
			if( (super.getName().equals(other.getName())&&(super.getAge()==other.getAge())&& (super.getAddress().equals(other.getAddress())&&(deploy.equals(other.deploy)&&(job.equals(other.job)&&(salary==other.salary)))))){
				return true;
			}
		}
		
		return false;
		}
	@Override
		public int hashCode() {
		return Objects.hash(super.getName(),super.getAge(),super.getAddress(), deploy, job, salary);
		}
}
