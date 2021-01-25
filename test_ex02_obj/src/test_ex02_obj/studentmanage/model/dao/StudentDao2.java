package test_ex02_obj.studentmanage.model.dao;

import test_ex02_obj.studentmanage.controller.StudentController2;
import test_ex02_obj.studentmanage.model.vo.Student2;

	public class StudentDao2 extends Student2 {
	private	static Student2 [] student = new Student2[5];
	StudentController2 sc2 = new StudentController2();
	
	public static Student2[] getStudent() {
		return student;
	}
	public static void setStudent(Student2[] student) {
		StudentDao2.student = student;
	}
	
		public void init() {
			for(int i = 0; i<student.length; i++) {
				student[i] = sc2.insertStudent();
			}
		}
		
	
			
	}
