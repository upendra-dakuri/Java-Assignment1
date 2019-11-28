package com.omniwyse.assignment4;

import org.junit.Test;

public class TestMinHeap {

	
	@Test
	public void test() 
	{
		System.out.println("The Min Heap is ");
		MinHeap minHeap = new MinHeap(15);
		minHeap.insert(5);
		minHeap.insert(3);
		minHeap.insert(17);
		minHeap.insert(10);
		minHeap.insert(84);
		minHeap.insert(19);
		minHeap.insert(6);
		minHeap.insert(22);
		minHeap.insert(9);

		minHeap.minHeap();
		minHeap.print();

		int elementToSearch = 84;
		boolean isElementFound = minHeap.searchElement(elementToSearch);
		System.out.println("Search element " + elementToSearch + " found " + isElementFound);
		System.out.println("Deleted " +minHeap.deleteRoot(10));
		
	}

}
