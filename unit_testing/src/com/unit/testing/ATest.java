package com.unit.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class ATest {

	@Test
	public void sumResultOfBandCTest() {
		A a=new A();
		int result=a.sumResultOfBandC(4, 5);
		assertEquals(23,result);
	}

}
