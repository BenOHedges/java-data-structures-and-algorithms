package org.example;

import java.util.Hashtable;

public class HashTable {
	//hash table = data structure that stores unique keys to values e.g. <Integer, String>
	// hashing takes a key and computes an integer, we use hash % capactity to calculate an index number
	// collision, during hashing if it generates the same index it uses the same index but makes it a linked list at that bucket
	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<>(21);

		table.put("100", "Spongebob");
		table.put("123", "Patrick");
		table.put("321", "Sandy");
		table.put("555", "Squidward");
		table.put("777", "Gary");

//		table.remove(777);

		for (String key : table.keySet()) {
			System.out.println(key.hashCode() % 11 + "\t"+ key +"\t" + table.get(key));
		}
	}
}
