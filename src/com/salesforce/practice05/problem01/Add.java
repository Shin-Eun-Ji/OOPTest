package com.salesforce.practice05.problem01;

public class Add {
    private static int num1;
    private static int num2;
	
    public Add() {
		super();
	}

	public Add(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

//	@Override
//	public String toString() {
////		return "Add [num1=" + num1 + ", num2=" + num2 + "]";
//		int result = num1 + num2;
//		return "" + result;
//	}
	
	public static void setValue(int a, int b) {
//		this.num1 = a;
//		this.num2 = b;
		num1 = a;
		num2 = b;
	}

	public static int calculate() {
		return num1 + num2;
	}
    public static void print() {
//    	System.out.println(this.toString());
    	System.out.println(">> " + calculate());
    }
}
