package com.chinmaybiswaltec;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestingExceptionUsingJunit4 {
	
	@Rule
	public ExpectedException rule = ExpectedException.none(); 

	@Test(expected = NullPointerException.class)
	public void testException() {
		String s= null;
		s.length();
	}
	
	@Test
	public void testExpectedExceptionRule() {
		rule.expect(NumberFormatException.class);
		Integer.parseInt("abc");
	}
	
}
