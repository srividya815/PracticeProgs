package com.vids.may21;

public class SecondSmallestNumberInArrayRecursive {

	private static int MAX_VAL = Integer.MAX_VALUE;

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 6, 2, 7, 43, 2, 56, 2, -1, 1, 5 };
		int[] smalls = new int[2];

		smalls[0] = arr[0];
		smalls[1] = Integer.MAX_VALUE;
		int sm = find(arr, 1, smalls);

		System.out.println(sm);

		System.out.println("Second smallest -" + findWitoutRecursion(arr));
	}

	public static int find(int[] arr, int index, int[] smalls) {
		if (index < arr.length) {
			if (arr[index] < smalls[0]) {
				smalls[1] = smalls[0];
				smalls[0] = arr[index];
			} else if (smalls[1] > arr[index]) {
				smalls[1] = arr[index];
			}
			find(arr, index + 1, smalls);
		}
		return smalls[1];
	}

	// Find 2nd smallest without recursion

	private static int findWitoutRecursion(int[] arr) {
		if (arr.length <= 1) {
			System.out.println("Invalid input");
			return -1;
		}

		int smallestNum = arr[0];
		int secondSmallest = arr[1];

		if (arr[0] >= arr[1]) {
			smallestNum = arr[1];
			secondSmallest = arr[0];
		} else {
			smallestNum = arr[0];
			secondSmallest = arr[1];
		}

		if (arr.length == 2) {
			return secondSmallest;
		}

		for (int i = 2; i < arr.length - 1; i++) {
			if (arr[i] < smallestNum) {
				smallestNum = arr[i];
			} else if (arr[i] > smallestNum && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}

		}

		return secondSmallest;
	}

}
