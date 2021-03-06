package com.qoh332.tutorial;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3, p1.getMaximumBooks());
	}

	public void testSetName() {
		Person p2 = new Person();
		p2.setName("Mike Smith");
		assertEquals("Mike Smith", p2.getName());
		
	}

	public void testSetMaximumBooks() {
		Person p3 = new Person();
		p3.setMaximumBooks(3);
		assertEquals(3, p3.getMaximumBooks());
	}
	
	public void testToString() {
		Person p4 = new Person();
		p4.setName("John Jakes - Planet Wizard");
		p4.setMaximumBooks(14);
		String testString = "John Jakes - Planet Wizard (14 books) Book Type-Both";
		assertEquals(testString, p4.toString());
	}

}
