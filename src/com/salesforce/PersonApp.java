package com.salesforce;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("정우성", 45);
		Student s1 = new Student("서울고등학교");
		Student s2 = new Student("이정재", 45, "한국고등학교");
	
		System.out.println("1");	
		System.out.println(p);
		System.out.println("2");
		System.out.println(s1);
		System.out.println("3");
		System.out.println(s2);
	}

}
