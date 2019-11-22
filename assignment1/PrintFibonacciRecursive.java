package com.omniwyse.assignment1;

	
public class PrintFibonacciRecursive 
{
	public static int testFibonacciSeriesRecursive(int n)
	{
		
		if(n==0)
		{
			return 0;
		}
		if(n==1 || n==2)
		{
			return 1;
		}
		else
		{
		return testFibonacciSeriesRecursive(n-2)+testFibonacciSeriesRecursive(n-1);
		}
	}

}
