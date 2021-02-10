package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Fruits;

public class FruitsSugarContentAscending implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		return ( (Integer)o1.getSugar() ).compareTo((o2.getSugar()));
	}

}
