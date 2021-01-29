package test_ex02_obj.studentmanage.controller;

import test_ex02_obj.studentmanage.model.dao.StudentDao;
import test_ex02_obj.studentmanage.model.vo.Student;
import test_ex02_obj.studentmanage.view.Mainview;

public class StudentController {
	// student를 관리하는 필요한 화면 기능 데이터 저장관리 기능 호출하는 역할의 객체
		


		public void mainMenu()	{
			new Mainview().main();
			
		}
		
		public Student insertStudent() {
			Student s = new Mainview().register();
			
			
			
			return s;
		}
		
		
		
		
	}
