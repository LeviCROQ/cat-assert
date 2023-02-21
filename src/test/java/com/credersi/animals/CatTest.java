package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void testFeedCat() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.feeds();
		assertEquals(cat.howHungry(), 30);
	}
	
	@Test
	public void testFeedCatTwo() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 10);
	}
	
	@Test
	public void testFeedCatThree() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
	}
	
	@Test
	public void testFeedCatFour() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.feeds();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
	}
	
	@Test
	public void testCatRun() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.runs();
		assertEquals(cat.howHungry(), 80);
	}
	
	@Test
	public void testStarveCat() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.runs();
		cat.runs();
		assertEquals(cat.isAlive(), false);
	}
	
	@Test
	public void testStarveCatTwo() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.feeds();		
		cat.runs();
		cat.runs();
		cat.runs();
		assertEquals(cat.isAlive(), false);
	}
	
	@Test
	public void testAlmostStarvingCat() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.feeds();		
		cat.runs();
		cat.runs();
		cat.feeds();
		cat.feeds();		
		cat.runs();
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void testAlmostStarvingCatTwo() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.runs();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		cat.runs();
		cat.runs();
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void testOverfeedCat() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
	}
	
	@Test
	public void testOverfeedCatTwo() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.feeds();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
	}
}