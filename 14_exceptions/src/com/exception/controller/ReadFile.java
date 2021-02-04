package com.exception.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		
		
		new ReadFile().fileLoad();
		
		
		
		

	}
	
	
	
	
	
	public void fileLoad() {
		
		FileReader fr = null;
			
			try {
				fr = new FileReader("test.txt");
				
				int data = -1;
				
				while((data=fr.read())!=-1) {
					System.out.println((char)data);
				}
				
				
			} catch ( FileNotFoundException e	) {
				e.printStackTrace();
			
			} catch ( IOException e ) {
				e.printStackTrace();
				
			} finally {
				
				try {
					if(fr!=null) {
						fr.close();
					}
					
				} catch ( IOException e ) {
					e.printStackTrace();
				}
				
			}
	}
	
	
	
	public void fileLoad2() throws IOException {
		
		try(FileReader fr = new FileReader("Test.txt");
			BufferedReader br = new BufferedReader(fr);){
//			Unhandled exception type IOException thrown by automatic close() invocation on fr : line 67
//			하나만 닫을 수 있는게 아님 다 쓸 수 있음
			
			
			int data = -1;
			while((data=fr.read())!=-1){
				System.out.println(data);
			}
			
			
		} catch ( FileNotFoundException e ) {
			
		} 
			  catch ( IOException e ) {
			  
		}
			 
//		닫아야하는 녀석을 ()에 선언
	}

	
//	훠얼씬 짧네 ㅋㅋ try - with ~resouce
}
