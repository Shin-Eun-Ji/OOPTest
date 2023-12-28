package com.salesforce.practice05.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	while(true) {
        	System.out.print(">> ");
        	
        	String input = sc.nextLine();
        	String[] strArr = input.split(" ");
    		
        	int num1 = 0, num2 = 0;
        	if(!"/q".equals(strArr[0])) {
        		num1 = Integer.parseInt(strArr[0]);
        		num2 = Integer.parseInt(strArr[2]);
        		
        		switch(strArr[1]) {
            	case "+":
//        			Add add = new Add(num1, num2);
//        			add.setValue(num1, num2);
            		Add.setValue(num1, num2);
            		Add.print();
            		continue;
            	case "-":
            		Sub sub = new Sub(num1, num2);
            		sub.setValue(num1, num2);
            		sub.print();
            		continue;
            	case "*":
            		Mul mul = new Mul(num1, num2);
            		mul.setValue(num1, num2);
            		mul.print();
            		continue;
            	case "/":
            		Div div = new Div(num1, num2);
            		div.setValue(num1, num2);
            		div.print();
            		continue;
        		default:
        			System.out.println("알 수 없는 연산입니다.");
        			continue;
            	}
        	} else {
        		System.out.println("종료합니다.");
        		sc.close();
        		break;
        	}
    	}
    }
}
