package com.salesforce.exception.practice;

import com.salesforce.Point;

public class PointApp {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		
		System.out.println(a.hashCode());
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.toString());
		System.out.println(a);
		
	}

}
