package test_ex02_obj2.studentmanage.view;

import java.util.Scanner;

import test_ex02_obj2.studentmanage.controller.StudentController;
import test_ex02_obj2.studentmanage.model.dao.StudentDao;
import test_ex02_obj2.studentmanage.model.vo.Student;

public class Mainview {
// 메인화면 호출	
	
//	public static StudentController stu = new StudentController();
	
	Scanner scn = new Scanner(System.in);
	private int pointer = 0;
	

	public void main(StudentController sc) {
//		이름으로 학생 조회
//		나이로 학생 조회
//		학생 총점/평균 구하기
		
			
			while(true) {	
				System.out.println("======== 학생 관리 프로그램 ======== ");
				System.out.println("     1.   학생  등록");
				System.out.println("     2.   학생  조회");
				System.out.println("     3.   학생  수정");
				System.out.println("     4.   성적  등록");
				System.out.println("     5.   이름으로 검색");
				System.out.println("     6.   나이로  검색");
				System.out.println("     7.   총점 / 평균");
				System.out.println("     8.   종     료 ");
				System.out.print(">");
					
					pointer= scn.nextInt();
				switch(pointer) {
					case 1:
						sc.insertStudent();
						break;
					case 2:
						sc.searchAllStrudent();
						break;
					case 3: 
						sc.updateStudent();
						break;
					case 4:
						sc.updateScore();
						break;
					case 5:
						sc.searchName();
						break;
					case 6:
						sc.searchAge();
						break;
					case 7:
						sc.totalAvg();
						break;
					case 8:
						System.out.println("terminate");
						return;
						
				}
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
			System.out.print("주소  : ");
		String address = scn.next();
		
		
		Student s = new Student(name, age, school, address);
		 return s;
			}
//	자료형이 다양하니.. 객체로 그냥 반환

	public void printMsg(String msg) {
		System.out.println("==== 시스템 메시지 ====");
		System.out.println(msg);
		System.out.println("====================");
		
	}
	
	public Student updateStudent() {
		Student s =new Student();
			System.out.println("========학생 정보 수정=========");
			System.out.print("수정할 학생 이름을 입력하세요 >");
		s.setName(scn.next());
			System.out.println("수정할 나이를 입력하세요 >");
		s.setAge(scn.nextInt());
			System.out.print("수정할 주소를 입력하세요 >");
		s.setAddress(scn.next());
		
		
		return s;	
	}


	public Student updateScore() {
		Student s = new Student();
				System.out.println("========== 학생 성적 수정 ==========");
				System.out.print("수정할 학생 이름을 입력하세요 >");
			s.setName(scn.next());
				System.out.print("수정할 국어 점수를 입력하세요>");
			s.setKor(scn.nextInt());
				System.out.print("수정할 영어 점수를 입력하세요 >");
			s.setEng(scn.nextInt());
				System.out.print("수정할 수학 점수를 입력하세요 >");
			s.setMath(scn.nextInt());
				System.out.print("수정할 코딩 점수를 입력하세요 >");
			s.setCode(scn.nextInt());
			
		
		return s;
	}


	public Student totalAvg() {
		// TODO Auto-generated method stub
		return null;
	}


	public Student searchAge() {
		Student s = new Student();
		System.out.println("======== 나이로 학생 검색 =========");
		System.out.print("검색할 학생의 나이 입력하세요 > ");
	s.setAge(scn.nextInt());
	return s;
	}


	public Student searchName() {
		Student s = new Student();
			System.out.println("======== 이름으로 학생 검색 =========");
			System.out.print("검색할 학생의 이름을 입력하세요 > ");
		s.setName(scn.next());
		return s;
	}
	
	
	
	
		
}
