package com.io.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import com.io.model.vo.Member;

public class FileSubStreamContoller {

	public void stringChangeOutput() {
//		파일을 저장한다.
		BufferedWriter output = null;
		
			try {
				output = new BufferedWriter(new OutputStreamWriter(System.out));
				output.write("안냥하세여!");
				
				output.flush(); // 버퍼에 잔존한 녀석들을 털어냄 > cpu가 읽을 수 있게 처리
				
			} catch ( IOException e	) {
				e.printStackTrace();
			} finally	{
				try {
					if(output != null) {
						output.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	}
	
	
	public void stringChangeInput() {
		try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))){
//			byte단위로 문자로 입력 > 그걸 변경해서 buffer에 넣어서 쓰겠다.
//			스캐너가 나오기 전에는 이렇게 썼음
			
			
			System.out.println("enter any voca");
		String value = br.readLine();
			System.out.println("value : " + value);
			
			
			
		} catch( IOException e ) {
			e.printStackTrace();
		}
	}
	
	
	
	
//	버퍼이용하기
	public void bufferedReaderTest() {
		long start = System.currentTimeMillis();
			try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
				
				StringBuffer sb = new StringBuffer();
				String temp = null;
					while( (temp = br.readLine()) != null) {
						sb.append(temp+"\n");
						
					}
					
					System.out.println(sb);
			} catch ( IOException e ) {
				e.printStackTrace();
			}
			
			
		long fin = System.currentTimeMillis();
		
		System.out.println("timeout buffRead : " + (fin - start));
	}
	
	public void bufferedWrtieTest() {
		long start = System.currentTimeMillis();
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"))) {
				
				bw.write("안냥하세여 월요일이라서 \n");
				bw.write("월요병이라 쉽지 않져??\n");
				bw.write("월요병을 고치려면 일요일 날 출근하면 되요\n");
				
				bw.flush();
			} catch ( IOException e ) {
				e.printStackTrace();
			}
		long fin = System.currentTimeMillis();
		
		
		System.out.println("timout bufferWrite : " + (fin - start));
		
		
	}
	
	
	
	public void memberSave() {
		
//		아이디 패스워드 성별 나이 키 몸무게
		
//		memberdata.skit
		
			try(	 Scanner scn = new Scanner(System.in);
					BufferedWriter bw = new BufferedWriter(new FileWriter("memberdata.skit"));){
				
				
				for(int i = 0; i<3; i++) {
						System.out.println("아이디 :  ");
					String id = scn.nextLine();
						System.out.println("비밀번호 :  ");
					String psswd = scn.nextLine();
						System.out.println("성별 :  ");
					char gender = scn.next().toUpperCase().charAt(0);
						System.out.println("나이 : ");
					int age =scn.nextInt();
						System.out.println("키 : ");
					double height = scn.nextDouble();
						System.out.println("몸무게 : ");
					double weight = scn.nextDouble();
					scn.nextLine();
				
					
					bw.write(id + ", ");
					bw.write(psswd+ ", ");
					bw.write(gender+ ", ");
					bw.write(age+ ", "); // int 는 char로 변환되니까
					bw.write(String.valueOf(height+ ", "));
					bw.write(String.valueOf(weight+ "\n"));
					
					bw.flush();
				}
 
			}catch( IOException e) {
					e.printStackTrace();
			}
				
	}
	
	
	
	public void memberload() {
		Member[] members = new Member[3];
		
		try(BufferedReader br = new BufferedReader(new FileReader("memberdata.skit"))){
			String data = "";
			StringBuffer stb = new StringBuffer();
				while( (data = br.readLine()) != null) {
					
					stb.append(data +"\n");
				}
				
//				System.out.println(stb);
//				string으로 넣어서 마치 찰흙으로 뭉쳐놓은 것처럼 작살이 났네
			String mem = new String(stb);
//			StringTokenizer sb = new StringTokenizer(mem, ",");
			//////////////////////////////////////////여기 있는 애들을 객체에 넣고 초기화/////////////////
			String[] temp = mem.split("\n");
					for(int i =0 ; i<members.length; i++) {
						String[] memDat = temp[i].split(",");
						
						members[i] = new Member();
						members[i].setId(memDat[0]);
						members[i].setPw(memDat[1]);
						members[i].setGender(memDat[2].charAt(0));
						members[i].setAge(Integer.parseInt(memDat[3].trim()));
						members[i].setHeight(Double.parseDouble(memDat[4].trim()));
						members[i].setWeight(Double.parseDouble(memDat[5].trim()));
						
							System.out.println(members[i]);
						
					}
			
			
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
// 데이터 타입 io
	public void saveMemberDataType() {
//		dataInputStream 기본 스트림 > fileInputStream > 바이트단위로 처리
//		dataOutputStream 기본 스트림 > fileOutputStream > 바이트단위로 처리
		try (	Scanner scn = new Scanner(System.in);
				DataOutputStream dis = new DataOutputStream(new FileOutputStream("memberdata2.skit"));){
				for(int i =0; i<2; i++) {	
						System.out.println("id");
					dis.writeUTF(scn.nextLine()); // 문자열 타입으로 저장
						System.out.println("password ");
					dis.writeUTF(scn.nextLine());
						System.out.println("gen ");
					dis.writeChar(scn.next().charAt(0));
						System.out.println("age");
					dis.writeInt(scn.nextInt());
						System.out.println("height");
					dis.writeDouble(scn.nextDouble());
						System.out.println("weight");
					dis.writeDouble(scn.nextDouble());
					scn.nextLine();
				}
			dis.flush();	
		} catch( IOException e ) {
			
		} 
	}
	
	
	public void loadMemberDataType() {
		try( DataInputStream dis = new DataInputStream( new FileInputStream("memberdata2.skit")) ){
//				반드시 읽어올 때 넣은 순서대로 읽어야한다.
			Member[] members = new Member[2];
				for(int i = 0; i<2; i++) {
					members[i]	= new Member();
					members[i].setId(dis.readUTF());
					members[i].setPw(dis.readUTF());
					members[i].setGender(dis.readChar());
					members[i].setAge(dis.readInt());
					members[i].setHeight(dis.readDouble());
					members[i].setWeight(dis.readDouble());
				}
			
				for(Member m : members) {
					System.out.println(m);
				}
			
		}catch ( IOException e ) {
			e.printStackTrace();
		}
	}
	
//	야 그냥 객체로 보내 
	public void objOutputTest() {
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream ("memberdata3. skit"));
				//  append 로 true를 주고 추가하면 다른 파일이 생성된다??.... 그래서 이전의 결과는 읽지 못한다...
			Scanner scn  = new Scanner(System.in)){
			Member[] members = new Member[2];
				for(int i =0; i<2; i++) {	
					members[i] = new Member();
						System.out.println("id");
					members[i].setId(scn.next());
						System.out.println("password");
					members[i].setPw(scn.next());
						System.out.println("gender");
					members[i].setGender(scn.next().charAt(0));
						System.out.println("Age");
					members[i].setAge(scn.nextInt());
						System.out.println("height");
					members[i].setHeight(scn.nextDouble());
						System.out.println("weight");
					members[i].setWeight(scn.nextDouble());
					
				}		
					oos.writeObject(members); // 객체 저장
		//			직렬화 꼭 안해도 되는 부분인가???? 뭐지??? 근데 왜.. 난??
		//			NotSerializalbeException
		} catch( IOException e 	) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	public void objInputTest() {
		
			try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("memberdata3. skit")) ){
//						try {
//							for(int i =0; i<2; i++) {	
//								members[i] = (Member) ois.readObject();
//					//			ClassNotFoundException
//								System.out.println(members[i]);
//							}
//						} catch( EOFException e	) {
//							System.out.println("파일의 끝입니다.");
//						}		
				Member[] members = ((Member[])ois.readObject());
				
					for(Member m : members) {
						System.out.println(m);
					}
						
				} catch ( ClassNotFoundException | IOException e ) {
					// TODO: handle exception
					e.printStackTrace();
				}
			
	}
	
	
	public void objOutputTest2() {
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream ("memberdata3. skit",true));
				//  append 로 true를 주고 추가하면 다른 파일이 생성된다??.... 그래서 이전의 결과는 읽지 못한다...
			Scanner scn  = new Scanner(System.in)){
				for( int i =0; i < 2; i++) {	
			
					Member m = new Member();
					m = new Member();
						System.out.println("id");
					m.setId(scn.next());
						System.out.println("password");
					m.setPw(scn.next());
						System.out.println("gender");
					m.setGender(scn.next().charAt(0));
						System.out.println("Age");
					m.setAge(scn.nextInt());
						System.out.println("height");
					m.setHeight(scn.nextDouble());
						System.out.println("weight");
					m.setWeight(scn.nextDouble());
					
				
					oos.writeObject(m); // 객체 저장
					
					
//					 이게 밀어내는 느낌이 아니라 그냥 파일에 써지는 느낌인가보네
					
					
					
				}	
		//			직렬화 꼭 안해도 되는 부분인가???? 뭐지??? 근데 왜.. 난??
		//			NotSerializalbeException
		} catch( IOException e 	) {
			
		}
	}
	
	public void objInputTest2() {
		
		try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("memberdata3. skit")) ){
					
					for(int i =0; i<100; i++) {
						try {
							Member m = (Member) ois.readObject();
				//			ClassNotFoundException
							System.out.println(m);
						} catch (EOFException e	) {
							e.printStackTrace();
						}
					}		
			} catch ( ClassNotFoundException | IOException e ) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
}
		
	
}
