package test_ex02_obj_restart.controller;

import exceptions.InvalidNumberException;
import test_ex02_obj_restart.model.dao.StudentDao;
import test_ex02_obj_restart.view.MainView;

public class StudentController {
	StudentDao stuDao = new StudentDao();
	//dao의 객체가 무분별하게 늘어나면 문제가 생김 ()-> 모든 다른 값을 참조하여 NullPointerException확정임 그렇게 되면 그래서 하나만 사용할 예정
	public void mainMenuCall() {
		
		
		new MainView().Mainmenu(this); // 메인을 출력하며 하나의 studentcontroller만을 사용할 예정이다.
	}

	public void registrate() {
		int input = 0;
				try{
					 input = new MainView().registrate();	
				} catch(InvalidNumberException e) {
					System.out.println("잘못된 값이 입력됐습니다. 0보다 큰 수를 입력하십시오");
					
				} 
				
				
				 stuDao.registrate(input); 	
		
		//출력 확인을 위한 논리값, dao의 메소드는 int를 필요로 하며, 출력값은 논리
//		System.out.println(flag? "작업을 완료했습니다." : "작업에 실패했습니다.");  // 메인뷰의 메소드는 화면 출력과 배열을 만들 수를 받아서 dao의 메소드로 이전
		
	}

	public void inquaryAll() {
		new MainView().inquaryAll(); // 오로지 화면을 출력
		
		try {
			System.out.println(stuDao.inquiryAll()); //dao의 메소드가 문자열을 반환하며 해당 값을 누적 출력
		} catch(NullPointerException e) {
			System.out.println("\n\n ========   경    고   ========");
			
			System.out.println("\n\n\t등록된 학생이 없습니다. \n\t학생을 먼저 등록해주십시오.");
			
			System.out.println("\n\n ==============================\n\n\n\n\n");
		}
	}

	public void gradeManagement() {
		new MainView().gradeManagement(); //인터페이스 구현(html)
		try {
			stuDao.gradeManagement(); //우리가 계속 사용하고 있는 단일 객체인(student데이터를 관리하는) dao를 열어서 메소드를 호출
		} catch (InvalidNumberException e) { // 예외처리 0보다 작은 값이 나올 경우 해당 값은 잘못된 값
			System.out.println("점수는 0보다 작을 수 없습니다.");
		}
	}
	public void gradeInquary() {
		new MainView().gradeInquary();
		String result = stuDao.gradeInquary();
		System.out.println(result);
	}

	public void conditionalSearch() {
		new MainView().conditionalSearch();
		stuDao.conditionalSearch();
	}

}
