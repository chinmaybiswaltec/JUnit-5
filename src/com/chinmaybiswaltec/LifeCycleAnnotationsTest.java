package com.chinmaybiswaltec;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LifeCycleAnnotationsTest {
	
	MathFunction math;
	
	@BeforeAll
	public static void setUpAll() {
		System.out.println("Setting up required resources once per class");
	}
	
	@BeforeEach
	public void setUp() {
		math = new MathFunction();
		System.out.println("Setting up before each method");
	}
	
	@Test
	@DisplayName("Test Sum")
	public void testSum() {
		int result = math.sum(10, 20);
		Assertions.assertEquals(30, result);
	}
	
	@Test
	@DisplayName("Test Sub")
	public void testSub() {
		int result = math.sub(10, 20);
		Assertions.assertEquals(-10, result);
	}
	
	@AfterEach
	public void cleanup() {
		System.out.println("Cleaning up after each method");
	}
	
	@AfterAll
	public static void cleanupAll() {
		System.out.println("Cleaning up required resources once per class");
	}

}
