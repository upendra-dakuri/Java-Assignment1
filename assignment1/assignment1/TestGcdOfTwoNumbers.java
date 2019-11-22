package com.omniwyse.assignment1;
import org.junit.Assert;
import org.junit.Test;

/**
 * This is used to get the GCD of two numbers.
 * Time Complexity: O(min(number1, number2))
 * @author Upendra
 *
 */

public class TestGcdOfTwoNumbers
{

	@Test
	public void checkGcd() 
	{
		Assert.assertEquals(11, FindGcd.getGcd(55, 121));
	}
	
	@Test
	public void checkNotGcd()
	{
		Assert.assertNotEquals(6, FindGcd.getGcd(20, 25));
	}

}
