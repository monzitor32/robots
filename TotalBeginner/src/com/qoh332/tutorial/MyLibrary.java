package com.qoh332.tutorial;

import java.util.ArrayList;

public class MyLibrary {
	
	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;
	
	public MyLibrary(String name) {
		
		this.name = name;
		books = new ArrayList<Book>();
		people = new ArrayList<Person>();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}

	public void addBook(Book b1) {
		this.books.add(b1);
	}
	
	public void removeBook(Book b1) {
		this.books.remove(b1);
	}
	
	public void addPerson(Person p1) {
		this.people.add(p1);
	}
	
	public void removePerson(Person p1) {
		this.people.remove(p1);
	}
	
}
