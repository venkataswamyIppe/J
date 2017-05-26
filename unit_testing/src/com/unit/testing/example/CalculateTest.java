package com.unit.testing.example;

import org.junit.Test;

public class CalculateTest {
	CalSum calculation = new CalSum();
	int sum = calculation.sum(2, 5);
	int testSum = 7;

	@Test
	public void testSum() {
		System.out.println("@Test sum(): " + sum + " = " + testSum);
	}
}
