package org.example;

public class LinearSearch {
	public static void main(String[] args) {
		//goes through a collection one at a time
		int[] array = {1,5,2,12,52,1,5};

		int index = linearSearch(array, 12);

		if(index != -1){
			System.out.println("Element found at index: " + index);
		}
		else{
			System.out.println("Element not found");
		}

	}

	private static int linearSearch(int[] array, int expectedItem) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == expectedItem){
				return i;
			}
		}
		return -1;
	}
}
