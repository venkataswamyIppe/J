package com.unit.testing.suite;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageTestJunitOne {
	String message = "Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   @Test
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");    
	      assertEquals(message, messageUtil.printMessage());     
	   }

}
