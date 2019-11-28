package com.omniwyse.assignment4;

class CustomBinarySeachTree {
	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	CustomBinarySeachTree() {
		root = null;
	}

	// Insertion to Binary Search Tree
	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);
		return root;
	}

	static boolean identicalTrees(Node a, Node b) {
		if (a == null && b == null)
			return true;
		if (a != null && b != null)
			return (a.key == b.key && identicalTrees(a.left, b.left) && identicalTrees(a.right, b.right));
		return false;
	}

	void printPostorder(Node node) {
		if (node == null)
			return;
		printPostorder(node.left);

		printPostorder(node.right);

		System.out.print(node.key + " ");
	}

	void printInorder(Node node) {
		if (node == null)
			return;

		printInorder(node.left);
		System.out.print(node.key + " ");
		printInorder(node.right);
	}

	Node printPreorder(Node node) {
		if (node == null)
			return node;
		System.out.print(node.key + " ");
		printPreorder(node.left);
		return printPreorder(node.right);
	}

	void printPostorder() {
		printPostorder(root);
	}

	void printInorder() {
		printInorder(root);
	}

	void printPreorder() {
		printPreorder(root);
	}

	public static Node search(Node root, int key) {
		if (root == null || root.key == key)
			return root;
		if (root.key > key)
			return search(root.left, key);
		return search(root.right, key);
	}

	int maxDepth(Node node) {
		if (node == null)
			return 0;
		else {
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}

	int getLeafCount() {
		return getLeafCount(root);
	}

	int getLeafCount(Node node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		else
			return getLeafCount(node.left) + getLeafCount(node.right);
	}

	void deleteKey(int key) {
		root = deleteRec(root, key);
	}

	Node deleteRec(Node root, int key) {
		if (root == null)
			return root;
		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);

		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			root.key = minValue(root.right);

			root.right = deleteRec(root.right, root.key);
		}

		return root;
	}

	int minValue(Node root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

	}
