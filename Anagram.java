package com.vids.may14;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	private static boolean isAnagram(String input1, String input2) {

		// Remove any space and convert to lowercase
		input1 = input1.replaceAll("\\s", "").toLowerCase();
		input2 = input2.replaceAll("\\s", "").toLowerCase();

		char[] input1Array = input1.toCharArray();
		char[] input2Array = input2.toCharArray();
	//	System.out.println(input1Array.length);
	//	System.out.println(input2Array.length);
		
		if(input1Array.length != input2Array.length){
			System.out.println(input1 +" and " + input2 +" are not anagrams");
			return false;
		}

		//Create a Map with all chars
		Map<Character, Long> countMap = new HashMap<>();
		
		for(char ch: input1Array){
			long count = input1.chars().filter(c -> c==ch).count();
//			System.out.println("Adding to map-"+ch +" with count "+count);
			//int num = ch;
			countMap.put(ch, count);
		}

		
		for(char ch: input2Array){
			//System.out.println("check-"+ch);
			long count = input2.chars().filter(c -> c==ch).count();
			long check = countMap.get(ch);
			if(count != check){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
//		System.out.println(isAnagram("STOP123", "TOPS"));
//		System.out.println(isAnagram("DORMITORY", "DIRTY ROOM"));
		
		System.out.println(isAnagram("*v$idya", "v$ idy*a"));
		System.out.println(isAnagram("1234abc", "abc1234"));
		
	}

}
