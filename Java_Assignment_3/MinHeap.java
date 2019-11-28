package com.omniwyse.assignment4;

 
public class MinHeap {
	private static int[] Heap;
	private int size;
	private int maxsize;

	private static final int FRONT = 1;

	public MinHeap(int maxsize) {
		this.maxsize = maxsize;
		this.size = 0;
		Heap = new int[this.maxsize + 1];
		Heap[0] = Integer.MIN_VALUE;
	}

	
	private int parent(int pos) {
		return pos / 2;
	}

	
	private int leftChild(int pos) {
		return (2 * pos);
	}

	
	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	
	private boolean isLeaf(int pos) {
		if (pos >= (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}

	
	private void swap(int fpos, int spos) {
		int tmp;
		tmp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = tmp;
	}

	
	private void minHeapify(int pos) {

		
		if (!isLeaf(pos)) {
			if (Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {

				
				if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
					swap(pos, leftChild(pos));
					minHeapify(leftChild(pos));
				}

				
				else {
					swap(pos, rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	}
	
	
     int deleteRoot(int n) 
    { 
        
        int lastElement = Heap[n - 1]; 
  
        
        Heap[0] = lastElement; 
  
        
        n = n - 1; 
  
        
        minHeapify(n); 
  
       
        return n; 
    } 

	
	public void insert(int element) {
		if (size >= maxsize) {
			return;
		}
		Heap[++size] = element;
		int current = size;

		while (Heap[current] < Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	
	public void print() {
		for (int i = 1; i <= size / 2; i++) {
			System.out.print(
					" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i] + " RIGHT CHILD :" + Heap[2 * i + 1]);
			System.out.println();
		}
	}

	
	public void minHeap() {
		for (int pos = (size / 2); pos >= 1; pos--) {
			minHeapify(pos);
		}
	}

	public boolean searchElement(int element) {
		
		for (int i = 0; i < Heap.length; i++) {
			if (Heap[i] == element) {
				return true;
			}
		}
		return false;

	}

	
	public int remove() {
		int popped = Heap[FRONT];
		Heap[FRONT] = Heap[size--];
		minHeapify(FRONT);
		return popped;
	}

}
