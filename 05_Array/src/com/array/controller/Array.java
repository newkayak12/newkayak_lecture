package com.array.controller;

public class Array {

	
	
	public void basicArray() {
//	배열은 동일한 자료형의 변수 여러 개를 관리하는 것
//		배열의 선언은 변수와 비슷함 자료형 뒤에 []를 붙이거나 변수명 뒤에 []를 붙여준다.
//			배열은 선언을 한다고 바로 사용할 수 없다. 선언 후 바로 할당을 해줘야 한다. 
//			 	얘도 객체형식
//					할당은 new 연산자를 통해서 할당함 new 자료형[생성할 변수의 갯수]
//		자료형 [] 변수명 = new 자료형[ 배열의 개수];
		
//		배열 선언하기
		
		int[] nums;
		nums=new int[5];
//		혹은
		int[] nums2= {1,2,3,4,5};
//		혹은
		int[] nums3= new int[5];
//		int[] nums4= new int[]
		System.out.println("nums[0] did not initialize :"+ nums[0]);
//		따로 초기화 안 하면 모든 타입의 기본값이 들어간다. int는 0 double은 0.00 String은 "null" char는 ' '(공백)
		
		nums[0]	= 100;
		System.out.println("nums[0] initialized : " + nums[0]);
		
		
//		길이(index 번호)의 최대값을 넘어서 접근을 하면 어떻게 될까
		System.out.println(nums[6]);
//		ArrayIndexOutOfBoundsException
	
	}
}
