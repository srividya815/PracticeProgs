package com.vids.may18;

public class Panagram {

	private static boolean isPanagram(String input) {
		boolean result = true;
		char[] characters = input.toCharArray();
		boolean[] alphabetCheck = new boolean[26];
		for (char ch : characters) {
			// ASCII Char between a to z
			if (ch >= 97 && ch <= 122) {
				int index = 122 - ch;
				//System.out.println("Encountered char-" + ch);
				alphabetCheck[index] = true;
			} else { // Not a alphabet between
				result = false;
				System.out.println("Incorrect input");
				break;
			}

		}

		
		for (boolean val : alphabetCheck) {
			if (!val) {
				result = false;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog123";
		str = str.replaceAll("\\s", "").toLowerCase();

		System.out.println("Input -" + str);

		System.out.println("Is string anagram-" + isPanagram(str));

	}

}
