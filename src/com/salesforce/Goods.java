package com.salesforce;

public class Goods {
	
	private String name;
	private int price;
	
	
	
	public Goods() {
		super();
//		this(); // 자기자신을 호출하는 게 되므로 기본 생성자 안에서는 불가.
	}

	public Goods(String name, int price) {
		this();
		this.name = name;
		this.price = price;
	}
	
	public Goods(int price, String name) {
		this(name, price); // 위에 있는 생성자 Goods(String name, int price){...} 를 호출한다.
	}
	

	//getter, setter는 멤버변수의 이름을 기준으로 만들어짐.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품 이름: " + this.getName() + "\n상품 가격: " + this.getPrice());
	}

	
}
