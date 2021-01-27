package test_ex02_obj_restart.view;

import java.util.Scanner;

import exceptions.InvalidNumberException;
import test_ex02_obj_restart.controller.StudentController;

public class MainView {
	Scanner scn = new Scanner(System.in);
	StudentController stucon = new StudentController();
	
	public void Mainmenu(StudentController stucon) {
		
		boolean run = true;
			do {	
				System.out.println("======== 학생 관리 메뉴 ========");
				System.out.println("      1. 학생 등록/수정 ");
				System.out.println("      2. 학생 전체 조회");
				System.out.println("      3. 성적     관리 ");
				System.out.println("      4. 학생 성적 조회 ");
				System.out.println("      5. 학생 조건 검색 ");
				System.out.println("      6. 종        료");
				System.out.println("=============================");
				System.out.print(" > ");
				int choice = scn.nextInt();
				
				
				switch (choice) {
				
					case 1:
						stucon.registrate(); // 하나의 studentController 객체를 지속 사용하기 위해서 변수로 해당 주소값을 받
						break;					// 결과적으로 StudentController의 객체는 단 하나만 사용할 예정
					case 2:
						stucon.inquaryAll();
						break;
					case 3:
						stucon.gradeManagement();
						break;
					case 4:
						stucon.gradeInquary();
						break;
					case 5:
						stucon.conditionalSearch();
						break;
					case 6:
						System.out.println("program Terminated");
						return;
						
				}
			}while(run);
				
	}
	
	public int registrate( ) throws InvalidNumberException {
		System.out.println("======== 학생 	 등록========");
		System.out.print("등록/수정할 학생의 수를 입력하세요 : ");
		
			int input = scn.nextInt();
			if(input<0) {
				throw new InvalidNumberException();
			}	else {
				return input;
		}
	}
	
	
	public void inquaryAll() {
		System.out.println("======== 학생  전체  조회 ========");
		return;
	}
	
	
	public void gradeManagement() {
			System.out.println("======== 성적 	   관리 ========");
		
	}
	
	public void gradeInquary() {
		 System.out.println("======== 학생  성적  조회 ========");
		
	}
	


	public void conditionalSearch() {
		System.out.println("========== 학생  조건  검색 ==========");
		
		
	}






}
