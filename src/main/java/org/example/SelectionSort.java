package org.example;

public class SelectionSort {
	//selection sort = search through an array and keep track of the minimum value during each iteration and swap variables.
	public static void main(String[] args) {
		int array[] = {1,5,2,21,6,4,3,9,8,10};

		selectionSort(array);

		for (int i : array) {
			System.out.println(i);
		}
	}

	private static void selectionSort(int[] array) {
		for(int i = 0; i < array.length -1; i++){
			int min = i;
			for(int j = i+1; j < array.length; j++){
				if(array[min] > array[j]){
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
}
