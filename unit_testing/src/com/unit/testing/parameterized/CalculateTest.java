package com.unit.testing.parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.unit.testing.example.CalSum;

@RunWith(Parameterized.class)
public class CalculateTest {
	private int expected;
	private int first;
	private int second;

	public CalculateTest(int expectedResult, int firstNumber, int secondNumber) {
		this.expected = expectedResult;
		this.first = firstNumber;
		this.second = secondNumber;
	}

	@Parameters
	public static Collection addedNumbers() {
		return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 },
				{ 7, 3, 4 }, { 9, 4, 5 }, });
	}

	@Test
	public void sum() {
		CalSum add = new CalSum();
		System.out.println("Addition with parameters : " + first + " and "
				+ second);
		assertEquals(expected, add.sum(first, second));
	}
}
