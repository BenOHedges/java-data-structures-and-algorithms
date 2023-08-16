package org.example;

import java.util.Stack;

public class StackDS {
	public static void main(String[] args) {
		//stack is a LIFO Data Structure, last in, first out.

		/*
		* Reason to use:
		* undo/refo feature
		* moving back/ forward in browser hsitory
		* backtracking algorithms (maze, file directories)
		* calling functions
		* */

		Stack<String> stack = new Stack();

		System.out.println(stack.empty());
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack);

		stack.push("jksdfjkdsfkjsdjf");
		var error = stack.pop(); //remove the top of the stack and returns it to variable

		System.out.println(error);
		System.out.println(stack);
		System.out.println(stack.peek()); // reads the top of the stack
		System.out.println(stack.empty());

		System.out.println(stack.search("C")); //checks how far from the top of the stack (starts at 1)
		System.out.println(stack.search("B"));
		System.out.println(stack.search("A"));

		System.out.println(stack.search("doesnt exist")); //return -1
	}
}
