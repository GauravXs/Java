package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() {
		//creating object of a class
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(2, 5);
		assertEquals(7,result);
	}

}
