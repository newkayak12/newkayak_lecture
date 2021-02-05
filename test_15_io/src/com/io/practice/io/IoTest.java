package com.io.practice.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IoTest {
 Scanner scn = new Scanner(System.in);
//
//메뉴
//1. 파일생성 > 파일명을 client에 입력받아 생성
//2. 디렉토리생성 폴더명로 client 에게 입력받아
//3. root경로는 프로젝트 경로
//4. 파일에 문자열 저장 > 사용자가 입력하는 내용 전부 저장 / 사용자가 입력 중단 할 때까지 입력받을 것
//5. 파일에 저장된 문자열 출력하기 > 파일에 저장된 내용 가져와 출력하기
	
	
	public void makeDir(String folderName) {
		String path = IoTest.class.getResource("/").getPath();
		path = path.substring(0, path.lastIndexOf("bin"));
		File folder = new File(path+"/"+folderName);
			if(folder.mkdirs()) {
				System.out.println("폴더 생성을 성공했습니다.");
			} else {
				System.out.println("폴더 생성에 실패했거나 이미 존재합니다.");
			}
	}
	
	
	public void makefile(String folderName, String fileName) {
		String path = IoTest.class.getResource("/").getPath();
		path = path.substring(0, path.lastIndexOf("bin"));
		File file = new File(path+"/"+folderName+"/"+fileName);
			try {
				if(file.createNewFile()) {
					System.out.println("파일 생성에 성공했습니다.");
				} else if(file.exists()) {
					System.out.println("파일이 이미 존재합니다.");
				}
			} catch (IOException e) {
				 	System.out.println("파일 생성에 실패했거나 이미 존재합니다.");
				e.printStackTrace();
			}
		
	}
	
	
	public void showAll() {
		String path = IoTest.class.getResource("/").getPath();
		path = path.substring(0, path.lastIndexOf("bin"));
		File show = new File(path);
		String[] all = show.list();
			for(String piece : all) {
				System.out.println(piece);
			}
	}
	
	public void cd(String pathIn) {
		String path = IoTest.class.getResource("/").getPath();
		path = path.substring(0, path.lastIndexOf("bin"));
		File show = new File(path+"/"+pathIn);
		String[] cdAll = show.list();
			for(String cds : cdAll) {
				
				System.out.println(cds);
			}
	}
	
	public void writeIn(String folderName, String fileName) {
		
		String path = IoTest.class.getResource("/").getPath();
		path = path.substring(0, path.lastIndexOf("bin"));
		File file = new File(path+"/"+folderName+"/"+fileName);
		FileWriter fw = null;
		BufferedWriter fb = null;
			try{
				/* FileWriter */fw = new FileWriter(file);
				fb = new BufferedWriter(fw);
				System.out.println("내용을 입력하세요  (q를 입력하면 종료)");
				boolean flag =true;
				
					while(flag) {
//						scn.nextLine();
						String input = scn.next();
						if(input.equals("q\n")) {
							flag = false;
						} else {
							fb.write(scn.next());
							
						}
					
					
						
					}
				
			} catch (IOException e) {
				System.out.println("입력 실패");
			} finally {
				try {
					fb.flush();
					fw.close();
					fb.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;
				}
			}
			
	}
	
	
	
	public void readIn(String folderName, String fileName) {
		
		String path = IoTest.class.getResource("/").getPath();
		path = path.substring(0, path.lastIndexOf("bin"));
		File file = new File(path+"/"+folderName+"/"+fileName);
		StringBuffer stb = new StringBuffer("");
		int fin = -1;
			try(FileReader fr = new FileReader(file);
				BufferedReader frb = new BufferedReader(fr)){
				
				while( (fin=frb.read()) != -1) {
					
					stb.append((char) fin);
				}
				
				System.out.println(stb);
				
				
			} catch(IOException e) {
				
			}
		
	}
	
//File sf = new File();	
	
	
}
