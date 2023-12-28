package com.salesforce;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyMath.plus(5, 10)); // 정적 메소드(=스태틱 메소드)
		
		MyMath mm = new MyMath();
		System.out.println(mm.plus(5, 10));
		
		
		System.out.println(MyMath.plus(1.0, 4.0));
		
		System.out.println(MyMath.CircleArea(5));
		System.out.println(mm.CircleArea(5));
		
	}

}
