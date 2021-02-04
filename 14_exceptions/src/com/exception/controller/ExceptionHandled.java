package com.exception.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandled {
	public void testException() throws FileNotFoundException {
//		1. 예외 처리 방법
		
		new FileReader("test.txt");
		
		
	}
	
	
	public void tryCatchTest()	{
		
		///////////////////////한 개의 그룹이다. ////////////////////////////////////////////////////////////////
		try {
			
			FileReader fr = new FileReader("test.txt");
			System.out.println("안냥! 나는 잘 보이니?");
			
			int data = -1;
			while((data =fr.read())!=-1) {
//				Unhandled exception type IOException
				
			}
			
			
		} catch( FileNotFoundException e ) {
			e.printStackTrace();
//			return;
//		finally 안 써도 되는거 아님?? > 은 위 처럼 return 있으면 어쩔래?
//			return 위에 쓰면 되는거 아님??ㅋㅋㅋ > file이 진짜 있으면 여기는 안거쳐가네?????????????????
//			만약에 stream을 닫아줘야하는 거면 어쩔래??? 응?????????????????????????????????????????
		}  catch( IOException e ) {

//			얘가 있어야 무.조.건. 실행해야할 때 !
//			파일 입출력 객체를 반환(닫아줄 때 많이 사용) > 안 닫으면 데이터가 날아가는 경우도 있어서 반드시 닫아줘야함
			
//			fr.finalize();
			System.out.println("hi!");
		
		
		
		
		} finally {
			
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("try 밖입니다.");
//		fr.read();
	}
	
	
	
	
	
//	Exception 객체들도 상속 관계가 있어서 그 관계에 따라 처리 방법이 있음
//	Exception 모든 Exception의 부모 객체... 
//	Exception들은 각 관계에 따라 부모 - 자식 관계가 있다.( 계층도가 있다.)
//	예외 처리 시 부모 Exception은 자식의 Exception까지 다 처리할 수 있다.
//	그래서 다중 catch를 할 때 부모 catch를 위에 두면 밑에 자식 catch로는 빨려 들어가지 않는다.
//	예를 들어 IOException은 FileNotFoundException의 부모 그래서 다! 받을 수 있다.
//	그래서 부모, 자식 다 쓸거면 자식부터 쓰고 마지막에 부모를 쓰는 식으로 
//	unreachable~
//	그래서 서로 간의 상속관계를 잘 파악하고 써야한다.
//	
//	만약 예외 이름을 모르곘으면 그냥 Exception으로 처리하면 되는데
//	세밀하게 들어가면 Exception에 분기처리해야겠지... 에러를 받는게 목적이 아니라 정상적으로 처리하는게 목적이니까
//	
//	
//	eg. 파일을 만드는 것 vs 데이터를 입력하는 것 ... 전혀 다르잖아 로직이 달라지는거고
	
	
//	그리고 만약에 try 안에서 변수를 선언했다고 하면 얘를 전역 변수(필드)처럼 외부에서 사용 가능할까요???????????????????????????????????
//	fr cannot be resolved
//	try 안에서 선언한건 try까지만! (어디서 에러날지 어떻게 알아?
//	그러면 스트림 닫아줄 때는 ???  그래서 try 밖에서 선언하고 try catch finally  어디든 지지고 볶으시라고요
	
	
	
}
