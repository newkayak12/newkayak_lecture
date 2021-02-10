package com.collection.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
// //			properties : map 형식으로 데이터를 저장하는 객체인데
//		1. 파일과 연동이 된다.(연동해서 처리)   > xml, txt, properties라는 확장자로 사용
//		2. 문자열(String) 전용
//		3. key, value 형식으로 저장
//		
//		properties는 언제 사용하는가?? 
		
		Properties prop = new Properties();

//      값을 주입하기 > setProperty()		
//		prop.setProperty("usrId", "admin");
//		prop.setProperty("password", "1234");
//		
////		System.out.println(prop);
//		
//		
//			try {
//				prop.store(new FileOutputStream("info.properties"),"adminData");
//				prop.store(new FileOutputStream("info.xml"),"adminData");
//				
//				
////				store("파일 스트림 ", "코멘트");
//				
//			} catch (IOException e) {
//				
//			}
//		프로그램에 대한 환경설정에서 많이 사용한다.............
			
			

		
		
			loadProperty();
		
		

	}
	
	public static void loadProperty() {
//		저장된 properties를 불러오기
//		load()라는 메소드를 이용한다.
		Properties prop = new Properties();
		
		//prop에 key, value형식으로 값이 들어옴
		try {
//			properties방식 로드
			prop.load(new FileInputStream("info.properties"));
				System.out.println(prop.getProperty("usrId"));
				System.out.println(prop.getProperty("password"));
				System.out.println(prop.getProperty("driver"));
				
//			xml 방식 로드
			prop.loadFromXML(new FileInputStream("info.xml"));
				System.out.println(prop.getProperty("usrId"));
				System.out.println(prop.getProperty("password"));
//			prop.list(System.out);
//			jdbc// 드라이버 정보 등 저장할 때	
			
			
			
//			info.properties파일로 가봐
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
