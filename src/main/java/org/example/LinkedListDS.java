package org.example;

import java.util.LinkedList;

public class LinkedListDS {
	public static void main(String[] args) {

		/*
		* Advantages:
		* Dynamic data structure when running
		* insertion and deletion of nodes is easy
		* no/low memory waste
		*
		* Disadvantages:
		* Greater memory usage
		* no random access of elements (no index[i])
		* reading/searching is more time consuming
		*
		* Uses:
		* Implementing queues / stacks
		* GPS navigation
		* music playlist
		* */

		LinkedList<String> linkedList = new LinkedList<String>();

//		linkedList.push("A");
//		linkedList.push("B");
//		linkedList.push("C");
//		linkedList.push("D");
//		linkedList.push("F");
//		linkedList.pop();

		//LinkedLists as a queue
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
//		linkedList.poll();

		linkedList.add(4, "E");
		linkedList.remove("E");

		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		linkedList.addFirst("0");
		linkedList.addLast("G");
		String first = linkedList.removeFirst();
		String last = linkedList.removeLast();

//		System.out.println(linkedList.indexOf("F"));

		System.out.println(linkedList);
	}
}
