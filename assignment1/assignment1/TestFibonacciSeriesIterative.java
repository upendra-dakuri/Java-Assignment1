package com.omniwyse.assignment1;
import org.junit.Assert;
import org.junit.Test;
/**
 * This is used to get the Fibonacci series by using iterative method.
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * @author Upendra
 *
 */

public class TestFibonacciSeriesIterative 
{

	@Test
	public void fibonacciSeries() 
	{
		Assert.assertEquals(20,PrintFibonacciSeriesIterative.testFibonacciSeriesIterative(20));
	}
	
	@Test
	public void notFibonacciSeries()
	{
		Assert.assertNotEquals(6, PrintFibonacciSeriesIterative.testFibonacciSeriesIterative(5));
	}
}
