package com.chinmaybiswaltec;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisplayNameExample {

	@Test
	@DisplayName("Display Name Test")
	void displayNameTest() {
		System.out.println("Using DisplayName Annotation "
				+ "to name a test method ");
	}

}
