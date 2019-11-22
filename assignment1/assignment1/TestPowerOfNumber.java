package com.omniwyse.assignment1;
import org.junit.Assert;
import org.junit.Test;

public class TestPowerOfNumber {

	public class PowerOfNumber
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
}