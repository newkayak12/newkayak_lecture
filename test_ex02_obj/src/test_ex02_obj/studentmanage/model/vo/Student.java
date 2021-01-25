package test_ex02_obj.studentmanage.model.vo;

public class Student {
	
// 객체의 저장
 private String name, address, school;
 private int age, kor, eng, math, code;
 
 public Student() {
	 
	 
 }
 
 public Student( String name, int age, String school, String address) {
	 this.name=name;
	 this.age = age;
	 this.school=school;
	 this.address=address;
 }
 
 public Student(String name, int age, String school, String address, int kor, int eng, int math, int code) {
	 this(name, age, school, address);
	 this.kor = kor;
	 this.eng = eng;
	 this.math = math;
	 this.code = code;
			 
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getSchool() {
	return school;
}

public void setSchool(String school) {
	this.school = school;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getKor() {
	return kor;
}

public void setKor(int kor) {
	this.kor = kor;
}

public int getEng() {
	return eng;
}

public void setEng(int eng) {
	this.eng = eng;
}

public int getMath() {
	return math;
}

public void setMath(int math) {
	this.math = math;
}

public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

	 
 
 
 
}
