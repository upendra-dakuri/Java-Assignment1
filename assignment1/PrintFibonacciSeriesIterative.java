package com.omniwyse.assignment1;

public class PrintFibonacciSeriesIterative 
{
	public static int testFibonacciSeriesIterative(int n)
	{
		int sum=0 ;
		int previous=0 ; 
		int next=1;
		int count=0;
		for(int i=0;i<n;i++)
		{
			System.out.println(previous);
			count ++;
			sum=previous+next;
			previous=next;
			next=sum;
		}
		return count;
		
	}
}

