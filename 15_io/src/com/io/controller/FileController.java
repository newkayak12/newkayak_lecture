package com.io.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileController {
	
	public void basicFile()	{
	//	파일 클래스를 이용해서 파일을 다뤄보자
		File f = new File("test.txt");  //test.txt라는 이름의 파일 객체가 생성된다. > 실질적으로 파일을 생성한 것은 아니고 파일을 생성할 준비를 하고 있는 것 > 
										// 램에 올려 놓고 hard에 쓸 준비를 하고 이싿.
		
	//	매개변수에 파일명을 작성하면 기본 프로젝트의 default 경로가 설정이 된다. 
	
		
	//	생성한 파일 객체를 이용해서 파일을 생성하기
		try {
	
			f.createNewFile(); //파일을 생성하는 메소드
	//		refresh해야 함 ㅋ
			
			
		} catch( IOException e ) {
			e.printStackTrace();
			
			
		} 
	//	 다른 경로에 파일을 저장하고 싶다?
		
		
		
		
		File f1 = new File("/Users/sanghyeonkim/Downloads/test1.txt");
	//	윈도우의 경우에서는 \를 쓰기 위해서 \\를 써야함 
		
		 try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	그럼 파일로 저장하는 메뉴를 만들어서 생성할 수 있겠지??
	//	게임 세이브 로드하는 것처럼
		 
		 
		 
		
		 
	// 프로젝트 내부에서 경로를 찾기
		 	System.out.println(FileController.class.getResource("/").getPath());
	//	 getpath > url을 String으로
		 
			 System.out.println(FileController.class.getResource("../").getPath());
			 
			 System.out.println(FileController.class.getResource("").getPath());
	//		 절대경로		
			 System.out.println(FileController.class.getResource("/"));
		 
		 System.out.println("here");
		 String path = FileController.class.getResource("/").getPath();
		 path = path.substring(0,path.lastIndexOf("bin"));
		 System.out.println(path);
		 
		 //API쪽에 다시 보기
		 
		 
		 File f2 = new File(path +("/pathTest.txt"));
	//	  File f2 = new File(URLDecoder.decode(path, "UTF-") + "/pathTest.txt");
	//	  f2.createNewFile();	 
		 
		 try {
			f2.createNewFile(); //boolean을 반환하니까 true/false로 분기처리로 확인할 수 있지?
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			
		}
		 
		 
		 
		 
	//	 디렉토리 생성하기
	//	 File객체를 이용하면 디렉토릴르 생성할 수 있다. 
	//	 mkdir() / mkdirs();
	//	 mkdir() 와 mkdirs() 차이
	//	 mkdir()   : 있는 경로 안에서 폴더 한 개를 생성 
	//	 mkdirs()  : 없는 경로를 한 번에 여러 하부 폴더를 생성할 수 있는 명령어	 
		 
		File dir = new File(path+File.separator+"data/a/b/c/d/e");
			System.out.println(dir.getAbsolutePath());
	//	dir.mkdir();
	//	실제 있는 경로에서 한 개씩만 됨
		boolean okay = dir.mkdirs();	//boolean
	//	한 번에 여러 개가 가능하다
		if(okay) {
			System.out.println("생성 완료");
		} else {
			System.out.println("fail");
		}
		
	
		 
		
	//	지우기(파일, 폴드)
	//	delete() 파일을 지움
	//	try {
			File deleteFile = new File("test.txt");
			deleteFile.delete();
			
			
			File del1 = new File(path+"data/a/b/c/d/e");
			System.out.println(del1.delete());
			
	//		지울 때 주의 해야하는 것??
	//		서브 폴더들이 있어서 같이 써야한다. 
	//	}
	}


	public void fileTest(/* String path, String fileName */) {
	//	프로젝트에 bs 폴더를 만들고 bs.txt를 저장
		String path = FileController.class.getResource("/").getPath();
		path = path.substring(0,path.lastIndexOf("bin"));
//		File del = new File(path+"/bs/bs.txt");
			File tst = new File(path+"/bs");
			File txt = new File(path+"/bs/bs.txt");
			if(tst.mkdir()) {	
				try {
					System.out.println(txt.createNewFile());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		
			
//		tst.close();
	}
	
	
	
	
	
//	File객체를 이용해서 file에 대한 정보를 출력해보자
	
	public void fileInfo()	{
		String path = FileController.class.getResource("/").getPath();
		//  mac > User/......
		// windows > C:\............
		// linux /home/.............
//		그래서 이렇게 위처럼 받아낸다.
		path = path.substring(0,path.lastIndexOf("bin"));
		File f = new File(path+"/bs/bs.txt");
		File dir = new File(path+"/bs");
		
		
			System.out.println(dir.isDirectory());
			System.out.println(f.isFile());
			
//		eg)
			if(!f.isDirectory() | f.isFile()) {
					System.out.println("\nexe");
					System.out.println(f.canExecute()); // 실행 파일이니?
					System.out.println("\nread");
					System.out.println(f.canRead()); // 읽을 수 있니?
	//				읽기 금지 되는 경우도 있음
					System.out.println("\nwrite");
					System.out.println(f.canWrite()); // 수정할 수 있니?
					System.out.println("\nname");
					System.out.println(f.getName()); /// 이름이 뭐니?
					System.out.println("\npath");
					System.out.println(f.getPath()); // 어디에 있니?
					System.out.println("\nupper direction");
					System.out.println(f.getParent());
					System.out.println("\nhidden");
					System.out.println(f.isHidden());
					System.out.println("\nlast modified");
					Date date = new Date(f.lastModified());
					System.out.println(new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(date));
					System.out.println("\nlength");
					System.out.println(f.length());
					//getPath() - getName = getParent
				File parentFile = f.getParentFile();
					System.out.println(parentFile);
	//				절대 경로 
				
				
					System.out.println("\nis it exist?");
					if(f.exists()) {
//						파일이 존재해요??
						
						System.out.println("yes");
//						파일이 있으면 문자로 쓰면 되겠지?
						
					} else {
						System.out.println("no");
						try {
							f.createNewFile();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
//						이렇게 파일이 없다면 우리가 생성해주는 식으로 쓰겠지
						
					}
			}
			
//			폴더 전체 내용 가져오기
				System.out.println("\n폴더에 있는 파일을 다 보여주기");
			File downloads = new File("/Users/sanghyeonkim/Downloads");
			String[] files =downloads.list();
				for(String file : files) {
					File temp = new File(downloads.getAbsoluteFile(), file);
						
					
					
					
					
					System.out.println("\n 파일만 알려줘");
						if(temp.isFile()) System.out.println(file);
					System.out.println(file);
				}
			File[] fileList = downloads.listFiles();
				for(File t : fileList) {
					/*
					
					
					 선생님 코드 참조해야할 듯???
					 
					
					*/
				}
				
			
	}
	
}
