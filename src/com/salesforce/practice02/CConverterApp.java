package com.salesforce.practice02;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1318.40);
        
        won = 1000000.0;
        dollar = 100.0;        
        //백만원을 달러로 출력 
        System.out.println("백만원은 " + CConverter.toDoller(won) + "달러입니다.");
       
        //100달러를 원으로 출력
        System.out.println("100달러는 " + CConverter.toKRW(dollar) + "원입니다.");
        
    }

}
