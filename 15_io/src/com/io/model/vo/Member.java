package com.io.model.vo;

import java.io.Serializable;

public class Member implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1095199701982175092L;
	
	
	
	private String id, pw;
	private char gender;
	private int age;
	private double height;
	private double weight;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "id " + id + "  pss " + pw + "  gen " + gender + "  age " +age + "  height " + height+ "  weight " + height;
	}
	
}
