package com.salesforce.practice07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
    	if("앱".equals(str)) {
    		startApp();
    	} else {
    		super.execute(str);
    	}
        
    }

	//메소드작성
    private void startApp() {
		System.out.println("스마트폰에서 앱 실행");
	}
 
    //메소드작성
    // 리스코프 치환 원칙...
    protected void playMusic() {
    	System.out.println("다운로드해서 음악 재생");
	}    
}
