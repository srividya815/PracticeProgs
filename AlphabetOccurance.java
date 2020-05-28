package com.vids.may12;

import java.util.HashMap;
import java.util.Map;

public class AlphabetOccurance {

	public static void main(String[] args) {
		String str= "aabccd     ";
		if(str != null || str.length()>0)
			printAlphabetCount(str);
	}

	private static void printAlphabetCount(String input){
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		input = input.toLowerCase();

		char[] inputArray = input.toCharArray();
		Map<Character, Long> countMap = new HashMap<>();
		
		for(char ch: inputArray){
			long count = input.chars().filter(c -> c==ch).count();
			countMap.put(ch, count);
		}
		

		// Iterate all alphabets and print count
		char[] allAlphabets = alphabets.toCharArray();
		
		for(Character c : allAlphabets){
			if(countMap.get(c)!=null){
				System.out.print(c+"="+countMap.get(c)+", ");	
			}
		}

	}
	
}
