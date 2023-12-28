package com.salesforce.interfaceEx;

public class PhoneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone t = new Telephone();
		t.power(true);
		t.setNumber("012-444-6541");
		t.call("1-555-123445");
		
		
		Smartphone s = new Smartphone();
		s.turnOn(true);
		s.setNumber("1818-1818181-191919181");
		s.call("222-3039586876-4958585");
		s.searchInternet("www.naver.com");
	}

}
