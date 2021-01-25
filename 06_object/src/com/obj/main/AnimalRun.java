package com.obj.main;

import com.obj.model.vo.Animal;

public class AnimalRun {

	public static void main(String[] args) {
		//
		Animal cat = new Animal();
		
			cat.setName("meow");
			cat.setSort("mammal_cat");
			cat.setAge(20);
			cat.setLegs(4);
		
		Animal dog = new Animal();
		
			dog.setName("poppy");
			dog.setSort("mammal_dog");
			dog.setAge(3);
			dog.setLegs(4);
		
		Animal monkey = new Animal();
		
			monkey.setName("sungE");
			monkey.setSort("mammal_monkey");
			monkey.setAge(6);
			monkey.setLegs(2);
		
		
		
				System.out.println("==cat==\n" + cat.getName() +"\n"+ cat.getSort()+"\n"+ cat.getAge() +"\n"+ cat.getLegs()+"\n");
				System.out.println("==dog==\n" + dog.getName() +"\n"+ dog.getSort()+"\n"+ dog.getAge() +"\n"+ dog.getLegs()+"\n");
				System.out.println("==monkey==\n" + monkey.getName() +"\n"+ monkey.getSort()+"\n"+ monkey.getAge() +"\n"+ monkey.getLegs()+"\n");
				
//					static접근할 때  클래스로 접근하면 되는부분
//				Animal.temp;(근데 private)
				Animal.setTemp(20);
//				cat.getTemp(20); 이렇게 객체로 접근이 가능하지 같은 클래스에 있으니까. 좋은 방법은 아니긴 해...
//				이러면 근데 모든 객체들이 static인 한 녀석을 가지고 오기 때문에 마치 공통값처럼 사용하게 되는 부분이지
				System.out.println(cat.getTemp());
//				The static method getTemp() from the type Animal should be accessed in a static way
				System.out.println(dog.getTemp());
//				같은 값 나옴
				
				cat.setTemp(40);
				
				System.out.println(cat.getTemp());
//				The static method getTemp() from the type Animal should be accessed in a static way
				System.out.println(dog.getTemp());
//				다른 객체지만 값이 같이 바뀜
				
				
				
	}

}
