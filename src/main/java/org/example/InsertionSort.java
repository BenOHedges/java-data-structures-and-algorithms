package org.example;

public class InsertionSort {
	//insertion sort = compares elemetns to the left and shifts to the right and insert a value
	public static void main(String[] args) {
		int array[] = {9,1,8,2,7,3,6,5,4};

		insertionSort(array);

		for (int i : array) {
			System.out.println(i);
		}

	}

	private static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i -1;

			while(j>=0 && array[j] > temp){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
		}
	}
}
