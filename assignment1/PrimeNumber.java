package com.omniwyse.assignment1;
//Time Complexity: O(n)
/**
 * This class is to check the given number is prime number or not
 * @author Upendra
 * 
 */
public class PrimeNumber 
{
	public static boolean isPrimeNumber(int number)
	{
		for(int i=2;i<=number/2;i++)
		{
			if(number % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
