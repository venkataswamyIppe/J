package com.unit.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringAddTest {

	@Test
	public void test() {
		Add a=new Add();
		String concat=a.addStrings("Hello", "World");
		assertEquals("HelloWorld",concat);
	}

}
