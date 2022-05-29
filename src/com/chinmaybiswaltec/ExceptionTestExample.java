package com.chinmaybiswaltec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExceptionTestExample {
	
	@Test
	@DisplayName("Test Exception Pass")
	void testException() {
		MathFunction math = new MathFunction();
		ArithmeticException ex = Assertions.assertThrows( ArithmeticException.class,
				()->{math.divide(10, 0);});
		Assertions.assertEquals("/ by zero", ex.getMessage());
	}
	
	@Test
	@DisplayName("Test Exception Fail")
	void testExceptionFail() {
		MathFunction math = new MathFunction();
		ArithmeticException ex = Assertions.assertThrows( ArithmeticException.class,
				()->{math.divide(10, 5);});
		Assertions.assertEquals("/ by zero", ex.getMessage());
	}
}
