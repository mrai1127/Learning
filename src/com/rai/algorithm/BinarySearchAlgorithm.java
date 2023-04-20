package com.rai.algorithm;

public class BinarySearchAlgorithm {
	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 12, 16, 23,38,56, 72, 91};
		int key = 38;
		int index = binarySearch(arr, key);
		if(index == -1) {
			System.out.println("Element not found in the array");
		}else {
			System.out.println("Element found at index " + index);
		}
	}
	
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high =  arr.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid] < key) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
