package com.salesforce;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(String color) {
		this.color = color;
		System.out.println("ColorPoint 기본 생성자 출력됨.");
	}

	public ColorPoint() {
	}

	
	public ColorPoint(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public ColorPoint(int x, int y, String color) {
		// TODO Auto-generated constructor stub
//		this(color);
		this(x, y);
//		this.setColor(color);
		this.color = color;
//		this.setX(x);
//		this.setY(y);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {

		//		return "ColorPoint [color=" + color + "]";
		return "ColorPoint [color=" + color + ", x=" + this.getX() + ", y=" + this.getY() + "]";
	}
	
	public void showInfo( ) {
		System.out.println(this.toString());
	}
}
