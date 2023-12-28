package com.salesforce.practice06;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee pt = new Depart( "홍길동", 5000, "개발부" );
        Depart pt2 = new Depart( "홍길동", 10000);
        pt.getInformation();
        
        pt2.getInformation();
        
    }

}