package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest2 {

	StringHelper helper = new StringHelper();
	@Test
	public void testareFirstAndLast2CharactersAresame_Basic() {
		assertEquals("CD",helper.areFirstAndLastTwoCharactersTheSame("AACD"));
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
