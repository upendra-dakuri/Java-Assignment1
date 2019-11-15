package com.omniwyse.assignment1;

public class CalucatePowerUsingRecursion 
{
	public static int numberPower(int number , int power)
	{
		if(power==0)
		{
			return 1;
		}
		return number*numberPower(number, power-1);
	}

}