package test_ex02_obj.studentmanage.model.dao;

import test_ex02_obj.studentmanage.model.vo.Student;
import test_ex02_obj.studentmanage.view.Mainview;

public class StudentDao {
//     클라가 등록하는 학생들을 관리
//	멤버 변수를 얘가 가지고 있다. (5개)
	Student[] student= new Student[5];
	
	public void studentadd() {
		for(int i =0; i<student.length; i++) {
			student[i]	= new Mainview().register();
		}
	}
	
}
