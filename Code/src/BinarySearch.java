
public class BinarySearch {
	
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target) {
				left = mid+1;
			}else {
				right = mid -1;
			}
		}
		return -1; // target not found
	}

	
	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
		int target = 23;
		int index = binarySearch(arr, target);
		System.out.println("Element " + target+ "found at index: " + index);
	}
}
