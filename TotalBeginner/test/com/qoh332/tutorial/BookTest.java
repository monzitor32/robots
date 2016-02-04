package com.qoh332.tutorial;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testBook(){
		
			Book b1 = new Book("Great Expectations");
				
			assertEquals("Great Expectations", b1.title);
			assertEquals("unknown author", b1.author);
			assertEquals("not specified", b1.coverType);
				
			}
	
	public void testGetPerson(){
		Book b99 = new Book("The Longest Day");
		Person p9 = new Person();
		
		
		
	}
	
	
	
	}
