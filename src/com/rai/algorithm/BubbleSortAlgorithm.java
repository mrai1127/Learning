package com.rai.algorithm;

import java.util.Arrays;

public class BubbleSortAlgorithm {
	public static void main(String[] args) {
		int[] arr = {5, 1, 9, 2, 10, 6};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n - i -1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
