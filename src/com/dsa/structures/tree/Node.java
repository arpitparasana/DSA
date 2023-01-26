package com.dsa.structures.tree;

public class Node {
	int value;
	Node left, right;
	
	public Node(int v) {
		this.value = v;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	
}