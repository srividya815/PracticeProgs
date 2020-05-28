package com.vids.may19;

public class CombinationToReachANumber {
	static void findCombinationsUtil(int arr[], int index, 
			int num, int reducedNum) {
		// Base condition
		if (reducedNum < 0){
			return;
		}
			

		// If combination is
		// found, print it
		if (reducedNum == 0) {
			for (int i = 0; i < index; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
			return;
		}

		// Find the previous number
		// stored in arr[]. It helps
		// in maintaining increasing
		// order
		int prev = (index == 0) ? 1 : arr[index - 1];

		// note loop starts from
		// previous number i.e. at
		// array location index - 1
		for (int k = prev; k <= num; k++) {
			// next element of
			// array is k
			arr[index] = k;

			// call recursively with
			// reduced number
			findCombinationsUtil(arr, index + 1, num, reducedNum - k);
		}
	}

	// Driver code
	public static void main(String[] args) {
		int n = 5;
		//findCombinations(n);
		int arr[] = new int[n];
		findCombinationsUtil(arr, 0, n, n);
	}
}
