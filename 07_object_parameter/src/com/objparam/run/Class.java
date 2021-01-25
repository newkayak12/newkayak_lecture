package com.objparam.run;

import com.objparam.controller.ObjectParam;
import com.objparam.model.vo.Lunch;

public class Class {

	public static void main(String[] args) {
		// 나중에 서버에서 받으면 이 run 클래스 없이 그냥 계속 돌고 있으니까 나중에는 만들 필요가 없답니다... 그렇군요
		
		ObjectParam op = new ObjectParam();
		System.out.println("\n기본 자료형\n");
		int su = 100;
		String str = "호호호"; 
		
		op.basicParam(su, str);
		System.out.println(su + " : " + str);
		
//		1.기본 자료형 매개변수 ....
		
		
		// 출력 값이 "100 : 호호호" 가 된다.... 왜 안바뀔까???????
//  어떤 이유에서일까...?
//		main도 메소드, basicParam도 메소드 > 저장공간이 각각 열린다........?
//		main에 100:호호호 가 있고/  basicParam의 매개변수로 들어가면서 su/str이 생성 + 메인의 로컬변수가 복사됩
//		그러면 basicParam의 로컬변수가 연산이 된다.
//		그리고 메소드가 (basicParam ) 이 끝나면 해당 로컬 변수는 메모리에서 사라진다.
		
//		즉, 각 메소드 공간마다 로컬변수는 상이하게 형성된다. 그래서 백날 메소드로 수정해봤자 원하는 결과는 안나올 것..
		
//		만약 메소드로 위와 같은 연산을 하고 싶으면 return을 통해서 반환을 해야한다.
		
//		기본 자료형은 백날 메소드로 수정해도 의미가 없다. 결국 return을 통해서 반환해서 따로 수정을 거쳐야된다.
		
//		결국 반환형을 지정하고 여기에서 
//		su = basicParam(su,str); 이렇게 받아야한다. return으로.....
		
//		각각 메소드는 로컬 변수를 가지고 있다. 이 로컬 변수끼리는 return이 아니면 상호 영향력을 끼칠 수 없다. 
		
		
		
		
		
		//////////////////////////////////////////////////////////////
		
//		2.  배열은?
		System.out.println("\n배열");
		int[] arr = {1,2,3,4};
		
			System.out.println(arr);
			//주소값..
//			배열은 결국 변수명에 주소 값을 머금고 있으며, 인덱스로 인접한 메모리로 접근해서(그 타입의 공간 만큼) 해당 값에 접근하는 식으로 구성되어 있다.
			
			
		op.arrParam(arr);
		 	for(int i =0; i<arr.length; i++) {
		 		System.out.println(arr[i]);
		 	}
		 	
//		 	100
//		 	200
//		 	3
//		 	4
//		 	얘는 메소드로 수정이 됐다... 그 이유는 참조 객체이기 때문에 갖은 주소 값을 가지고 수정/출력한다.
//		 	(참조 객체)
		 	
		 	
		 	
		 	
		
		/////////////////////////////////////////////////////////////////
//		 	3. 객체는?
		System.out.println("\n객체");
		Lunch lun = new Lunch();
		lun.setCategory("한식");
		lun.setName("청국장");
		lun.setPrice(9000);
		lun.setCapacity(1);
			System.out.println("메소드 사용 전\n");
			System.out.println(lun.getCategory()+"\n"+lun.getName()+"\n"+lun.getPrice()+"\n"+lun.getCapacity());
			op.objParam(lun);
			System.out.println("\n메소드 사용 후\n");
			System.out.println(lun.getCategory()+"\n"+lun.getName()+"\n"+lun.getPrice()+"\n"+lun.getCapacity());
		
		
// heap 영역에 생성된 저장소는 주소 값을 알면 어떤 stack 영역에서도 접근이 가능함.... > C++에서 포인터를 사하는 이유

			
			
//			기억해야할 것??????
//			
			System.out.println("기억해야할 것????");
			op.setCheck("대입!! 값");
			op.checkTest();
			
			System.out.println("\n새로운 객체");
			new ObjectParam().setCheck("이건");
//			 어?? 왜 "이건"으로 안 바뀐거지?? 라고 하면 새로운 객체를 생성했으니까 그렇지..... 자주하는 실수라는게 이런거구나.?
			new ObjectParam().checkTest();
			
			
	}

}
