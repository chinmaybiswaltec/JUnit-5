package com.chinmaybiswaltec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathFunctionTest {

	
	@Test
	@DisplayName("Test Integer Subtraction")
	void testIntegerSubtraction() {
		// Arrange
		MathFunction math = new MathFunction();
		
		//Act
		int result = math.sub(20, 10);
		
		//Assert
		assertEquals(10, result);
	}
}
