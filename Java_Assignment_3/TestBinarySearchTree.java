package com.omniwyse.assignment4;

import org.junit.Assert;
import org.junit.Test;

public class TestBinarySearchTree {

	@Test
	public void testInsertion() {
		CustomBinarySeachTree tree = new CustomBinarySeachTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		CustomBinarySeachTree treeExpected = new CustomBinarySeachTree();
		treeExpected.root = treeExpected.new Node(50);
		treeExpected.root.left = treeExpected.new Node(30);
		treeExpected.root.right = treeExpected.new Node(70);
		treeExpected.root.left.left = treeExpected.new Node(20);
		treeExpected.root.right.left = treeExpected.new Node(60);
		treeExpected.root.right.right = treeExpected.new Node(80);

		Assert.assertEquals(true, CustomBinarySeachTree.identicalTrees(treeExpected.root, tree.root));

	}

	@Test
	public void testDeletion() {
		CustomBinarySeachTree tree = new CustomBinarySeachTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.deleteKey(80);

		CustomBinarySeachTree treeExpected = new CustomBinarySeachTree();
		treeExpected.root = treeExpected.new Node(50);
		treeExpected.root.left = treeExpected.new Node(30);
		treeExpected.root.right = treeExpected.new Node(70);
		treeExpected.root.left.left = treeExpected.new Node(20);
		treeExpected.root.right.left = treeExpected.new Node(60);

		Assert.assertEquals(true, CustomBinarySeachTree.identicalTrees(treeExpected.root, tree.root));

	}

	@Test
	public void testSearch() {
		CustomBinarySeachTree tree = new CustomBinarySeachTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		Assert.assertEquals(null, CustomBinarySeachTree.search(tree.root, 100));
		Assert.assertEquals(80, CustomBinarySeachTree.search(tree.root, 80).key);

	}

	@Test
	public void testLeavesCount() {
		CustomBinarySeachTree tree = new CustomBinarySeachTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		Assert.assertEquals(3, tree.getLeafCount());
	}

	@Test
	public void testHeightOfBST() {
		CustomBinarySeachTree tree = new CustomBinarySeachTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		Assert.assertEquals(3, tree.maxDepth(tree.root));
	}
}