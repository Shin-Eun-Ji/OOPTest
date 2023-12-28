package com.salesforce.interfaceEx;

public abstract class Phone {
	//일반 멤버
	private String number;
	
	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	// 추상 멤버
	public abstract void call(String number);
}
