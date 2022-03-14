package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	public void testTruncateAInFirstPositions1() {
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));	
	}
	public void testTruncateAInFirstPositions2() {
		assertEquals("CDEF",helper.truncateAInFirst2Positions("CDEF"));	
	}
	public void testTruncateAInFirstPositions3() {
		assertEquals("CDAA",helper.truncateAInFirst2Positions("CDAA"));	
	}
}
