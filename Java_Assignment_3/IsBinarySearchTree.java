package com.omniwyse.assignment4;
class Node 
{ 
	int data; 
	Node left, right; 

	public Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

public class IsBinarySearchTree 
{ 
	Node root; 

	boolean isBST() {
		return isBSTUtil(root, Integer.MIN_VALUE, 
							Integer.MAX_VALUE); 
	} 

	
	public boolean isBSTUtil(Node node, int min, int max) 
	{ 
		
		if (node == null) 
			return true; 

		
		if (node.data < min || node.data > max) 
			return false; 

		
		return (isBSTUtil(node.left, min, node.data-1) && 
				isBSTUtil(node.right, node.data+1, max)); 
	}

		} 

	
