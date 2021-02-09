package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Fruits;

public class FruitsPriceAscending implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		
		
		return ((Integer)o1.getPrice()).compareTo(o2.getPrice());
//		return o1.getPrice() - o2.getPrice();
		
//		o1이 기준 / o2가 비교
//		그리고 +,0,- 으로 분류
	}

}
