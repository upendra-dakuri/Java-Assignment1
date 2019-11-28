package com.omniwyse.assignment2;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class TestListReverse 
{
	@Test
	public void testListReverse() 
	{
		ArrayList<String> listInput = new ArrayList<String>();
		listInput.add("Intern");
		listInput.add("Technologies");
	    listInput.add("Omniwyse");
		
		ArrayList<String> listReverse = new ArrayList<String>();
		listReverse.add("Omniwyse");
		listReverse.add("Technologies");
		listReverse.add("Intern");
		Assert.assertEquals(listReverse, ListReverse.reverseList(listInput));
	}
}
