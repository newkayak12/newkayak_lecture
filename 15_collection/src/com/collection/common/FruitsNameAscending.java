package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Fruits;

// Fruits객체 이름으로 정렬하게 하는 sort객체
// Fruits객체 이름을 기준으로 +,-,0을 반환하는 메소드를 구현
// Comparator인터페이스를 구현해서 처리함
public class FruitsNameAscending  implements Comparator<Fruits>{

	@Override
	public int compare(Fruits o1, Fruits o2) {

//	아까 우리가 구현한 compareTo랑 똑같이 구현해서 -,+,0을 반환해주면 된다. 
		
		return o1.getName().compareTo(o2.getName());
	}
	

}
