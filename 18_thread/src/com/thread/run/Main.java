package com.thread.run;

import com.thread.controller.BasicThread;
import com.thread.controller.InterThread;

public class Main {

	public static void main(String[] args) {
// 		쓰레드 실행하기 > (상속받은 녀석)		
		BasicThread bt = new BasicThread();
//		쓰레드 객체의 start메소드를 호출
		
		bt.start();
		
		bt = new BasicThread();
		bt.start();


		InterThread it = new InterThread();
		Thread td = new Thread(it);
		td.start();
		
		
		
//		join메소드 사용; : td 다 돌고 main돌게 하는 식으로 Main내려가 가기 전에 방해하는 녀석
		
		try {
			td.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		여기에 도달하면 td쓰레드를 하게 만들어서 main을 진입을 못하게 함
		
		
		
		
		for(int i = 0; i< 50; i++) {
			
			try {
				System.out.println(i+ " : 메인 쓰레드");
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
		
		
		
		
		
		
		
		
	}

}
