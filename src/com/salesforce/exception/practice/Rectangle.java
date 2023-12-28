package com.salesforce.exception.practice;

public class Rectangle {
	private int a;
	private int b;
	
	public Rectangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public boolean equals(Object obj) {
		Rectangle r = ((Rectangle) obj);
		
		if(this.hashCode() == r.hashCode()) {
			return true;
		} else {
			//this의 면적과 r의 면적 비교
			if(this.getArea() == r.getArea()) {
				return true;
			}
		}
		return false;
	}

	private Object getArea() {
		return a * b;
	}
}
