package com.salesforce.practice05;
import java.util.Scanner;

public class FriendApp {
    public static void main(String[] args) {
        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("친구를 3명 등록해 주세요");
        
        for(int i = 0; i < 3; i++) {
            // 친구정보 입력받기
            String input = sc.nextLine();
            // 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
            String[] frInfo = input.split(" ");
            // Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
        	Friend friend = new Friend(frInfo[0], frInfo[1], frInfo[2]); //정우성
        	// 배열에 추가하기 ( friendArray <- friend 객체 )    	
        	friendArray[i] = friend;        	
        }
        
//        // 친구정보 입력받기
//        String input1 = sc.nextLine();
//    	// 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
//    	String[] frInfo1 = input1.split(" ");
//    	
//        String input2 = sc.nextLine();
//    	String[] frInfo2 = input2.split(" ");
//        
//        String input3 = sc.nextLine();
//    	String[] frInfo3 = input3.split(" ");
//        	        	
//        // Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
//    	Friend friend1 = new Friend(frInfo1[0], frInfo1[1], frInfo1[2]); //정우성
//    	Friend friend2 = new Friend(frInfo2[0], frInfo2[1], frInfo2[2]); //이효리
//    	Friend friend3 = new Friend(frInfo3[0], frInfo3[1], frInfo3[2]); //이정재
//    	
//    	// 배열에 추가하기 ( friendArray <- friend객체 )    	
//    	friendArray[0] = friend1;
//    	friendArray[1] = friend2;
//    	friendArray[2] = friend3;
    	
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }
        
        sc.close();
    }
}
