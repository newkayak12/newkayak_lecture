package test_ex02_obj.studentmanage.view;

import java.util.Scanner;

import test_ex02_obj.studentmanage.controller.StudentController;
import test_ex02_obj.studentmanage.model.vo.Student;

public class Mainview {
// 메인화면 호출	
	
	Scanner scn = new Scanner(System.in);
	private int pointer = 0;
	private boolean run  = true;
	
	public void main() {
		
			System.out.println("======== 학생 관리 프로그램 ======== ");
			System.out.println("     1.   학생  등록");
			System.out.println("     2.   학생  조회");
			System.out.println("     3.   성적  등록");
			System.out.println("     4.   종     료 ");
			System.out.print(">");
			pointer= scn.nextInt();
			
			switch(pointer) {
				case 1:
					new StudentController().insertStudent();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					System.out.println("terminate");
					run = false;
					break;
					
			}
			
	
		
		
	}
	
	public Student register () {
		
		System.out.println("======== 학생 등록 프로그램 ======== ");
			System.out.print("학생 이름 : ");
		String name = scn.next();
			System.out.print("나이  : ");
		int age = scn.nextInt();
			System.out.print("학교  : ");
		String school = scn.next();
			System.out.println("주소  : ");
		String address = scn.next();
		
		
		Student s = new Student(name, age, school, address);
		 return s;
			}
	
//	public Student addScore() {
//		
//		
//	}
		
}
