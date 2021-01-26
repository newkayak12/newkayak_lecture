package test_ex02_obj2.studentmanage.model.dao;

import test_ex02_obj2.studentmanage.controller.StudentController;
import test_ex02_obj2.studentmanage.model.vo.Student;
import test_ex02_obj2.studentmanage.view.Mainview;

public class StudentDao {
//     클라가 등록하는 학생들을 관리
//	멤버 변수를 얘가 가지고 있다. (5개)
	private Student s1;
	private Student s2;
	private Student s3;
	private Student s4;
	private Student s5;
//	참조형의 기본값은 무조건 null
	public StudentDao() {
		// TODO Auto-generated constructor stub
	}
	
//	메소드로 초기화 하도록 만들 예정임
	
	public boolean insertStudent(Student s) {
//		멤버변수 중 비어있는 변수에 값을 넣으면 비어있는 것은 멤버변수의 값이 null
		boolean flag = true;	
			if(s1==null) {
					s1=s;
				} else if(s2==null) {
					s2=s;
				} else if(s3==null) {
					s3=s;
				} else if(s4==null) {
					s4=s;
				} else if(s5==null) {
					s5=s;
				}else {
					flag = false;
				}
//			 null이 주소 값이랑 같은 말이니까 '=='로 비교하는게 맞고
		
		return flag;
	}

	public String searchAllStudent() {
//		Dao 객체에 저장되어있느 멤버 변수의 내용을 출력
		String value="이름\t나이\t주소\t학교\t국어\t영어\t수학\t코딩\n";
			if(s1!=null) {
				value+=s1.getName() + "\t" + s1.getAge()+ "\t"+ s1.getAddress()+ "\t"+s1.getSchool()+ "\t"+ s1.getKor()+ "\t"+s1.getEng()+ "\t"+ s1.getMath()+ "\t"+s1.getCode()+ "\n";
			} if(s2!=null) {
				value+=s2.getName() + "\t" + s2.getAge()+ "\t"+ s2.getAddress()+ "\t"+s2.getSchool()+ "\t"+ s2.getKor()+ "\t"+s2.getEng()+ "\t"+ s2.getMath()+ "\t"+s2.getCode()+ "\n";
			} if(s3!=null) {
				value+=s3.getName() + "\t" + s3.getAge()+ "\t"+ s3.getAddress()+ "\t"+s3.getSchool()+ "\t"+ s3.getKor()+ "\t"+s3.getEng()+ "\t"+ s3.getMath()+ "\t"+s3.getCode()+ "\n";
			} if(s4!=null) {
				value+=s4.getName() + "\t" + s4.getAge()+ "\t"+ s4.getAddress()+ "\t"+s4.getSchool()+ "\t"+ s4.getKor()+ "\t"+s4.getEng()+ "\t"+ s4.getMath()+ "\t"+s4.getCode()+ "\n";
			} if(s5!=null) {
				value+=s5.getName() + "\t" + s5.getAge()+ "\t"+ s5.getAddress()+ "\t"+s5.getSchool()+ "\t"+ s5.getKor()+ "\t"+s5.getEng()+ "\t"+ s5.getMath()+ "\t"+s5.getCode()+ "\n";
			}
			
//			이렇게 if if if 쓰면 다 찾아봄.... 다 대조함  else if랑은 다름 
			
			return value;
			
	}

	public boolean updateStudent(Student student) {
		boolean flag = true;
		if(s1!=null&&s1.getName().equals(student.getName())) {
			s1.setAge(student.getAge());
			s1.setAddress(student.getAddress());
		}else if(s2!=null&&s2.getName().equals(student.getName())) {
			s2.setAge(student.getAge());
			s2.setAddress(student.getAddress());
		}else if(s3!=null&&s3.getName().equals(student.getName())) {
			s3.setAge(student.getAge());
			s3.setAddress(student.getAddress());
		}else if(s4!=null&&s4.getName().equals(student.getName())) {
			s4.setAge(student.getAge());
			s4.setAddress(student.getAddress());
		}else if(s5!=null&&s5.getName().equals(student.getName())) {
			s5.setAge(student.getAge());
			s5.setAddress(student.getAddress());
		} else {
			flag = false;
			System.out.println("잘못된 이름입니다. ");
		
		}
		
		return flag;
	}
	
	public boolean updateScore(Student student) {
		boolean flag = true;
		if(s1!=null&&s1.getName().equals(student.getName())) {
			s1.setKor(student.getKor());
			s1.setEng(student.getEng());
			s1.setMath(student.getMath());
			s1.setCode(student.getCode());
			
		}else if(s2!=null&&s2.getName().equals(student.getName())) {
			s2.setKor(student.getKor());
			s2.setEng(student.getEng());
			s2.setMath(student.getMath());
			s2.setCode(student.getCode());
			
		}else if(s3!=null&&s3.getName().equals(student.getName())) {
			s3.setKor(student.getKor());
			s3.setEng(student.getEng());
			s3.setMath(student.getMath());
			s3.setCode(student.getCode());
			
		}else if(s4!=null&&s4.getName().equals(student.getName())) {
			s4.setKor(student.getKor());
			s4.setEng(student.getEng());
			s4.setMath(student.getMath());
			s4.setCode(student.getCode());
			
		}else if(s5!=null&&s5.getName().equals(student.getName())) {
			s5.setKor(student.getKor());
			s5.setEng(student.getEng());
			s5.setMath(student.getMath());
			s5.setCode(student.getCode());
			
			s5.setAddress(student.getAddress());
		} else {
			flag = false;
			System.out.println("잘못된 이름입니다. ");
		
		}
		
		return flag;
	}
	
	
	public String searchName(Student student) {
		boolean flag = true;
		String value="이름\t나이\t주소\t학교\t국어\t영어\t수학\t코딩\n";
		if(s1!=null&&s1.getName().equals(student.getName())) {
			value += s1.getName()+"\t"+s1.getAge()+"\t"+s1.getAddress()+"\t"+s1.getSchool()+"\t"+s1.getKor()+"\t"+s1.getEng()+"\t"+s1.getMath()+"\t"+s1.getCode()+"\n";
			
		}else if(s2!=null&&s2.getName().equals(student.getName())) {
			value+=s2.getName() + "\t" + s2.getAge()+ "\t"+ s2.getAddress()+ "\t"+s2.getSchool()+ "\t"+ s2.getKor()+ "\t"+s2.getEng()+ "\t"+ s2.getMath()+ "\t"+s2.getCode()+ "\n";
			
		}else if(s3!=null&&s3.getName().equals(student.getName())) {
			value+=s3.getName() + "\t" + s3.getAge()+ "\t"+ s3.getAddress()+ "\t"+s3.getSchool()+ "\t"+ s3.getKor()+ "\t"+s3.getEng()+ "\t"+ s3.getMath()+ "\t"+s3.getCode()+ "\n";
			
		}else if(s4!=null&&s4.getName().equals(student.getName())) {
			value+=s4.getName() + "\t" + s4.getAge()+ "\t"+ s4.getAddress()+ "\t"+s4.getSchool()+ "\t"+ s4.getKor()+ "\t"+s4.getEng()+ "\t"+ s4.getMath()+ "\t"+s4.getCode()+ "\n";
			
		}else if(s5!=null&&s5.getName().equals(student.getName())) {
			value+=s5.getName() + "\t" + s5.getAge()+ "\t"+ s5.getAddress()+ "\t"+s5.getSchool()+ "\t"+ s5.getKor()+ "\t"+s5.getEng()+ "\t"+ s5.getMath()+ "\t"+s5.getCode()+ "\n";
		} else {
			flag = false;
			System.out.println("잘못된 이름입니다. ");
		 
		}
		return value;
	}

	public String searchAge(Student student) {
		boolean flag = true;
		String value="이름\t나이\t주소\t학교\t국어\t영어\t수학\t코딩\n";
		if(s1!=null&&s1.getAge()==student.getAge()) {
			value += s1.getName()+"\t"+s1.getAge()+"\t"+s1.getAddress()+"\t"+s1.getSchool()+"\t"+s1.getKor()+"\t"+s1.getEng()+"\t"+s1.getMath()+"\t"+s1.getCode()+"\n";
			
		}else if(s2!=null&&s1.getAge()==student.getAge()) {
			value+=s2.getAge() + "\t" + s2.getAge()+ "\t"+ s2.getAddress()+ "\t"+s2.getSchool()+ "\t"+ s2.getKor()+ "\t"+s2.getEng()+ "\t"+ s2.getMath()+ "\t"+s2.getCode()+ "\n";
			
		}else if(s3!=null&&s1.getAge()==student.getAge()) {
			value+=s3.getAge() + "\t" + s3.getAge()+ "\t"+ s3.getAddress()+ "\t"+s3.getSchool()+ "\t"+ s3.getKor()+ "\t"+s3.getEng()+ "\t"+ s3.getMath()+ "\t"+s3.getCode()+ "\n";
			
		}else if(s4!=null&&s1.getAge()==student.getAge()) {
			value+=s4.getAge() + "\t" + s4.getAge()+ "\t"+ s4.getAddress()+ "\t"+s4.getSchool()+ "\t"+ s4.getKor()+ "\t"+s4.getEng()+ "\t"+ s4.getMath()+ "\t"+s4.getCode()+ "\n";
			
		}else if(s5!=null&&s1.getAge()==student.getAge()) {
			value+=s5.getAge() + "\t" + s5.getAge()+ "\t"+ s5.getAddress()+ "\t"+s5.getSchool()+ "\t"+ s5.getKor()+ "\t"+s5.getEng()+ "\t"+ s5.getMath()+ "\t"+s5.getCode()+ "\n";
		} else {
			flag = false;
			System.out.println("요청이 잘못됐습니다. ");
		 
		}
		return value;
	}

	public String totalAvg() {
		String value="이름\t총점\t평균\n";
		if(s1!=null) {
			int s1to = (s1.getKor()+s1.getEng()+s1.getMath()+s1.getCode());
			value+= s1.getName()+"\t"+s1to+"\t"+((double) s1to/4)+"\n";
		}else if(s2!=null) {
			int s2to = (s2.getKor()+s2.getEng()+s2.getMath()+s2.getCode());
			value+=s2.getName()+"\t"+s2to+"\t"+((double) s2to/4)+"\n";
		}else if(s3!=null) {
			int s3to = (s3.getKor()+s3.getEng()+s3.getMath()+s3.getCode());
			value+=s3.getName()+"\t"+s3to+"\t"+((double) s3to/4)+"\n";
		}else if(s4!=null) {
			int s4to = (s4.getKor()+s4.getEng()+s4.getMath()+s4.getCode());
			value+=s4.getName()+"\t"+s4to+"\t"+((double) s4to/4)+"\n";
		}else if(s5!=null) {
			int s5to = (s5.getKor()+s5.getEng()+s5.getMath()+s5.getCode());
			value+=s5.getName()+"\t"+s5to+"\t"+((double) s5to/4)+"\n";
		} else {
			System.out.println("요청이 잘못됐습니다. ");
		 
		}
		
		
		
		
		
		
		
		return value;
	}
	
}
