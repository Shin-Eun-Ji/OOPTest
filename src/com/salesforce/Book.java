package com.salesforce;

public class Book {
	private String name;
	private String author;
	
//	public String getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getAuthor() {
//		return author;
//	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
//	public void showInfo() {
//		System.out.println("책[ "+ this.getName() + ":" + this.getAuthor()+" ]");
//	}
	public void showInfo() {
		System.out.println("책[ "+ this.author + ":" + this.name +" ]");
	}
	
}
