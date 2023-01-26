package com.dsa.main.test;

import com.dsa.structures.seq.StackOfChar;
import com.dsa.structures.seq.StackOfInt;

public class StackTest {

	public static void main(String[] args) {
		System.out.println("creating stack of size 5...");
		StackOfInt intStack = new StackOfInt(5);
		intStack.push(10);
		intStack.push(15);
		intStack.push(40);
		intStack.push(34);
		intStack.push(78);
		
		
		System.out.println("Popping: " + intStack.pop());
		System.out.println("Popping: " + intStack.pop());
		System.out.println("Popping: " + intStack.pop());
		System.out.println("Popping: " + intStack.pop());
		System.out.println("Popping: " + intStack.pop());
		
		
		System.out.println("creating stack of size 5...");
		StackOfChar charStack = new StackOfChar(5);
		charStack.push('J');
		charStack.push('O');
		charStack.push('H');
		charStack.push('N');
		charStack.push('D');
		
		System.out.println(charStack.display());
		
		System.out.println("Popping: " + charStack.pop());
		System.out.println("Popping: " + charStack.pop());

		System.out.println(charStack.display());

		System.out.println("Popping: " + charStack.pop());
		System.out.println("Popping: " + charStack.pop());
		System.out.println("Popping: " + charStack.pop());
		
		System.out.println(charStack.display());

		
		
	}
}
