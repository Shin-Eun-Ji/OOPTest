package com.salesforce.generic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSample {
	public static void main(String[] args) {
//		ArrayList<String> colors = new ArrayList<>(); // 타입 생략 가능
//	   // add() method
//        colors.add("Black");
//        colors.add("White");
//        colors.add(0, "Green");
//        colors.add("Red");
//
//        // set() method
//        colors.set(0, "Blue");
//
//        System.out.println(colors);
//        
//        // 엘리먼트 삭제
//        colors.remove("Blue");
//        System.out.println(colors);
//        
//        
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
        String removedColor = colors.remove(0);
        System.out.println("Removed color is " + removedColor);

        colors.remove("White");
        System.out.println(colors);

        colors.clear();  // 내용 전체 삭제
        System.out.println(colors);
        
	}
}
