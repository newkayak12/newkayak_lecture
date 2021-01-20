package com.obj.main;

import com.obj.controller.BasicObjTest;
//import com.obj.controller.DefaultTest;
// The type com.obj.controller.DefaultTest is not visible
// 열람 불가
import com.obj.controller.FieldTest;

//import com.obj.controller.Test;
// The import com.obj.controller.Test cannot be resolved
// 선언 안했는데 변수명 사용할 때와 같다. 즉, 아예 없다는 


public class Run {

	public static void main(String[] args) {
		BasicObjTest bot = new BasicObjTest();
//		DefaultTest dt = new DefaultTest();
//		얘는 default  클래스이고 외부패키지에서 접근이 불가하다.
//		default는 같은 패키지에서만 사용할 수 있는 클래스다. 
//		통상 public을 사용하고 진짜 필요할 떄 아니면 거의 접근제한 안 함
		
		
//		import
		com.obj.controller.ImportTest it= new com.obj.controller.ImportTest();
//		이렇게 한 번만 쓴다고 하면 굳이 import없이 이렇게 하면 된다.
		
		
		
//		FieldTest 클래스 내부에 접근하기
//		1. 생성을 해야한다. 
		FieldTest ft = new FieldTest();
//		새로운 객체를 생성해서 heap에 넘김
//		2. 생성한 클래스의 주소를 가지고 접근을 함
//		3. 생성된 필드에 접근하기
//		ft(변수명)+ '.'(접근연산자)+name(FieldTest에 있는 필드)
//		ft.name;
			System.out.println(ft.name); //null
			//heap에서 생성되는 녀석, 자동 초기화 됨
//			System.out.println(ft.age);	
//			default
//			System.out.println(ft.email);
//			private
			
//		4.필드에 값을 주입하기
			ft.name="김두호";
			System.out.println(ft.name);

			
//			BasicObjTest에서 메소드를 생성하고 
//			FieldTest에 있는 name을 불러서 출력해보자
//			위의 ft.name;과 같은 값이 나올까??
			bot.fieldTest();
			
			
//			즉, 객체가 heap에 저장되기 때문에 다른 객체를 열람하는 것과 같다.
//			그렇기 때문에 같지 않다.
			
//			그러면 외부에서 열람할 수 있는 방법이 없을까??
//			private를 설정한 클래스 내부에서 메소드를 통해서 간접열람할 수 있다.
			
			ft.test();
//			이렇게 말이다.
			
	}

}
