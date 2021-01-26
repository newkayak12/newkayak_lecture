package test_ex02_obj2.studentmanage.controller;

import test_ex02_obj2.studentmanage.model.dao.StudentDao;
import test_ex02_obj2.studentmanage.model.vo.Student;
import test_ex02_obj2.studentmanage.view.Mainview;

public class StudentController {
// student를 관리하는 필요한 화면 기능 데이터 저장관리 기능 호출하는 역할의 객체
	private StudentDao dao = new StudentDao();
	
	//
//	public StudentController s;
	//

	public void mainMenu()	{
		new Mainview().main(this);
//		this.s = Mainview.stu;
	}
	
	public Student insertStudent() {
		Student s = new Mainview().register();
//		1. 학생 정보 입력할 view
//		2. StudentDao 데이터 저장소에 저장하기
		
		boolean flag = dao.insertStudent(s);
//		3. 입력 결과에 따라 사용자에게 메시지 출력 > main
		String msg = flag? "입력 성공" : "저장할 공간이 부족합니다.";
		
		new Mainview().printMsg(msg);
		return s;
	}

	public void searchAllStrudent() {
// dao에 저장되어 있는 StudentDao의 멤버 변수에 저장되어 있는 데이터를 출력 > 사용자에게 보여주는 것
		String result = dao.searchAllStudent();
		new Mainview().printMsg(result);
	}
	
	public void updateStudent() {
//		저장된 학생을 한 명 선택해서 데이터 수정 
		
		String data = dao.searchAllStudent();
		new Mainview().printMsg(data);
		Student student = new Mainview().updateStudent();
		dao.updateStudent(student);
		boolean flag = dao.updateStudent(student);
		String msg = flag? "수정 성공" :"수정이 불가능합니다.";
		new Mainview().printMsg(msg);
		
	
	}
	
	public void updateScore() {
		String data = dao.searchAllStudent();
		new Mainview().printMsg(data);
		
		Student student = new Mainview().updateScore();
		dao.updateScore(student);
		
		
		
		boolean flag = dao.updateScore(student);
		String msg = flag? "수정/생성 성공" : "수정/생성이 불가능합니다.";
		new Mainview().printMsg(msg);
		
	}

	public void totalAvg() {
		Student student = new Mainview().totalAvg();
		String result = dao.totalAvg();
		new Mainview().printMsg(result);
		
	}

	public void searchAge() {
		Student student = new Mainview().searchAge();
		String result = dao.searchAge(student);
		new Mainview().printMsg(result);
	}

	public void searchName() {
		
		Student student = new Mainview().searchName();
		String result = dao.searchName(student);
		new Mainview().printMsg(result);
	}
	
	
	
	
	
}
