package com.collection.model.vo;

import java.util.Objects;

public class Fruits implements Comparable<Fruits>{
	private String name;
	private String origin;
	private int sugar;
	private int price;
	
	public Fruits() {
		// TODO Auto-generated constructor stub
	}

	public Fruits(String name, String origin, int sugar, int price) {
		super();
		this.name = name;
		this.origin = origin;
		this.sugar = sugar;
		this.price = price;
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "name " + name + " origin of country " + origin + " sugar content " + sugar + " price " + price+'\n';
	}
	
	@Override
	public boolean equals(Object obj) {
		 if(obj instanceof Fruits) {
				Fruits  f= (Fruits) obj;
				
				if( ( name.equals(f.name)  && origin.equals(f.origin)  )&& ( (sugar== f.sugar) && (price == f.price)) ) {
						return true;
				}
			}
			return false;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, origin, sugar, price);
	}
	
	
	
	@Override
	public int compareTo(Fruits o) {
//		과일 이름으로 정렬
//		정렬 알고리즘이 적용
		
		
//		자리변경 : + 
//		상태유지 : 0
//		상태유지 : - 
		
//		return name.compareTo(o.name); //	오름차순 정렬
//		return o.name.compareTo(name); // 	내림차순 정렬
		return price+o.price; //오름차순
//		return o.price+price; //내림차순
//		여기에 -o 가 개신기하네???????????
			
		
//		**************************
//			if(price<o.price) {
//				return -1;//-1 내림차순   // return +1;오름차순 
//			} else if (price==o.price) {
//				return 0;
//			} else {
//				return +1;
//			}
//		************************** 사실 이런 로직이 +/0/-에 따라서 나오는 거라구요
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
