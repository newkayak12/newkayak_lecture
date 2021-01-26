package com.objarr.run;

import com.objarr.model.vo.Car;
import com.objarr.model.vo.Person;

public class Main {
	
	

	public static void main(String[] args) {
//		객체를 원래는 Car c;이렇게 사용했었지??
//		Car c2; Car c3; 이렇게
//		전체적으로 보관하거나 접근할 때에는 번거로움이 생긴다. 
		
		
		
		
//		객체 배열의 선언 방법
		
		
		
		Car[] cars;
//	Car자료형을 보관하는 배열 / 배열 변수명 ; 이러면 일단 객체의 배열을 선언만 해놓은 상태이다. 추가적으로 초기화를 해야 사용할 수 있다는 것은 당연하다.
		
//  배열을 할당하는 방법은
		cars = new Car[4];
//		위와 같이 할당하면 된다. 

// 	배열의 초기화와 객체 생성은 아래와 같이 한다. > 객체이기 때무에 생성해서 넣는다. 
		cars[0] = new Car("sonata","hyundai",100,"pink",4);
		cars[1] = new Car("R8","audi",2000,"white",4);
		
//	객체의 배열에 있는 값을 출력해보기
			System.out.println(cars[0]);
			System.out.println(cars[1]);
//		이러면 머금고 있는 주소값만 나오지(객체가 있는 메모리의 주소)
			System.out.println(cars[1].getBrand()+" "+cars[1].getModelName());
			
			
//			System.out.println(cars[3].getModelName());
//			주소를 보관할 수 있는 값에 초기화를 하지 않고 출력하면 Null이 출력됨
//			.은 접근 연산자이다. 주소값. 찾는 것
//			null인 상태에서 .으로 진입하면 진입할 가능성 조차 없다.
//			즉 이러한 상황이 나오면 해당 객체가 null인지 아닌지 확인해보는 것이 중요하다.
			
 
			cars[1] =new Car("avante", "hyundai",2000,"silver",4);
			cars[2] = new Car("ModelX", "tesla", 1, "black",4);
			cars[3] = new Car("QuatroForte", "Maserati", 1, "blue", 4 );
			System.out.println(cars[2].getBrand()+" "+cars[2].getModelName());
			
//			배열볒수에 할당된 객체에 값을 넣으려면?
			
			cars[0].setModelName("tico");
			
			
//			배열은 for와 떨어질 수가 없다.
			
//			cars[4]= new Car("aventador", "lambrogini",1,"red",2);
//				for(int i = 0; i<cars.length; i++) {
//					System.out.println(cars[i].getModelName());
//				}
			
			
			
//		person클래스 생성
//		이름 나이 성별 전화번호
//				person을 5명 저장할 수 있는 저장공간을 확보하고
//				
//				1. 유병승 19 남 01036446259
//				2. 김상현 29 남 01027114160
//				3. 김태희 26 남 01022102229
//				4. 김예진 26 여 01022209928
//				5. 비운다.
//				
			System.out.println();
			
	Person[] persons;
	persons= new Person[5];
	
	persons[0] = new Person("유병승", 19, "남", "01036446259");
	persons[1] = new Person("김상현", 29, "남", "01027114160");
	persons[2] = new Person("김태희", 26, "남", "01031223428");
	persons[3] = new Person("김예진", 26, "여", "01022209928");
	persons[4] = new Person();
	boolean run = true;
		while(run) {
			for(int i =0; i<persons.length; i++) {
				if(persons[i].getName()==null) {
					persons[i].setName("이우식");
					persons[i].setAge(25);
					persons[i].setGen("남");
					persons[i].setpNum("01029102892");
					
				}
				System.out.println(persons[i].getName()+"\t"+persons[i].getAge()+"\t"+persons[i].getGen()+"\t"+persons[i].getpNum());
				
				
			}
			
		return;
		}
		
		
		
}
}


