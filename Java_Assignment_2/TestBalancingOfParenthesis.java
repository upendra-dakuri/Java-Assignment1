package com.omniwyse.assignment2;

import org.junit.Assert;
import org.junit.Test;

public class TestBalancingOfParenthesis {

	@Test
	public void test() 
	{
		char balancedParenthesis[] = {'{','(',')','}'};
		Assert.assertEquals(true, BalancingOfParenthesis.isParenthesisBalanced(balancedParenthesis));
		char inBalancedParenthesis[] = {'{','}',')','}'};
		Assert.assertEquals(false, BalancingOfParenthesis.isParenthesisBalanced(inBalancedParenthesis));
		
	}

}
