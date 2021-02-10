package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Fruits;

public class FruitsPriceDescending implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		
		
		return o2.getPrice()-o1.getPrice();
	}

}
