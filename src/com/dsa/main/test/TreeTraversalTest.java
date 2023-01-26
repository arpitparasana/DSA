package com.dsa.main.test;

import com.dsa.structures.tree.Node;
import com.dsa.structures.tree.Tree;

public class TreeTraversalTest {

	public static void main(String[] args) {
		
		Tree t = new Tree();
		Node n5 = new Node(5);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n2 = new Node(2);
		Node n1 = new Node(1);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		
		t.root = n5;
		
		n5.setLeft(n3);
		n5.setRight(n4);
		
		n3.setLeft(n2);
		n3.setRight(n1);
		
		n4.setLeft(n6);
		n4.setRight(n7);

	
		t.preOrder(t.root);
		System.out.println();
	
		t.inOrder(t.root);
		System.out.println();
		
		t.postOrder(t.root);
		System.out.println();

	}
}
