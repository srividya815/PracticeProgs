package com.vids.may13;

public class StairsProblem {

	// Java program to count number of ways to reach n't stair when
	// a person can climb 1, 2, ..m stairs at a time

	// A recursive function used by countWays
	static int countWaysUtil(int totalSteps, int stepsAtATime) {
		int res[] = new int[totalSteps];
		res[0] = 1;
		res[1] = 1;
		for (int i = 2; i < totalSteps; i++) {
			res[i] = 0;
			for (int j = 1; j <= stepsAtATime && j <= i; j++)
				res[i] += res[i - j];
		}
		return res[totalSteps - 1];
	}

	// Returns number of ways to reach s'th stair
	static int countWays(int s, int m) {
		return countWaysUtil(s + 1, m);
	}

	// Driver method
	public static void main(String[] args) {
		int totalSteps = 4, stepsAtATime = 2;
		System.out.println("Number of ways = " + countWays(totalSteps, stepsAtATime));
	}

}
