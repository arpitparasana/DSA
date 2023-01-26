package com.dsa.structures.tree;

public class Tree {

	public Node root;
	
	public Tree() {
		root = null;
	}
	
	public void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.value + " -> ");
			preOrder(node.left);
			preOrder(node.right);
		}		
	}
	
	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.value + " -> ");
			inOrder(node.right);
		}		
	}
	
	public void postOrder(Node node) {
		if(node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.value + " -> ");			
		}
	}
}