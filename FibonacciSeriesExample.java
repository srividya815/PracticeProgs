package com.vids.may12;

public class FibonacciSeriesExample {

	public static void main(String[] args) {

		printFibonacci(10);
		//printFibonacciLessthan(100);
	}

	private static void printFibonacci(int n) {

		int first = 0;
		int second = 1;

		// System.out.println(first +", "+second+", ");
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			System.out.print(first + ", ");

			sum = first + second;

			first = second;
			second = sum;

		}

	}

	//while loop
	private static void printFibonacciLessthan(int n) {

		int first = 0;
		int second = 1;
		

		// System.out.println(first +", "+second+", ");
		int sum = 0;

		while(first<=n){
			
			System.out.println(first+", ");
			
			sum= first+second;
			first=second;
			second=sum;
		}
	}

}
