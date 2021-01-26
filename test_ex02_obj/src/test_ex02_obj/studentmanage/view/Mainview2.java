package test_ex02_obj.studentmanage.view;

import java.util.Scanner;

import test_ex02_obj.studentmanage.controller.StudentController2;
import test_ex02_obj.studentmanage.model.dao.StudentDao2;
import test_ex02_obj.studentmanage.model.vo.Student2;

public class Mainview2 {
	// 메인화면 호출	
		
		Scanner scn = new Scanner(System.in);
		private int pointer = 0;
		private boolean run  = true;
		
		public boolean isRun() {
			return run;
		}

		public void setRun(boolean run) {
			this.run = run;
		}

		public void main() {
			
				
				while(run) {	
					System.out.println("======== 학생 관리 프로그램 ======== ");
					System.out.println("     1.   학생  등록");
					System.out.println("     2.   학생  조회");
					System.out.println("     3.   성적  등록");
					System.out.println("     4.   종     료 ");
					System.out.print(">");
						
						pointer= scn.nextInt();
					switch(pointer) {
						case 1:
							new StudentDao2().init();
							break;
						case 2:
							new StudentController2().getinfo();
//							inquiry();
							break;
						case 3:
							break;
						case 4:
							System.out.println("terminate");
							setRun(false);
							break;
							
					}
				}	
		
			
			
		}
		
		public Student2 register () {
			
			System.out.println("======== 학생 등록 프로그램 ======== ");
				System.out.print("학생 이름 : ");
			String name = scn.next();
				System.out.print("나이  : ");
			int age = scn.nextInt();
				System.out.print("학교  : ");
			String school = scn.next();
				System.out.print("주소  : ");
			String address = scn.next();
			
			
			Student2 studentinfo = new Student2(name, age, school, address);
			 return studentinfo;
				}
		
		public void inquiry( ) {
			for(int i =0; i<StudentDao2.getStudent().length; i++) {
				
				System.out.println(StudentDao2.getStudent()[i].getName());
				System.out.println(StudentDao2.getStudent()[i].getAddress());
				System.out.println(StudentDao2.getStudent()[i].getAge());
				System.out.println(StudentDao2.getStudent()[i].getSchool());
					
				}
			
			}
		
		
		public void enterscore() {
			int score =0;
			
				for(int i = 0; i<StudentDao2.getStudent().length; i++) {
						System.out.print(StudentDao2.getStudent()[i].getName() + " 의 국어 성적 : ");
					 score = scn.nextInt();
					StudentDao2.getStudent()[i].setKor(score);
					
						System.out.print(StudentDao2.getStudent()[i].getName() + " 의 영어 성적 : ");
					score = scn.nextInt();
					StudentDao2.getStudent()[i].setEng(score);
					
						System.out.print(StudentDao2.getStudent()[i].getName() + " 의 수학 성적 : ");
					score = scn.nextInt();
					StudentDao2.getStudent()[i].setMath(score);
					
						System.out.print(StudentDao2.getStudent()[i].getName() + " 의 코딩 성적 : ");
					score = scn.nextInt();
					StudentDao2.getStudent()[i].setCode(score);
					
				}
		}
		
		
			
	}
