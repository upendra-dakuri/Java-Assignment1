package com.omniwyse.assignment1;
import org.junit.Assert;
import org.junit.Test;
/**
 * Time Complexity : 2^n-1
 * This test is used to check the Tower of Hanoi  disk moves.
 * @author Upendra
 *
 */

public class TestTowerOfHanoi {

	@Test
	public void test() 
	{
		Assert.assertEquals(1,TowerOfHanoi.towerOfHanoiPuzzle(3, 'A', 'c', 'B'));
	}

}
