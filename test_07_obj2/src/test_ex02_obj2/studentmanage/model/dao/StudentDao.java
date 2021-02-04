package test_ex02_obj2.studentmanage.model.dao;


import test_ex02_obj2.studentmanage.model.vo.Student;

public class StudentDao {
	private Student [] students  = new Student[3];
	private static int studentIndex =0;
	
	
	
	public StudentDao() {
		
	}
	
	
	
	public boolean insertStudent(Student s) {
		boolean flag = true;
		
		try {
			students[studentIndex]=s;
			studentIndex++;
		} catch (ArrayIndexOutOfBoundsException e) {
			Student[] temp = new Student[students.length+5];
			System.arraycopy(students, 0, temp, 0, students.length);
			studentIndex = students.length;
			students = temp;
			temp = null;
			students[studentIndex]=s;
			studentIndex++;
		}
		
//	분석할 가치는 있지?
		
		
//		for(int i =0; i<students.length; i++)	{
//				if(students[i]==null) {
//					students[i] =s;
//					flag =true;
//					break;
//	
//				}
//		}
		
		
		return flag;
	}
	
	public String searchAllStudent() {
		String value="이름\t나이\t주소\t학교\t국어\t영어\t수학\t코딩\n";
			for(int i =0; i<students.length; i++) {
				if(students[i]!=null) {
					value += students[i]+"\n";
				}
				
			}
			
			
			return value;
	}
	
	public boolean updateStudent(Student s) {
		boolean flag = false;
			for(int i = 0; i<students.length; i++) {
				
				
				if(students[i]!=null&&students[i].equals(s.getName())) {
					
					students[i].setAge(s.getAge());
					students[i].setAddress(s.getAddress());
					flag = true;
					break;
				}
			}
			
			return flag;
	}
	
	public boolean updateScore(Student s) {
		boolean flag = false;
			for(int i =0; i<students.length; i++) {
				if(students[i]!=null && students[i].getName().equals(s.getName())) {
					students[i].setKor(s.getKor());
					students[i].setEng(s.getEng());
					students[i].setMath(s.getMath());
					students[i].setCode(s.getCode());
					flag = true;
					break;
				}
			}
			return flag;
	}
	
	
	public String searchName(Student s) {
		boolean flag = false;
		String value="이름\t나이\t주소\t학교\t국어\t영어\t수학\t코딩\n";
			for(int i =0; i<students.length; i++) {
				if(students[i]!=null && students[i].getName().equals(s.getName())) {
					value += students[i];
					flag = true;
					break;
				}
			}
			
			
			return value;
	}
	
	public String searchAge(Student s) {
		boolean flag = false;
		String value="이름\t나이\t주소\t학교\t국어\t영어\t수학\t코딩\n";
			for(int i =0; i<students.length; i++) {
				if(students[i]!=null && students[i].getAge()==s.getAge()) {
					value += students[i];
					flag = true;
				}
			}
			
			
			return value;
	}
	
	public String totalAvg( ) {
		String value="이름\t총점\t평균\n";
			for(int i = 0; i<students.length; i++) {
				if(students[i]!=null) {
					int total = (students[i].getKor()+students[i].getEng()+students[i].getMath()+students[i].getCode());
					value += students[i].getName()+"\t"+total+"\t"+((double)total/4)+"\n";
				}
			}
			
			
			
			return value;
	}
	

}
