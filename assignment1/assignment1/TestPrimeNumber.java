package com.omniwyse.assignment1;
import org.junit.Assert;
import org.junit.Test;
/**
 * This test is used to test the given number is prime number or not.
 * Time Complexity: O(n)
 * @author Upendra
 *
 */

public class TestPrimeNumber 
{

	@Test
	public void primeNumberCheck() 
	{
		Assert.assertEquals(true, PrimeNumber.isPrimeNumber(2));
	}
	
	@Test
	public void testNotPrimeNumber()
	{
		Assert.assertEquals(false, PrimeNumber.isPrimeNumber(9));
	}
	
}
