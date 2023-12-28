package com.salesforce;

public class GoodsApp2 {

	public static void main(String[] args) {

		Goods goods = new Goods("LG그램", 900000);
		Goods goods2 = new Goods("머그컵", 2000);
		
//		goods.setName();
//		goods.setPrice();
//		
//		goods2.setName();
//		goods2.setPrice();
		
//		System.out.println(goods.getName() + ", " + goods.getPrice());
//		System.out.println(goods2.getName() + ", " + goods2.getPrice());
		
		goods.showInfo();
		goods2.showInfo();
	}

}
