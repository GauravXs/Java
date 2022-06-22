package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatTest {

	@Test
	public void concattest() {
		MyJunitClass junit = new MyJunitClass();
		String result = junit.concat("hello", "markus");
		assertEquals("hellomarkus",result);
	}

}
