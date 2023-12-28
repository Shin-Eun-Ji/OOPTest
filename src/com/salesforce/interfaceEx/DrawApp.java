package com.salesforce.interfaceEx;

import com.salesforce.interfaceEx.inf.Point;

public class DrawApp {

	public static void main(String[] args) {

		Shape c = new Circle();

		System.out.println(c instanceof Circle); // 존재하는지, 두 개가 똑같은지 비교. c는 Circle의 인스턴스입니까? 물어보는 것. 맞으면 true 리턴
		System.out.println(c instanceof Rectangle);
		System.out.println(c instanceof Shape);

		Drawable d = new Point();
		
		System.out.println(d instanceof Circle); // 존재하는지, 두 개가 똑같은지 비교. c는 Circle의 인스턴스입니까? 물어보는 것. 맞으면 true 리턴
		System.out.println(d instanceof Rectangle);
		System.out.println(d instanceof Shape);
		System.out.println(d instanceof Drawable);

		// 인터페이스는 제약을 걸려고 만들고, 객체를 만드는 것은 아니다.
	}

}
