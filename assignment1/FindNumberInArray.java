package com.omniwyse.assignment1;

public class FindNumberInArray 
{
	public static boolean numberIsInArray(int number)
	{
		int[] array= {10,20,30,40,50};
		for(int i=0;i<5;i++)
		{
			if(array[i]==number)
			{
				return true;
			}
		}
		return false;
		}
	}
