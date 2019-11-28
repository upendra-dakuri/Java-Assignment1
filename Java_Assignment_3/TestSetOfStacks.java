package com.omniwyse.assignment4;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSetOfStacks {
	@Test
	public void testInsert() 
	{
		SetOfStacks setStack=new SetOfStacks();
		setStack.push(1);
		setStack.push(2);
		setStack.push(3);
		setStack.push(4);
		setStack.push(5);
		
		ArrayList<Stack> stackExpected = new ArrayList<Stack>();
		
		Stack<Integer> stackPush1=new Stack<Integer>();
		stackPush1.push(1);
		stackPush1.push(2);
		stackPush1.push(3);
		stackPush1.push(4);
		stackExpected.add(stackPush1);
		//After MAX capacity create new stack
		Stack<Integer> stackPush2=new Stack<Integer>();
		stackPush2.push(5);
		stackExpected.add(stackPush2);
		
		Assert.assertEquals(stackExpected, setStack.printStack());
	
	}
	@Test
	public void testPop() 
	{
		SetOfStacks setStack=new SetOfStacks();
		setStack.push(1);
		setStack.push(2);
		setStack.push(3);
		setStack.push(4);
		setStack.push(5);
		
		Assert.assertEquals(5, setStack.pop());
	
	}
}
