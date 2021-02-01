package com.poly.abstracttest.run;

import com.poly.controller.PolyController;

public class Run2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다형성, 동적 바인딩
		PolyController pc1 = new PolyController();
		pc1.test2();
		pc1.abstractAnimal();
	}

}
