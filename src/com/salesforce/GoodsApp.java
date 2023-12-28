package com.salesforce;

public class GoodsApp {

	public static void main(String[] args) {
		// Goods 객체를 하나 생성하고 이 객체에 대한 레퍼런스 변수를 camera로 합니다.
		Goods camera = new Goods("nikon",400000);
		
		// 이 객체의 데이터인 각각의 인스턴스 변수는 다음과 같은 값을 가지도록 합니다.
		// 상품이름: "nikon", 가격: 400,000
//		camera.setName();
//		camera.setPrice();
		
		//객체 데이터 출력
//		System.out.println(camera.name);
//		System.out.println(camera.price);
		camera.showInfo();
	}

}
