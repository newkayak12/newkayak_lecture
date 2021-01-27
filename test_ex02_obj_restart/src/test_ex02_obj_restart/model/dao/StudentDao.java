package test_ex02_obj_restart.model.dao;

import java.util.Arrays;
import java.util.Scanner;

import exceptions.InvalidNumberException;
import test_ex02_obj_restart.model.vo.Student;

public class StudentDao {
	private Student[] stuarr;
	Scanner scn = new Scanner(System.in);
	public void registrate(int input) {
//		boolean flag = false;
		if(stuarr==null) {	
			stuarr = new Student[input];  // 배열의 주소 값이 없을 경우 배열을 입력받은 값 만큼 새로 생성하고 
				for(int i =0; i<stuarr.length; i++) { 
					if(stuarr[i]==null) {	// 비어있는 공간부터 우선적으로 찾아서 객체를 생성
							System.out.println((i+1)+" 번째 학생에 대한 정보를 입력 중입니다.");
							System.out.print("이름을 입력해주세요 : ");
						String name = scn.next();
							System.out.print("나이를 입력해주세요 : ");
						int age = scn.nextInt();
							System.out.print("주소를 입력해주세요 : ");
						String address = scn.next();
							System.out.print("학교를 입력해주세요 : ");
						String school = scn.next();
						stuarr[i] = new Student(name, address, school, age);
//						flag = true;	// 객체 생성 성공 여부 확인을 위한 논리값
					}
				}
		} else {
			
			
			
			Student [] temp = new Student [stuarr.length+input];	// 추가할 배열을 위해서 원래의 배열 길이 + 새로 입력한 배열의 길이 
//			temp = Arrays.copyOfRange(stuarr,0,stuarr.length);
			System.arraycopy(stuarr, 0, temp, 0, stuarr.length); // 원본배열에서 임시로 만들어 놓은 배열로 값 복사 (임시 공간)
//			System.out.println("temp"+temp[0].toString());
			stuarr = new Student[temp.length];					// 임시배열의 길이를 기준으로 원래의 배열의 길이 재설정 (원본 공간 확장)
//			stuarr = Arrays.copyOfRange(temp, 0,temp.length);
			System.arraycopy(temp, 0, stuarr, 0, temp.length); //임시 배열로 원본 배열의 값을 전체 복사
//			System.out.println("stuarr"+stuarr[0].toString());
			
			
			
				for(int i =0; i<stuarr.length; i++) { //길이를 늘린 원본 배열의 추가된 부분부터 새롭게 학생 정보 작성
					 if(stuarr[i]==null) {
						 stuarr[i] = new Student();
						System.out.print("이름을 입력해주세요 : ");
						String name = scn.next();
							System.out.print("나이를 입력해주세요 : ");
						int age = scn.nextInt();
							System.out.print("주소를 입력해주세요 : ");
						String address = scn.next();
							System.out.print("학교를 입력해주세요 : ");
						String school = scn.next();
						stuarr[i] = new Student(name, address, school, age);
//						flag= true; //객체 생성 성공 확인을 위한 논리 값
					}
				}
			
		}
//		return flag;  // 해당 논리값은 에러 메시지를 출력하기 위함 try-catch로 처리
	}
	
	public String inquiryAll() throws NullPointerException{
		String result = "이름\t나이\t주소\t학교\tJava\tC++\tPython\tSwift\n"; // 위의 내역에 배열로 선언된 객체들의 정보 값을 누적하여 출력할 것임
			for(int i=0; i<stuarr.length; i++) {
				if(stuarr[i]!=null) {
					result += stuarr[i].toString();
				}
			}
		
		
		return result;
	}

	public void gradeManagement() throws InvalidNumberException{
		for(int i =0; i<stuarr.length; i++) {
			if( (stuarr[i].getJava()==0&&stuarr[i].getC()==0) && (stuarr[i].getPython()==0&&stuarr[i].getSwift()==0) ) {	
					System.out.println("\n"+(i+1)+" 번째 학생의 성적을 입력합니다. ");
				
					System.out.print("Java 성적을 입력해주십시오. : "); //for를 이용해서 각각의 배열의 멤버변수에 접근하고 값을 수정( 배열을 구성하고 있는 객체는 엄연하게 말하면 Student 객체이다. 
				int java = scn.nextInt();							// 근데 Dao와 Student는 상속 관계도 아닐 뿐더러 상속이더라도 private이기 때문에 직접 접근은 불가능하다. 
					System.out.print("C++ 성적을 입력해주십시오. : ");	// 따라서 여기서는 Student클래스에 존재해서 private값을 수정하는 간접 접근 방법인 getter/setter를 사용할 것이다.
				int c = scn.nextInt();
					System.out.print("python 성적을 입력해주십시오. : ");
				int python = scn.nextInt();
					System.out.print("swift 성적을 입력해주십시오. : ");
				int swift = scn.nextInt();
					if(java>0&&c>0&&python>0&&swift>0) {
						stuarr[i].setJava(java);
						stuarr[i].setC(c);
						stuarr[i].setPython(python);
						stuarr[i].setSwift(swift);
					} else {
						throw new InvalidNumberException();
					}
			} 	
		}
	}

	public String gradeInquary() {
		String result = "\t이름\t총점\t평균\n";
			for(int i=0; i<stuarr.length; i++) {
				int total = stuarr[i].getJava()+stuarr[i].getC()+stuarr[i].getPython()+stuarr[i].getSwift();
				result += "\t"+stuarr[i].getName()+"\t"+total+"\t"+(double)total/4+"\n";
			}
		return result;	
	}

	public void conditionalSearch()  {
		System.out.println("1. 학생을 이름으로 조건 검색");
		System.out.println("2. 학생을 주소로 조건 검색");
		System.out.print(">");
		int input = scn.nextInt();
			switch(input) {
				case 1 :
					System.out.println(searchingWithName());
					break;
				case 2 :
					System.out.println(searchingWithAddress());
					break;
				default : 
					System.out.println("잘못된 값입니다. 다시 입력해주세요.");
			}
				
			
	}

	private String searchingWithAddress() {
			System.out.print("이름을 입력하세요 : ");
		String search = scn.next();
		String result = "이름\t나이\t주소\t학교\tJava\tC++\tPython\tSwift\n";
			for(int i =0; i<stuarr.length; i++) {
				if(stuarr[i]!=null&&stuarr[i].getName().equals(search)) {
					result += stuarr[i].toString();
				}
			}
			return result;
	}

	private String searchingWithName() {
		System.out.print("나이를 입력하세요 : ");
		int search = scn.nextInt();
		String result = "이름\t나이\t주소\t학교\tJava\tC++\tPython\tSwift\n";
			for(int i =0; i<stuarr.length; i++) {
				if(stuarr[i]!=null&&stuarr[i].getAge()==search) {
					result += stuarr[i].toString();
				}
			}
			return result;
		
	}
}
