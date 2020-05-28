package com.vids.may12;

public class Stairs {

	public static void main(String args[]) {
		int numOfStairs = 4;

		int numWays = fib(numOfStairs + 1);

		System.out.println("Total number of ways = " + numWays);
	}

	private static int fib(int numOfStairs) {
		if (numOfStairs <= 1) {
			return numOfStairs;
		}
		return fib(numOfStairs - 1) + fib(numOfStairs - 2);
	}

}