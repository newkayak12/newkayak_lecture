package com.objarr.model.vo;

public class Car {
	private String modelName;
	private String brand;
	private int price;
	private String color;
	private int door;
	
	public Car() {
		
	}
	
	public Car(String modelNString, String brand, int price, String color, int door) {
//	객체 맴버 변수를 초기화해주는 생성자
//	객체를 생성할 때 사용하는 것, 반환형이 없다. 
//	생성자의 이름은 클래스명과 같다.
// 	기본생성자와 매개변수가 있는 생성자가 있고 이것은 매개변수가 있는 생성자이다.
//	객체 생성시에 사용
		this.modelName= modelNString;
		this.brand  = brand;
		this.price = price;
		this.color = color;
		this.door = door;
//		this는 객체 자기 자신을 지칭하는 연산자로 this자체에 객체 자신의 주소값을 머금고 있다.
//		this 는 생성자에 있는 매개변수와 이름이 동일할 때 주로 사용하며, 이름이 다를 경우 this를 사용하지 않아도 된다. 
	}
	
	
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
//	getter/setter 는 외부에서 무단 접근을 막기 위해서 private로 선언한 멤버 변수에 대해서 개발자가 접근/수정하기 위한 목적으로 만든 메소드이다.
//	private는 자기 자신의 클래스 이외에는 접근이 불가한 특성을 갖고 있는데 해당 클래스에 메소드를 만들어서 private값을 해당 클래스에서 수정하는 것으로
// ' . ' 접근 연산자로 직접 접근하는 것과는 달리 메소드로 간접 접근하는 특성을 가지고 있다.
//	get으로 접근하면 결과적으로 해당 멤버 변수의 주소값을 리턴받으며, 해당 get에서는 마치 해당 멤버 변수와 똑같이 사용할 수 있다.
//	set으로 접근하면 parameter(매개변수)를 통해서 해당 private값을 수정한다. 여기서 set에서 로직을 구현해서 private로 구성된 값에 
//	잘못된 값이 유입되는 것을 막을 수 있다는 장점이 있다. 
}
