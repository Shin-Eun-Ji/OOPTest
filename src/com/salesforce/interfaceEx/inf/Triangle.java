package com.salesforce.interfaceEx.inf;

public class Triangle extends Shape {

	private int lineA;
	private int lineB;
		
	public void setLineA(int lineA) {
		this.lineA = lineA;
	}

	public void setLineB(int lineB) {
		this.lineB = lineB;
	}

	@Override
	public double area() {
		
		return lineA * lineB / 2.0;
	}

}
