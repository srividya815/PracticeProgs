package com.vids.may15;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {

		List<Integer> primeList = new ArrayList<>();
		int input = 10;
		// first check if input is prime
		if (checkPrime(input)) {
			System.out.println(input + " is a prime number");
			return;
		} else {
			for (int i = 2; i <= input; i++) {
				if (checkPrime(i)) {
					primeList.add(i);
				}
			}

			for (Integer i : primeList) {
				System.out.print(" " + i);
			}
		}

	}

	private static boolean checkPrime(int currNum) {
		boolean isPrime = true;
		for (int i = 2; i <= currNum / 2; i++) {
			if (currNum % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}


	private static void  printNumberDivisible(int input){
		
	}
	
}
