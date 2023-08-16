package org.example;

public class BubbleSort {
	//bubble sort = checks pairs of elements and compares them and swaps then if ascending or descending
	public static void main(String[] args) {
		int[] array = {7,2,5,1,9,8,4,6,3};

		bubbleSort(array);

		for (int i: array) {
			System.out.println(i);
		}
	}

	private static void bubbleSort(int[] array) {
		for(int i = 0; i < array.length -1; i++){
			for(int j = 0; j < array.length - i - 1; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1] ;
					array[j+1] = temp;
				}
			}
		}
	}
}
