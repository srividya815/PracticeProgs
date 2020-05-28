package com.vids.may22;

import java.util.HashMap;

public class DistanceBetweenWords {

	public static void main(String[] args) {

		String input = "geeks for geeks contribute practice";
		String word1 = "geeks";
		String word2 = "practice";
				
		HashMap<String, Integer> indexMap = new HashMap<>();
		
		String[] splitString = input.split(" ");
		int prevWord1Index = 0;
		int prevWord2Index = 0;
		for(int i=0; i<splitString.length; i++){
			
			
			indexMap.put(splitString[i], i);
		}
		
		int word1Index = indexMap.get(word1);
		int word2Index = indexMap.get(word2);
		
		
	}

}
