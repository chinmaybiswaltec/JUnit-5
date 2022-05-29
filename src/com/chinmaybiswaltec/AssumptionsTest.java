package com.chinmaybiswaltec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
	
	@Test
	@DisplayName("Assumptions Test")
	void testAssumptions() {
		System.out.println(System.getProperty("os.name"));
		Assumptions.assumeTrue(System.getProperty("os.name").equals("Windows 10"), 
				()-> "This test case is for Windows OS");
		MathFunction math = new MathFunction();
		int result = math.sum(10, 20);
		Assertions.assertEquals(30, result);	
	}
	
	@Test
	@DisplayName("AssumpingThat Test")
	void testAssumingThat() {
		MathFunction math = new MathFunction();
		int result = math.sum(10, 20);
		Assumptions.assumingThat(()-> System.getProperty("os.name").equals("Windows 10"), 
				()-> Assertions.assertEquals(30, result));
	}

}
