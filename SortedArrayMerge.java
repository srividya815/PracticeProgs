package com.vids.may14;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortedArrayMerge {

/*	Given two sorted arrays, the task is to merge them in a sorted manner .
	Example:1
	Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
	Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

	Example 2:
	Input: arr1[] = { 3,7,9,12,21}, arr2[] = {6,8,15,18,27}
	Output: arr3[] = {3,6,7,8,9,12,15,18,21,27}

	Time complexity: O(n1+n2) where n1 and n2 are size of each array*/
	
	
	private static int[] mergedArray(int[] inputArray1, int[] inputArray2){
		System.out.println("");
		IntStream inputStream1 = Arrays.stream(inputArray1);
		IntStream inputStream2 = Arrays.stream(inputArray2);
		
		IntStream resultStream = IntStream.concat(inputStream1, inputStream2);
		return resultStream.sorted().toArray();
	}
	
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 5}; 
		int[] arr2 = {2, 4, 6, 8};

		int[] arr3 = { 3,7,9,12,21}; 
		int[] arr4 = {6,8,15,18,27};
		int[] result = mergedArray(arr1, arr2);

		for(int i: result){
			System.out.print(i + " , ");
		}

		result = mergedArray(arr3, arr4);
		
		for(int i: result){
			System.out.print(i + " , ");
		}

	}
}
