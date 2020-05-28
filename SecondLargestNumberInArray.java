package com.vids.may22;

public class SecondLargestNumberInArray {

	private static int MAX_VAL = Integer.MAX_VALUE;

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 6, 2, 7, 43, 2, 56, 2, -1, 1, 5 };
		int[] highs = new int[2];

		highs[0] = arr[0];
		highs[1] = Integer.MIN_VALUE;
		int sm = find(arr, 1, highs);

		System.out.println(sm);

		System.out.println("Second largest -" + findWitoutRecursion(arr));
	}

	public static int find(int[] arr, int index, int[] highs) {
		if (index < arr.length) {
			if (arr[index] > highs[0]) {
				highs[1] = highs[0];
				highs[0] = arr[index];
			} else if (highs[1] < arr[index]) {
				highs[1] = arr[index];
			}
			find(arr, index + 1, highs);
		}
		return highs[1];
	}

	// Find 2nd smallest without recursion

	private static int findWitoutRecursion(int[] arr) {
		if (arr.length <= 1) {
			System.out.println("Invalid input");
			return -1;
		}

		//{ 2, 5, 3, 6, 2, 7, 43, 2, 56, 2, -1, 1, 5 };
		int highestNum = 0;
		int secondHighest = 0;

		if (arr[0] <= arr[1]) {
			highestNum = arr[1];//5
			secondHighest = arr[0];//2
		} else {
			highestNum = arr[0];
			secondHighest = arr[1];
		}

		if (arr.length == 2) {
			return secondHighest;
		}

		for (int i = 2; i < arr.length - 1; i++) {
			if (arr[i] > highestNum) {
				System.out.println("Setting highest num-"+highestNum);
				highestNum = arr[i];
			} else if (arr[i] < highestNum && arr[i] > secondHighest) {
				secondHighest = arr[i];
			}

		}
		return secondHighest;
	}

}
