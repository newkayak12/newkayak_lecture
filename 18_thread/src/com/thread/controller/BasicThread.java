package com.thread.controller;

public class BasicThread extends Thread{
//	기본 스레드 적용하기
	
	
	// 1. Thread를 상속 받아서 처리
	//lang에 있는 thread
	// 1-1. run을 오버라이드
	@Override
	public void run() {
		for( int i =0; i<50; i++) {
			try {
					System.out.println(i+" : 상속쓰레드");
					Thread.sleep(500); // 쓰레드를 잠시 지연시키는 녀석
			} catch (InterruptedException e) {
				
			}
			
			
		}
	
	}
}
