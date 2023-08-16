package org.example;

import java.util.Arrays;

public class BinarySearch {
	//binary search = search algorithm to find data in a sorted array quickly.
	// eliminates half the array each search iteration
	public static void main(String[] args) {
		int[] array = new int[1_000_000];
		int target = 77777;

		for(int i = 0; i < array.length; i++){
			array[i] = i;
		}

//		int index = Arrays.binarySearch(array, target); //comes built in
		int index = binarySearch(array, target);

		if(index == -1){
			System.out.println("Target not found");
		}else{
			System.out.println("Element found at: " + index);
		}
	}

	private static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length -1;
		int steps = 0;

		while (low <= high){
			int middle = low + (high - low) / 2;
			int value = array[middle];

			System.out.println("Step: "+ steps + ", Middle: " + value);
			steps++;

			if(value < target) low = middle+1;
			else if (value > target) high = middle-1;
			else return middle; //target found

		}
		return -1;// target not found
	}
}
