package com.generic.controller;

public class MyGeneric <T> {
	
	private T temp;

	
	public MyGeneric() {
	}
	
	
	public MyGeneric(T temp) {
		this.temp = temp;
	}


	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
	
	

}
