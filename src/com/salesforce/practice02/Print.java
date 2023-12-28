package com.salesforce.practice02;

public class Print {
    
    public void printer(int val){
        System.out.println(val);
    }
    // 메소드 오버로딩 예제
    //메소드  작성
    public void printer(boolean val){
        System.out.println(val);
    }
    
    public void printer(double val){
        System.out.println(val);
    }

    public void printer(String val){
        System.out.println(val);
    }

}
