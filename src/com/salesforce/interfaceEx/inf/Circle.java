package com.salesforce.interfaceEx.inf;

import com.salesforce.interfaceEx.Drawable;

public class Circle extends Shape implements Drawable {

	private int radius;
	private double PI = 3.14;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
		
		return radius * radius * PI;
	}
	
	public void draw() {}

}
