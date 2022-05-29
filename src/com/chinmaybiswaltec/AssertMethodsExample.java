package com.chinmaybiswaltec;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertMethodsExample {
	
	@Test
	@DisplayName("Test assertEquals")
	void testAssertEquals() {
		MathFunction math = new MathFunction();
		int result = math.sum(10, 20);
		assertEquals(30, result);
	}
	
	@Test
	@DisplayName("Test assertNotEquals")
	void testAssertNotEquals() {
		MathFunction math = new MathFunction();
		int result = math.sum(10, 20);
		assertNotEquals(10, result);
	}
	
	@Test
	@DisplayName("Test assertTrue")
	void testAssertTrue() {
		MathFunction math = new MathFunction();
		int result = math.sum(10, 20);
		assertTrue(30 == result);
	}
	
	@Test
	@DisplayName("Test assertFalse")
	void testAssertFalse() {
		MathFunction math = new MathFunction();
		int result = math.sum(10, 20);
		assertFalse(10 == result);
	}
	
	@Test
	@DisplayName("Test assertNull and assertNotNull")
	void testAssertNullAndAssertNotNull() {
		MathFunction math = null;
		assertNull(math);
		math = new MathFunction();
		assertNotNull(math);
	}
	
	@Test
	@DisplayName("Test assertSame and assertNotSame")
	void testAssertSameAndAssertNotSame() {
		String s1 = "Test";
		String s2 = "Test";
		assertSame(s1, s2);
		String s3 = new String("Test");
		String s4 = new String("Test");
		assertNotSame(s3, s4);
	}
	
	@Test
	@DisplayName("Test assertArrayEquals")
	void testAssertArrayEquals() {
		String s1Arr[] = {"A","B","C"};
		String s2Arr[] = {"A","B","C"};
		assertArrayEquals(s1Arr, s2Arr);
	}
	
	

}
