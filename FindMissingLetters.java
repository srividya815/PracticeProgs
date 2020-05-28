package com.vids.may21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*The sentence "The quick brown fox jumps over the lazy dog" contains every single letter in the alphabet. 
Such sentences are called pangrams. Write a function called "findMissingLetters"  which takes a String `sentence`,  
and returns all the letters it is missing. Which prevent it from being a pangram. You should ignore the case of the 
letters in sentence, and your return should be all lower case letters, in alphabetical order.
You should also ignore all non US-ASCII characters.*/

public class FindMissingLetters {

	public static void main(String[] args) {
		String input ="The quick brown fox jumps over the lay dog";
		List<Character> result = finsMissingLetters(input);
		
		if(result.size()>0){
			result.stream().forEach(System.out::println);
		}else{
			System.out.println(input+"- is a panagram");
		}
	}

	private static List<Character> finsMissingLetters(String input){
		String allAlphabets = "abcdefghijklmnopqrstuvwxyz";
		char[] allAlphabetChars = allAlphabets.toCharArray();
		input.replaceAll("\\s", "").toLowerCase();
		List<Character> result = new ArrayList<Character>();
		HashSet<Character> alphabetSet = new HashSet<>();
		
		char[] inputChars = input.toCharArray();
		for(char ch : inputChars){
			if(ch>=97 && ch<=122){
				alphabetSet.add(ch);
			}
		}
		
		for(char ch: allAlphabetChars){
			if(!alphabetSet.contains(ch))
				result.add(ch);
		}
		return result;
	}
}
