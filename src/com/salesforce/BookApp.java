package com.salesforce;

public class BookApp {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.setName("삼국지");
		book1.setAuthor("이문열");

		book2.setName("토지");
		book2.setAuthor("박경리");

		book1.showInfo();
		book2.showInfo();
	}

}
