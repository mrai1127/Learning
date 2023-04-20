package com.miscellaneoue;

public class AlgortihmExample {
	
	//Binary search algorithm
	public static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length -1;
		while(left <= right) {
			int mid = (left + right)/2;
			if(arr[mid] == key) {
				return mid;
			}else if (arr[mid] < key) {
				left = mid + 1;
			}else {
				right = mid -1;
			}
		}
		return - 1;
	}
	
	//Bubble sort algorithm
	public static void bubbleSort(int[] arr) {
		boolean swapped = true;
		int n = arr.length;
		while(swapped) {
			swapped = false;
			for(int i =1; i< n; i++) {
				if(arr[i-1] > arr[i]) {
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
					swapped = true;
				}
			}
			n--;
		}
	}
	
	//merge sort algorthim
	public static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	private static void merge(int[] arr, int left, int mid, int right) {
		int[] temp = new int [right - left + 1];
		int i = left;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <= right) {
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		while(j <= right) {
			temp[k++] = arr[j++];
		}
		for(i = left; i <= right; i++) {
			arr[i] = temp[i -left];
		}
	}
	
	//Quick sort algorithm
	public static void quickSort(int[] arr, int left, int right) {
		if(left < right) {
			int pivot = partition(arr, left, right);
			quickSort(arr, left, pivot - 1);
			quickSort(arr, pivot + 1, right);
		}
	}
	
	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left -1;
		for(int j = left; j < right; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = temp;
		return i+1;
	}
	
	//Fibonacci sequence algorithm
	public static int fibonacci(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacci(n-1)+ fibonacci(n-2);
	}
	
	
	//factorial algorithm
	public static int factorial(int n)
	{
		if(n == 0) {
			return 1;
		}
	}
}
