package org.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuesDS {
	public static void main(String[] args) {
		//priority queue = FIFO data structure, first in first out.
		// serves elements with a highest priority first before lower priority elements

		//Queue's are Interfaces
//		Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
		Queue<String> queue = new PriorityQueue<>(); //ascending, workings with strings and numbers

		queue.offer("B");
		queue.offer("C");
		queue.offer("A");
		queue.offer("F");
		queue.offer("D");

		while (!queue.isEmpty()){
			System.out.println(queue.poll());
		}





	}
}
