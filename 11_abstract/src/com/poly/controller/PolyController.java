package com.poly.controller;

import com.poly.abstracttest.animal.Cat;
import com.poly.abstracttest.animal.Dog;
import com.poly.abstracttest.animal.Monkey;
import com.poly.abstracttest.vo.Animal;

public class PolyController {
	
	
//	
	
	
	
	public void test2() {
			//객체 배열을 선언하고 (Animal)
		
		Animal[] animals = new Animal[5];
//		animals[0].getName();
//		NullPointerException
		animals[0] = new Cat("meow", "cat", 9, 4);
//					new Cat();는 지금 우리가 parameter낀 생성자를 만들었으니까 없는 생성자겠지? 안 만들었으면
		animals[1] = new Dog("poppy", "dog", 4, 4);
		
		animals[2] = new Monkey("moni", "monkey" ,15,2);
		
		animals[3] = new Dog();
		//부모 타입은 자식에 있는 메소드에 접근할 수 없다. (자식에 접근하려면 형변환!)
		System.out.println(((Cat) animals[0]).catGrowl() );
		System.out.println(((Dog) animals[1]).dogGrowl() );
		System.out.println(((Monkey) animals[2]).monkeyGrowl() );
		
		
		for (Animal a : animals) {
//			null에 대한 예외처리...물론 try{ ... } catch(NullpointerException e){ ... }는 아니지만...
			if(a!=null) {
//				System.out.println(a.growl());
				System.out.println(a);
			}
//			if(a instanceof Cat) {
//				System.out.println(((Cat) a).catGrowl());
//			} else if( a instanceof Dog	) {
//				System.out.println(((Dog) a).dogGrowl());
//			} else if( a instanceof Monkey) {
//				System.out.println(((Monkey) a).monkeyGrowl());
//			}
		}
		
		//동적바인딩을 이용하면 간편하게 적용할 수 있다.
		
		
		
		
	}
	
	public void abstractAnimal() {
//		Animal ani = new Animal();
		//Cannot instantiate the type Animal
		
		// 생성은 못하지만 자료형으로 사용 가능 > 자식 객체만 받는 변수를 만들 수 있음
		
		Animal cat = new Cat();
		//즉 Animal자식인 녀석만 들어 갈 수 있음
		
		// 추상클래스에서는 추상 메소드를 선언하면 무조건 추상 클래스로 선언해야한다. 
		
		Animal[] animals  = new Animal[10];
		Animal cats = new Cat(); //이러면 상속된 객체만 들어갈 수 있다...
			for( Animal a : animals) {
				if(a!=null) {
					System.out.println(a.growl());
//				이러면 Animal을 상속받은 클래스는 무우우우우우우우조건 growl이 있다는 것을 명시적으로 할 수 있다.
					
//					Object[] objs = new Object[10];이러면 범위가 너무 넓지...?
					
					
					
					
				}
			}
	}
}
