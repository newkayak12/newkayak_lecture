package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Fruits;

public class FruitsSugarContentDescending implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		return ( (Integer)o2.getSugar() ).compareTo((o1.getSugar()));
	}

}
