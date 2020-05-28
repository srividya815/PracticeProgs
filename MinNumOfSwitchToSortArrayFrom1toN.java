package com.vids.may22;

public class MinNumOfSwitchToSortArrayFrom1toN {

	public static void main(String[] args) {

		int[] input = { 2, 3, 4, 1, 5 };
		System.out.println("INPUT");
		for (int i : input) {
			System.out.println(i + ", ");
		}

		System.out.println("Num of swaps=" + minSwaps(input));
	}

	private static int minSwaps(int[] input) {
		int swaps = 0;
		int counter = 0;
		// n=5
		int lenght = input.length - 1; // 4

		while (counter < input.length) {
			
			System.out.println("Counter-" + counter);
			
			if (input[counter] != counter + 1) {
			
				while (input[counter] != counter + 1) {
					
					int temp = input[input[counter] - 1];
					input[input[counter] - 1] = input[counter];
					input[counter] = temp;
					swaps++;
				}
			}

			counter++;
		}

		System.out.println("OUTPUT");
		for (int i : input) {
			System.out.println(i + ", ");
		}

		return swaps;
	}

}
