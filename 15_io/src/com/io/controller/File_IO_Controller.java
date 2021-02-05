package com.io.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Controller {
	
	public void saveFile() {
//		파일에 특정 데이터를 저장하려면 outputStream을 
//		연결하여 데이터를 저장함.
//		stream을 열었을 경우에는 반드시 그 객체는 반환을 해줘야함 (close)
//		File에 대한 메소드 이용은 거의 대부분 IOException 처리를 해야 함
		
		
//		OutputStream output = new OutputStream() {
//
//			@Override
//			public void write(int b) throws IOException {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
//			anonymous 빼면은 구현이 불가능하지요
		
		FileOutputStream output = null;
			try {
				output = new FileOutputStream(new File("bs/th.txt"));
//				운영체제에 맞게 하려면 Filedjslkdja.getClass이렇게 당겨와야
//				outputstream을 열면 해당 명칭 파일이 없으면 새로 생성
				
				//data injection
				//FileOutputStream에서 제공하는 wrtie메소드를 이용한다.
				byte[] data = "abcde".getBytes();
				output.write(data);
				output.write("1234".getBytes());
				output.write("점심먹자".getBytes());
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				try {
					if(output!=null) {
						output.close();
					}
				} catch (IOException e ) {
					e.printStackTrace();
				}
			}
	}
	
	
	
	
	public void loadFile()	{
//		파일에서 데이터를 가져오려면 InputStream객체를 이용함
//		InputStream is = new InputStream();
//		얘를 구현한 클래스를 이용해야함
		
		FileInputStream fis = null;
		
			try {
				fis = new FileInputStream("bs/th.txt");
//				파일 불러오기 read()메소드를 이용하기 
//				대신 반환형은 int형으로 반환함
//				얘를 char를 받아야 
//				 read 한 번에 1byte씩 받아옴
				int data = -1;
				while((data=fis.read())!=-1) {
					System.out.print((char)data);
//					영문자/숫자는 이렇게 가능 
//					한글은 2byte라 이렇게 하면 꺠짐
//					output.write("점심먹자".getBytes()); 39번쨰 줄
//					 ì¬ë¨¹ì
					
				}
				
				
				
				
				
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				if(fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
				
			}
	}
	
	
	
	
	
//	문자열은 reader 와 writer를 사용한다.
	
	
	public void saveStrFile() {
//		저장하는 거니까 Writer
		
//		Writer w = new Writer();
//		추상 클래스라 안된다고
//		Cannot instantiate the type Writer
		
		try(FileWriter w = new FileWriter("bs/bs.txt");) {
//		try with resource
			
			
//			바이트 단위 통신이라 바이트로 변경했지 위에서는 37줄
			w.write("점심 맛있게 먹었나요??");
			w.write("황태는 동태를 말린 것 ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void loadStrFile() {
		try(FileReader r = new FileReader("bs/bs.txt")){
			int data = -1;
			
//			int java.io.InputStreamReader.read() throws IOException

//			Reads a single character.
//			
//			Overrides: read() in Reader
//			Returns:
//			The character read, or -1 if the end of the stream has been reached
//			Throws:
//			IOException - If an I/O error occurs
			
			
//			String str ="";
			StringBuffer sb = new StringBuffer();
				while((data = r.read())!=-1) {
//					str += (char)data;
					sb.append((char)data);
//					System.out.print(str);
					
//					한땀한땀 불러오지??
//					System.out.println(sb);
//					이러면 반복문 안이니까 문제가 당연히 생기지 
				}
			
				System.out.println(sb);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
