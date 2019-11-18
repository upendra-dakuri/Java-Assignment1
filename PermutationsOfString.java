package com.omniwyse.assignment1;

public class PermutationsOfString 
{   
	static int count=0;
	public static int stringPermutation(String permutation, String input)
	{	
		if(input.length() == 0)
		{
			System.out.println("Permutation is "+permutation);
			count++;
		}
		else
		{
			for (int i = 0; i < input.length(); i++)
			{	
				stringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
			}
		}
		return count;
	}
}