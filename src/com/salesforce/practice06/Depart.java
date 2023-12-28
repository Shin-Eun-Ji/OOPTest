package com.salesforce.practice06;

public class Depart extends Employee {

    //코드작성
	private String department;
	

	public Depart() {
		super();
	}

	public Depart(String department) {
		super();
		this.department = department;
	}

	public Depart(String name, int salary) {
		super(name, salary);
	}

	public Depart(String name, int salary, String department) {
		this(name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
    public void getInformation() {
        System.out.println("이름:" + this.getName() + " 연봉:" + this.getSalary() + " 부서:" + department);
    }
}
