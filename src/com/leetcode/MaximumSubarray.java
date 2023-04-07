package com.leetcode;

public class MaximumSubarray {
	
	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		MaximumSubarray mxn = new MaximumSubarray();
		int maxSum = mxn.maxSubArray(nums);
		System.out.println("Maximum subarray sum: " + maxSum);
	}

	public int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(currentSum + nums[i], nums[i]);
			maxSum = Math.max(maxSum, currentSum);

		}
		return maxSum;

	}

}
