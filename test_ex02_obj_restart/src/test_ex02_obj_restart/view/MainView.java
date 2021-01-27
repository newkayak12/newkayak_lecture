package test_ex02_obj_restart.view;

import java.util.Scanner;

public class MainView {

	public void Mainmenu() {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
			do {	
				System.out.println("======== 학생 관리 메뉴 ========");
				System.out.println("   	  1. 학생     등록 ");
				System.out.println("   	  2. 학생 전체 조회");
				System.out.println("   	  3. 성적     관리 ");
				System.out.println("   	  4. 학생 정보 관리 ");
				System.out.println("   	  5. 학생 조건 검색 ");
				System.out.println("      6. 종        료");
				
				System.out.print(" > ");
				int choice = scn.nextInt();
				
				
				switch (choice) {
				
					case 1:
						registrate();
						break;
					case 2:
						inquaryAll();
						break;
					case 3:
						gradeManagement();
						break;
					case 4:
						infoManagement();
						break;
					case 5:
						conditionalSearch();
						break;
					case 6:
						System.out.println("program Terminated");
						return;
						
				}
			}while(run);
				
	}
	
	public void registrate( ) {
		
	}
	
	
	private void inquaryAll() {
		// TODO Auto-generated method stub
		
	}
	
	
	private void gradeManagement() {
		// TODO Auto-generated method stub
		
	}
	
	private void infoManagement() {
		// TODO Auto-generated method stub
		
	}


	private void conditionalSearch() {
		// TODO Auto-generated method stub
		
	}






}
