package com.salesforce.interfaceEx;

public class Telephone extends Phone {

	private boolean power;
	
	public void power(boolean on) {
		this.power = on;
	}
	
	@Override
	public void call(String number) {
		if(power) {
			System.out.print(this.getNumber() + "에서 ");		
			System.out.println(number + "로 전화를 겁니다.");			
		} else {
			System.out.print(this.getNumber() + "전원이 꺼져있습니다.");		
		}
	}

}
