package com.obj.main;

import com.obj.controller.Animal;
import com.obj.controller.BasicObjTest;
//import com.obj.controller.DefaultTest;
// The type com.obj.controller.DefaultTest is not visible
// 열람 불가
import com.obj.controller.FieldTest;
import com.obj.controller.InitBlockTest;
import com.obj.controller.Student;

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
//			System.out.println(ft.name); //null
			//heap에서 생성되는 녀석, 자동 초기화 됨
//			System.out.println(ft.age);	
//			default
//			System.out.println(ft.email);
//			private
			
//		4.필드에 값을 주입하기
			ft.name="김두호";
//			System.out.println(ft.name);
			
//			ft.name = "구로구 구로동";
//			이렇게 원치 않는 임의 값이 입력될 수도 있다.\
//			이걸 못하게 하려고 캡슐화를 한다. 
			
//			BasicObjTest에서 메소드를 생성하고 
//			FieldTest에 있는 name을 불러서 출력해보자
//			위의 ft.name;과 같은 값이 나올까??
//			bot.fieldTest();
			
			
//			즉, 객체가 heap에 저장되기 때문에 다른 객체를 열람하는 것과 같다.
//			그렇기 때문에 같지 않다.
			
//			그러면 외부에서 열람할 수 있는 방법이 없을까??
//			private를 설정한 클래스 내부에서 메소드를 통해서 간접열람할 수 있다.
			
//			ft.test();
//			이렇게 말이다.
			
			FieldTest.nickName="박명수";
//			FieldTest.name="김상현";
//			이렇게는 사용할 수 없다. 왜냐하면 static이 아니니까
//			FieldTest.height=180.5;
//			private라 사용 불가
//			The field FieldTest.height is not visible
			
			
			
			
//			초기화 블럭 이해하기
//			InitBlockTest ib = new InitBlockTest();
//			System.out.println("\n name "+ib.name+"\n age "+ib.age+"\n hegit "+ib.height);
//			
//			InitBlockTest ib2 = new InitBlockTest();
			
			//static initialize
//			initianlize
//			initianlize
//			static은 최초 한 번만 실행된다.
				System.out.println(InitBlockTest.address);
				System.out.println();
			
//			student 클래스를 만들어보고 
//			모든 필드는 전체에 접근할 수 있게 설정
//			필드의 이름은 이름, 나이, 학년, 반, 주소, 키
//			객체의 필드를 출력
//			+	출력을 했을 때 모든 항목이 본인 정보이도록 설정
			
			Student stu = new Student();
				System.out.println("name :" + stu.name);
				System.out.println("address :"+stu.add);
				System.out.println("age :"+ stu.age);
				System.out.println("grade :"+stu.cla);
				System.out.println("class :"+stu.cla2);
				System.out.println("height :"+stu.hei);
				System.out.println();
			Student stu1 = new Student();
			
				System.out.println("name :" + stu1.name);
				System.out.println("address :"+stu1.add);
				System.out.println("age :"+ stu1.age);
				System.out.println("grade :"+stu1.cla);
				System.out.println("class :"+stu1.cla2);
				System.out.println("height :"+stu1.hei);
				
				System.out.println();
				System.out.println("stu : "+stu);
				System.out.println("stu1 : "+stu1);
//				엄연히 다른 녀석
//				근데 같은 값.... 뭐지???
				System.out.println();
				System.out.println();
			Student stu2 = new Student("YU", "siheung" , 19,2, 3, 180.5);
				System.out.println("name :" + stu2.name);
				System.out.println("address :"+stu2.add);
				System.out.println("age :"+ stu2.age);
				System.out.println("grade :"+stu2.cla);
				System.out.println("class :"+stu2.cla2);
				System.out.println("height :"+stu2.hei);
				
				
				System.out.println();
				System.out.println("stu3");
				Student stu3 = new Student("kim", "seoul", 26);
				System.out.println(stu3.name);
//				이렇게 쓰면 된다... 오버로드된 녀석을 불러오기 때문
//				안 넣은 값은 초기화 블록에서 초기화 된 녀석으로 가져온다.
	
	
	
//			Animal 클래스를 만들어서 출력하기
//			public, 종류, 이름, 나이, 서식지,다리 수 ,성별
//				System.out.println();
//				System.out.println("dog");
//				Animal dog = new Animal("dog", "badook", "Street",  "M", 9, 4);
//				System.out.println();
//				System.out.println("monkey");
//				Animal mon = new Animal("Monkey", "wonsoon", "japan",  "F", 10, 2);
//				System.out.println();
//				System.out.println("elephant");
//				Animal ele = new Animal("ele", "kodol", "refrigerator",  "F", 77, 4);
//				System.out.println();
				
//			만약 클래스에 매개변수 있는 생성자를 만들고 default생성자를 만들지 않으면 어떻게 될까??
				
//				default를 jvm이 안 만들겠지!!!!!!!
	}

}
