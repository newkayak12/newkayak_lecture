package com.thread.controller;

public class InterThread implements Runnable {
// Runnable 인터페이스를 구현해서 적용하는 방법
	
	
//	미구현 메소드 구현
	@Override
	public void run() {
		for( int i =0; i<50; i++) {
			System.out.println(i+": implemented thread");
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
