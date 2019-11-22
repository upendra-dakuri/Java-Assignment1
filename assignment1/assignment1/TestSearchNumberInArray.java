package com.omniwyse.assignment1;
import org.junit.Assert;
import org.junit.Test;
/**
 * This test is used to find the number in array of n numbers.
 * Time Complexity: O(n)
 * @author Upendra
 *
 */

public class TestSearchNumberInArray 
{

	@Test
	public void findNumber() 
	{
		Assert.assertEquals(true, FindNumberInArray.numberIsInArray(40));
	}
	
	@Test
	public void notFindNumber() 
	{
		Assert.assertEquals(false, FindNumberInArray.numberIsInArray(32));
	}

}
