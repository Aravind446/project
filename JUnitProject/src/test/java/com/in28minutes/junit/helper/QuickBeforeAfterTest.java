package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	@Test
	public void test1() {
		System.out.println("Test1 executed");
	}
	@Test
	public void test2() {
		System.out.println("Test2 executed");
	}
	@After
	public void test3() {
		System.out.println("After Test executed ");
	}
	
	

}
