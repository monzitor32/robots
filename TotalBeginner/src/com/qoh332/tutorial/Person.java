package com.qoh332.tutorial;

public class Person {

	//fields
	private String name;
	private int maximumBooks;
	private String bookType;
	
	public Person() {
		 // class constructor
		
		 name = "unknown name";
		 maximumBooks = 3;
		 bookType = "Both";
		 
	}
	
	
	//methods here  from MAc Mini Thursday
	
	
	
	
	
	public String getName(){
		return name;
	}
	
	public String getBookType() {
		return bookType;
	}


	public void setBookType(String bookType) {
		this.bookType = bookType;
	}


	public void setName(String anyname) {
		this.name = anyname;
		
	}


	public int getMaximumBooks() {
		return maximumBooks;
	}


	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String toString() {
		return this.getName() + " (" + this.getMaximumBooks() + " books)" + " Book Type-" + getBookType();
		
	}
	
	
}
