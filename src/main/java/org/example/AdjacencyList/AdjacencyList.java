package org.example.AdjacencyList;

public class AdjacencyList {
	//adjacency list = array or arraylist of linkedlists
	// each linkedlist has a unqiue node at the head
	// all adjacent neibores to that node are added to that nodes linkedlist
	public static void main(String[] args) {
		Graph graph = new Graph();

		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));

		graph.addEdge(0,1);
		graph.addEdge(1,2);
		graph.addEdge(1,4);
		graph.addEdge(2,3);
		graph.addEdge(2,4);
		graph.addEdge(4,0);
		graph.addEdge(4,2);

		graph.print();

	}
}
