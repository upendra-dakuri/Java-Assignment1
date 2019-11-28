package com.omniwyse.assignment4;

import org.junit.Assert;
import org.junit.Test;

public class TestIsBinaryOrNot {

	@Test
	public void testIsBinaryTree() 
	{
		IsBinarySearchTree tree = new IsBinarySearchTree();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		Assert.assertEquals(true, tree.isBSTUtil(tree.root, 1, 5));
	}

}
