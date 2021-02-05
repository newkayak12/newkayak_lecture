package com.io.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		Test t = new Test();
//		t.test();
		t.test2();
	}

	
	public void test() {
		
		String path = Test.class.getResource("/").getPath();
		System.out.println(path);
		
		path = path.substring(0,path.lastIndexOf("bin"));
		
		File f = new File(path+"/t");
		File txt = new File(path+"/t"+("/test1.txt"));
		System.out.println();
		if(f.mkdir()) {
			try {
				
				System.out.println(txt.createNewFile());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public void test2() {
		String path = Test.class.getResource("/").getPath();
		path = path.substring(0, path.lastIndexOf("bin"));
		System.out.println(path);
		
				
//		File pa = new File(path);
		
		try(FileWriter s = new FileWriter(path+"/testing/ts.txt");){
			
			s.write("test");
			
		}catch(IOException e) {
			
		}
	}
	
}
