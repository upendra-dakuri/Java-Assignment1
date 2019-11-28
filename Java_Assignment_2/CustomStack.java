package com.omniwyse.assignment2;
/**
 * This Class implemented Stack DataStructure methods
 * @author Upendra
 *
 */
public class CustomStack {

	public int index = -1;
	int[] items;

	CustomStack(int size) {
		items = new int[size];
	}

	void push(int x) {
		if (index == 99) {
			System.out.println("Stack is full...");
		} else {
			items[++index] = x;
		}
	}

	int pop() {
		if (index == -1) {
			System.out.println("Underflow stack");
			return '\0';
		} else {
			int element = items[index];
			index--;
			return element;
		}
	}

	boolean isEmpty() {
		if (index == -1) {
			return true;
		} else {
			return false;
		}
	}

	int size() {
		return index + 1;
	}
}
