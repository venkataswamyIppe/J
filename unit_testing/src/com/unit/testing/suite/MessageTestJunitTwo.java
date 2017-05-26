package com.unit.testing.suite;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageTestJunitTwo {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}

}
