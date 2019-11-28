package com.omniwyse.assignment2;
/**
 * Time Complexity of Queue Structure is O(1)
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCustomQueue 
{

	private CustomQueue queue;
	@Before
	public void setUp() {
		queue = new CustomQueue(100);
	}

	@Test
	public void testEnqueue() 
	{
		queue.enqueue(8);
		queue.enqueue(10);
		Assert.assertEquals(2, queue.size());
	}
	@Test
	public void testDequeue()
	{
		queue.enqueue(8);
		queue.enqueue(10);
		queue.dequeue();
		queue.dequeue();
		Assert.assertEquals(0, queue.size());
	}
	@Test
	public void isEmptyTest() {
		Assert.assertEquals(true, queue.isEmpty());
}
	@Test
	public void testSize() {
		queue.enqueue(1);
		queue.enqueue(2);
		Assert.assertEquals(2, queue.size());
	}
}
