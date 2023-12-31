package com.salesforce.interfaceEx;

public class ShapeApp {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.setRadius(5);
		System.out.println("원의 면적은 " + c.area() + "이다.");
		
		Triangle t = new Triangle();
		t.setLineA(3);
		t.setLineB(5);
		System.out.println("삼각형의 면적은 " + t.area() + "이다.");

		Rectangle r = new Rectangle();
		r.setLineA(3);
		r.setLineB(5);
		System.out.println("사각형의 면적은 " + r.area() + "이다.");
	}

}
