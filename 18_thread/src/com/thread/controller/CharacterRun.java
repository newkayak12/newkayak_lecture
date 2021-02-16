package com.thread.controller;

import java.util.Scanner;

import com.thread.model.vo.CharacterTest;

public class CharacterRun extends Thread {
	private CharacterTest c;
	Scanner scn = new Scanner(System.in);
	
	public CharacterRun(CharacterTest c	) {
		this.c = c;
	}
	
	
	@Override
	public void run() {
	
		while(true) {
			
			
			try {
				sleep((int)(Math.random()*1000)+500);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int damage = (int) (Math.random()*30)+1;
				System.out.print(c.getName()+"님 버튼을 누르세요(1,2,3) : ");
			int evade = scn.nextInt();
			int roulet = (int )((Math.random())*3)+1;
				if(evade != roulet) {

					System.out.println(c.getName()+"님이 "+damage+" 공격을 받았습니다.");
				c.setHp(c.getHp()-damage);
					
					if(c.getHp()<0 ) {
						System.out.println(c.getName()+"님이 공격에 의해 사망하셨습니다.");
						break;
					}
				} else {
					System.out.println("회피했습니다.");
				}
				
				
				
			
				
			
		}
	
	
	}
	
	
	
	
}
