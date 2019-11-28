package com.omniwyse.assignment4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInfixToPstfix {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInfix() 
	{
		String infix = "A+B*(C^D-E)";
		String postfix = "ABCD^E-*+";
		Assert.assertEquals(postfix, ConvertInfixToPostfix.infixToPostFix(infix));
		
	}

}
