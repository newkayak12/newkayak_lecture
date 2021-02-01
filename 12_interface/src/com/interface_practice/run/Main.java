package com.interface_practice.run;

import com.interface_practice.common.MakeBurger;
import com.interface_practice.model.vo.Burger;
import com.interface_practice.model.vo.King;
import com.interface_practice.model.vo.Mcdonals;
import com.interface_practice.model.vo.Shaks;

public class Main {

	public static void main(String[] args) {
		Burger[] burger = new Burger[4];
		
		
		
		burger[0] = new Shaks("mushroom", 8900, 1);
		burger[1] = new Mcdonals("bigMc", 7000, 1);
		burger[2] = new King("whopper", 8000,1);
		
		
		MakeBurger makeit = new King("whopper", 8000,1);
		makeit.makeBurger();
		//인터페이스를 타입으로 했을 때 장점은?????????
//		King에 있는 메소드를 보는 것이 아니라 MakeBurger에 있는 메소드에만 볼 수 있다.
		// 기능 사용을 제한할 수도 있음 위와 같이 
		((King) makeit).makeKingBurger();
		// 똑같이 casting도 된다 이 말이야!
		
		
		MakeBurger[] makes = new MakeBurger[4];
		
		makes[0] = new Shaks("mushroom", 8900, 1);
		makes[1] = new Mcdonals("bigMc", 7000, 1);
		makes[2] = new King("whopper", 8000,1);
		
		
		
//		 헐??????
//		인터페이스는 자체 생서이 안된다면서 왜 되는거야??
//		new MakeBurger()  / new MakeBurger[3];
		
		
		
		
		//익명 구현 객체로 객체화 자체는 할 수 있는 걸로 알고 있긴함.....
		
		MakeBurger test = new MakeBurger() {
			
			@Override
			public void makeBurger() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void infoBurger() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
	}

}
