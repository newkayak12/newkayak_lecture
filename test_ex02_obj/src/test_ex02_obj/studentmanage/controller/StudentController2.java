package test_ex02_obj.studentmanage.controller;

import test_ex02_obj.studentmanage.model.vo.Student2;
import test_ex02_obj.studentmanage.view.Mainview2;

public class StudentController2 {
	// student를 관리하는 필요한 화면 기능 데이터 저장관리 기능 호출하는 역할의 객체
		


		public void mainMenu()	{
			new Mainview2().main();
			
		}
		
		public Student2 insertStudent() {
			Student2 s = new Mainview2().register();
			
			
			
			return s;
		}
		
		public void getinfo() {
			
			new Mainview2().inquiry();
		}
		
		
		
		
	}
