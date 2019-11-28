package com.omniwyse.assignment4;

import java.util.ArrayList;
import java.util.Stack;

class SetOfStacks {
	ArrayList<Stack> sets = new ArrayList<Stack>();
	int counter = 0, capacity = 4;
	Stack<Integer> stack;

	void push(int i) {
		if (counter == capacity || counter == 0) {
			counter = 0;
			stack = new Stack<Integer>();
			sets.add(stack);
		}
		stack.push(i);
		counter++;
	}
	

	ArrayList<Stack> printStack(){
		return sets;
		
	}
	int pop() {
		if (counter == 1) {
			counter = capacity;
		} else
			counter--;
		return (Integer) sets.get(sets.size() - 1).pop();
	}
}
