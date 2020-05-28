package com.vids.may18;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	public static List<Integer> getPrimeFactors(int inputNum) {
		List<Integer> result = new ArrayList<>();
		// Print the number of 2s that divide n
		while (inputNum % 2 == 0) {
			result.add(2);
			inputNum /= 2;
		}

		// skip one element (Note i = i +2)
		for (int i = 3; i <= Math.sqrt(inputNum); i += 2) {
			// While i divides n, print i and divide n
			while (inputNum % i == 0) {
				result.add(i);
				inputNum /= i;
			}
		}

		// This condition is to handle the case when
		// n is a prime number greater than 2
		if (inputNum > 2)
			result.add(inputNum);
	
		return result;
	}

	public static void main(String[] args) {
		int n = 20;
		List<Integer> list = getPrimeFactors(n);
		
		list.stream().forEach(System.out :: println);
	}

}
