
package com.inherit.model.vo;

import java.util.Objects;

import com.inherit.model.vo.inherited.Person;

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
	
	
	public Employee(String name, int age, String gender, String department, String job, int salary) {
		super(name, age, gender);
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

	@Override
	public void print() {
		super.print();
		System.out.println(" "+department+" "+job+" "+salary);
	}
//	이렇게 상황에 따라서 부모의 메소드를 바꿔야할 때가 온다. 그렇다면 위와 같이 오버라이드를 해주면 손 쉽게 바꿀 수 있다.
	
	
//	오버라이드 상태에서 메소드 선언부를 바꾸면 (어노테이션을 주고나서)
//	he method println() of type Employee must override or implement a supertype method
//	어노테이션이 있으면 이 부분에 대해서 체크해준다. > 조금 더 안정적으로 사용할 수 있게한다. 
	@Override
	public String toString() {
		
		return super.getName()+" "+super.getAge()+" "+super.getGender()+" "+department+" "+job+" "+salary;
	}


	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		} else if ( obj instanceof Employee) {
			Employee other = (Employee) obj;
			if( (super.getName().equals(other.getName())) && department.equals(other.department) && job.equals(other.job) ) {
				
				return true;
			}
		}
		
		return false;
	
	}
	
	
	@Override
	public int hashCode() {
		
	
		return Objects.hash(getName(),department, job);
	}
	
	
	
//	native는 다른 언어에서 구현한 것을 가지고 오는 것
	
	
}
