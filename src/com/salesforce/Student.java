package com.salesforce;

public class Student extends Person {

	private String schoolName;

	public Student() {
		super();
	}

	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
		System.out.println("Student 기본 생성자 출력됨.");
	}

	public Student(String name, int age, String schoolName) {
		// TODO Auto-generated constructor stub
		this(schoolName);
		this.setAge(age);
		this.setName(name);
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name=" + this.getName() + ", age=" + this.getAge() + "]";
	}
	
	public void showInfo() {
		System.out.println(this);
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
}
