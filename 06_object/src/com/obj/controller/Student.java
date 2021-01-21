package com.obj.controller;

public class Student {
	
//	요런 클래스를 데이터 보관용이라고 생각하면 된다.
//	또 하나는 메소드를 구현해 놓은 클래스
	
	
	public  String name, add ;
	public int age, cla, cla2;
	public double hei;
	
	
	{
		name="Kim Sang Hyeon";
		add="guro";
		age=29; 
		cla=2; 
		cla2=4;
		hei = 170.1;
		
	}
	
//	초기화 블록은 좀 신기하긴 하다??
	
	public Student() {
		System.out.println("run default constructor");
	}
//	얘는 default 값으로 설정 됨
//	굳이 생성 안해도 jvm이 알아서 생성해서 호출함
//	기본생성자는 무조건 명시적으로 코드에 작성하는게 낫다.
	
	
	
	
//	field init
//	constructor with parameter (데이터를 받아서 초기화하는 생성자)
	public Student(String name, String address, int age, int cla, int cla2, double hei) {
//		name = name;
//		자기가 자신에게 대입하고 있으니까...(우선순위가 자기가 갖고 있는 것 우선으로 생각)
//		this();
//		다른 생성자 호출 () 안이 비었으니까 default
		this.name = name;
//		this.는 생성되는 나... 자신... 객체...?????의 주소...
		
//		왜 굳이 같은 이름을 쓰는가?? - 직관성/가시성 때문에 
		
		this.add = address;
		this.age= age;
		this.cla= cla;
		this.cla2=cla2;
		this.hei=hei;
		
//		this();
//		Constructor call must be the first statement in a constructor
	
	}
	
//	꼭 모든 필드를 다 넣어야하나? >>> 그건 또 아니다
	
	
	public Student(String name, String add, int age) {
//		this(name,add,age,10,20,hei);
//		이 this ()는 맨 위에 있어야한다. 
		this.name = name;
		this.add = add;
		this.age = age;
	}
	
//	초기화 블록 vs 생성자?
//	생성자가 우선 순위가 높아서 생성자 따라감 결국
//	그래서 초기화 블록을 잘 안 씀
	
//	constructor has been overloaded
//	생성자 생성할 때
//	 접근연산자 클래스면 () { ... }> 필드를 초기화하는 로직이 들어감
	
	
	
	
	
//	근데 생성자들 이름이 죄다 같네.... > 오버로드 ( 매개변수에 들어가는 개수, 타입이 다르다.)
	

}
