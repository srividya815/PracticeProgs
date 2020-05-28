package com.vids.may22;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstringOfLengthN {

	public static Set<String> distinctSubstring(String str, int length) {

		// Put all distinct substring in a HashSet
		Set<String> result = new HashSet<String>();

		// List All Substrings
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				if (j - i == length) {
					//length check of substring. If all substring, no need if condition
					// Add each substring in Set
					result.add(str.substring(i, j));
				}
			}
		}

		// Return the HashSet
		return result;
	}


	public static void main(String[] args) {
		String str = "aabc";
		int length = 2;
		Set<String> subs = distinctSubstring(str, length);

		System.out.println("Distinct Substrings are: ");
		for (String s : subs) {
			System.out.println(s);
		}
	}

}
