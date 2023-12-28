package com.salesforce.practice05;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Apple Mango Banana";
		String[] arr = s.split(" ");
		
		for(int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
	}

}
