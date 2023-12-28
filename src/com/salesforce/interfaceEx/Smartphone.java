package com.salesforce.interfaceEx;

public class Smartphone extends Phone {

	private boolean power;
	
	public void turnOn(boolean on) {
		this.power = on;
	}
	
	@Override
	public void call(String number) {
		if(power) {
			System.out.print(this.getNumber() + "에서 ");		
			System.out.println(number + "로 전화를 겁니다.");			
		} else {
			System.out.print("전원이 꺼져있습니다.");		
		}
	}
	
	public void searchInternet(String url) {
		if(power) {
			System.out.print("브라우저에서 " + url + "로 검색합니다.");		
		} else {
			System.out.print("전원이 꺼져있습니다.");		
		}
	}

}
