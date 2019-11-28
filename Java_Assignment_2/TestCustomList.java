package com.omniwyse.assignment2;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class TestCustomList {

	@Test
	public void testListInsert() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		CustomList.insert(list, 3);
		Assert.assertEquals(3, CustomList.size);
	}

	@Test
	public void testListFind() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assert.assertEquals(2, CustomList.find(list, 2));
	}

	@Test
	public void testDeleteList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		CustomList.delete(list, 2);
		Assert.assertEquals(1, CustomList.size);
	}

	@Test
	public void testDispalyList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		CustomList.displayList(list);
		Assert.assertEquals(2, CustomList.count);
	}

	@Test
	public void testSizeOfList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assert.assertEquals(2, CustomList.sizeOfList(list));
	}

	@Test
	public void testIsEmpty() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assert.assertEquals(false, CustomList.isEmpty((list)));
	}
}
