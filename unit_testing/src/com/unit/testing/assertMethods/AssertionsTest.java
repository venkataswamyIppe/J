package com.unit.testing.assertMethods;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsTest {

	@Test
	    public void test() {
	        String obj1 = "junit";
	        String obj2 = "junit";
	        String obj3 = "test";
	        String obj4 = "test";
	        String obj5 = null;
	        
	        int[] arithmetic1 = { 1, 2, 3 };
	        int[] arithmetic2 = { 1, 2, 3 };
	        assertEquals(obj1, obj2);
	        assertSame(obj3, obj4);
	        assertNotSame(obj2, obj4);
	        assertNotNull(obj1);
	        assertNull(obj5);
	        assertArrayEquals(arithmetic1, arithmetic2);
	    }
}
