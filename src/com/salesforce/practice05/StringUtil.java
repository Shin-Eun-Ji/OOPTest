package com.salesforce.practice05;

public class StringUtil {
    
    public static String concatString(String[] arr){
       
        //메소드 내용작성
//    	String result = "";
//    	for(int i = 0; i < arr.length; i++) {
//    		result += arr[i];               // (1) + 를 이용하기
//    		result = result.concat(arr[i]); // (2) concat 을 이용하기
//    	}
//    	return result;
        
    	// (3) StringBuffer, append 를 이용하기
    	StringBuffer result = new StringBuffer();
    	
    	for(int i = 0; i < arr.length; i++) {
    		result = result.append(arr[i]); 
    	}
    	return result.toString();
    }

}
