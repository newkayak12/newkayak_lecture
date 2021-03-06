package com.poly.controller;

import com.poly.dynamicbinding.model.Cat;
import com.poly.dynamicbinding.model.Dog;
import com.poly.dynamicbinding.model.Monkey;
import com.poly.dynamicbinding.vo.Animal;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Student;
import com.poly.model.vo.Teacher;

public class PolyController {
	
	
	
	public void printObjedct(Person person) {
		if(person instanceof Student) {
			Student s= (Student) person;
				System.out.println(s.getName()+" "+s.getGrade()+" "+s.getClassNo()+" "+s.getName());
			
		} else if(person instanceof Employee) {
			Employee e = (Employee) person;
			System.out.println(e.getName()+" "+e.getDeploy()+" "+e.getJob());
		}
	}
	
	
	
	
	
	public void printStudent(Student s) {
		System.out.println(s.getName()+" "+s.getGrade()+" "+s.getClassNo()+" "+s.getName());
	}
	
	public void printTeacher( Teacher t) {
		System.out.println(t.getName()+" "+t.getSubject()+" "+t.getMajor());
	}
	public void printEmployee( Employee e ) {
		System.out.println(e);
	}
	
	
	
	public void Test2() {
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
}
