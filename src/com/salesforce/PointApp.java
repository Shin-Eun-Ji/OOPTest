package com.salesforce;

public class PointApp {

	public static void main(String[] args) {
//		Point point1 = new Point();
//		Point point2 = new Point();
//		
//		point1.setX(5);
//		point1.setY(5);
//		
//		point2.setX(10);
//		point2.setY(23);
//		
//		point1.draw();
//		point2.draw();
//		Point p1 = new Point(5,5);
//		p1.draw();
//		p1.draw(false);
//		
//		Point p2 = new Point(10,23);
//		p2.draw();
//		p2.draw(0);
		
		Point p = new Point(4,4);
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10,10,"blue");

		System.out.println("1");
		System.out.println(p);
		System.out.println("2");
		System.out.println(cp1);
		System.out.println("3");
		System.out.println(cp2);
		
		
	}
	
}
