package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesDS {
	public static void main(String[] args) {
		//queue = FIFO data structure, first in first out.
		//linear data structure

		/*
		* Useful:
		* Keyboard buffer (letters shoudl appear on screen in the order they are pressed)
		* Printer queue, (print jobs to be done in order)
		* Used in linkedLists, PriorityQueues, Breath-first search
		*/

		//Queue's are Interfaces
		Queue<String> queue = new LinkedList<>();

		System.out.println(queue.isEmpty());

		queue.offer("Karen"); //adds an item in
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");

		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.contains("Harold"));

		System.out.println(queue.peek());

		queue.poll(); // removes the first item in order
		queue.poll();

		System.out.println(queue);



	}
}
