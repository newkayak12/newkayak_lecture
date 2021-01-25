package com.objparam.controller;

import com.objparam.model.vo.Lunch;

public class ObjectParam {
//	기억해야할 것??????
	private String check;
	
	
	
	
	
	
	//1. 기본 자료형 매개변수, 객체,배열 매개변수의 차이
	public void basicParam(int su, String str) {
			su++;
			str += "기본 자료형 더하기";
			
	}
	
	public void arrParam(int[] arrInt) {
		arrInt [0] = 100;
		arrInt [1] = 200;
	}
	
	public void objParam(Lunch lunch) {
		lunch.setName("햄버거");
		lunch.setPrice(8000);
	}
	
//	객체 타입을 집어 넣는다고?????????????????
//	어떤걸 하시려고 객체 타입을 집어 넣으시는거지
	
	
	
	
//	기억해야할 것??????
	public void checkTest() {
		check+="10";
		System.out.println(check);
	}
	public void setCheck(String check) {
		this.check= check;
		
	}
}
