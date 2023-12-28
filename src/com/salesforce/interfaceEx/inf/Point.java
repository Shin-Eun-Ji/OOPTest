package com.salesforce.interfaceEx.inf;

import com.salesforce.interfaceEx.Drawable;

public class Point implements Drawable {
	private int x;
	private int y;
	
	
	//기본 생성자
	public Point() {
		super();
	}

	//모든 필드 초기화 생성자
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
	public void draw(boolean isDelete) {
		if(!isDelete) {
			System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
		}
	}
	
	public void draw(int check) {
		if(check == 0) {
			System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
