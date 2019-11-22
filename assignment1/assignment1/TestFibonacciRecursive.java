package com.omniwyse.assignment1;
import org.junit.Assert;
import org.junit.Test;
/**
 * This is used to get the Fibonacci series by using recursive method.
 * Time Complexity : O(2^n)
 * Space Complexity : O(N)
 * @author Upendra
 *
 */

public class TestFibonacciRecursive {

	@Test
	public void test() 
	{
		Assert.assertEquals(21,PrintFibonacciRecursive.testFibonacciSeriesRecursive(8));
	}
 
}
