package com.io.practice.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.io.practice.io.IoTest;

public class View {
	Scanner scn = new Scanner(System.in);
	IoTest iot = new IoTest();
	
	public void mainView( ) {
		
		while(true) {	
			int input =0;
				System.out.println(" === 파일 생성 ===");
				System.out.println(" 1. 폴더 생성하기");
				System.out.println(" 2. 파일 생성하기");
				System.out.println(" 3. 전체 폴더 내용 보기");
				System.out.println(" 4. 파일에 내용 작성");
				System.out.println(" 5. 파일의 내용 보기 ");
				System.out.println(" 9. 종료하기 ");
				try {
					input = scn.nextInt();	
					
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력하세요 ");
				}
				
				switch(input) {
					case 1 :
						makeDir();
						break;
					case 2: 
						makeFile();
						break;
						
					case 3: 
						showAll();
						break;
					
					case 4:
						writeIn();
						break;
						
					case 5: 
						readIn();
						break;
						
					case 9 : 
						
						return;
	
				}
			
			
			
			
		}
	}
	public void makeDir() {
			System.out.println("폴더 이름을 입력하세요");
		String folderName = scn.next();
		iot.makeDir(folderName);
	}
	
	public void makeFile() {
			System.out.println("폴더 이름을 입력하세요");
		String folderName = scn.next();
			System.out.println("파일 이름을 입력하세요");
		String fileName = scn.next();
				iot.makefile(folderName, fileName);
			
	}
	
	public void showAll() {
		iot.showAll();
			System.out.println(" 1. move directorys");
			System.out.println(" 9. return to menu");
		int input = scn.nextInt();
		
			switch(input)	{
			
				case 1: 
						System.out.println("directory name ?");
					String pathIn = scn.next();	
						iot.cd("/"+pathIn);
						break;
				case 9: 
						return;
			}
	}
	
	
	public void writeIn() {
		System.out.println("폴더 이름을 입력하세요");
		String folderName = scn.next();
			System.out.println("파일 이름을 입력하세요");
		String fileName = scn.next();
				iot.writeIn(folderName, fileName);
	}
	
	
	public void readIn() {
		System.out.println("폴더 이름을 입력하세요");
		String folderName = scn.next();
			System.out.println("파일 이름을 입력하세요");
		String fileName = scn.next();
				iot.readIn(folderName, fileName);
	}
	
}	
