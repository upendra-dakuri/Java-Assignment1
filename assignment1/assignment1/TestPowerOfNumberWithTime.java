package com.omniwyse.assignment1;
import org.junit.Assert;
import org.junit.Test;
/**
 * This is used to get the power of given number.
 * Time Complexity: O(n)
 * @author Upendra
 *
 */

public class TestPowerOfNumberWithTime
{

	@Test
	public void calculatePower() 
	{
		Assert.assertEquals(16, CalucatePowerUsingRecursion.numberPower(2, 4));
	}
	
	@Test
	public void calculateWrongPower()
	{
		Assert.assertNotEquals(16, CalucatePowerUsingRecursion.numberPower(2, 6));
	}

}
