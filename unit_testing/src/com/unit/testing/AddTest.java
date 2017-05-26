package com.unit.testing;



import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void addCalSholudReturnValue(){
		Add t=new Add();
		int result=t.add(10, 20);
		assertEquals(30,result);
		
	}
	

}
