package com.salesforce.practice05.problem01;

public class Div {
    private int num1;
    private int num2;
	
    public Div() {
		super();
	}

	public Div(int num1, int num2) {
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
//		int result = 0;
//		if(num2 != 0) {
//			result = num1 / num2;			
//		} else {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
//		return "" + result;
//	}

	public void setValue(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}

	public int calculate() {
		int result = 0;
		if(num2 != 0) {
			result = num1 / num2;			
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return result;
	}
	
    public void print() {
//    	System.out.println(this.toString());
    	System.out.println(this.calculate());
    }

}
