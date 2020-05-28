package com.vids.may19;

import java.util.HashMap;
import java.util.Map;

public class NumerologyQuestion {

	private static Map<Character, Integer> alphabetMap = null;

	private static int calculateNumerology(String input){
		char[] inputChars = input.toCharArray();
		int sum = 0;
		for(char ch: inputChars){
			if(alphabetMap.containsKey(ch)){
				sum = sum + alphabetMap.get(ch);
			}else {
				System.out.println("skipping character-"+ch);
			}
			
		}

		while(sum>=10){
			int temp = sum %10;
			sum = sum/10;
			sum = sum+temp;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		String input = "S. KANAPATHY";
		input = input.replaceAll("\\s", "").toUpperCase();
		prepareWeightageMap();
		System.out.println("Numerology of onput - "
				+input +" is "+ calculateNumerology(input));
		
	}
	
	private static void prepareWeightageMap(){
		alphabetMap = new HashMap<>();
		
		alphabetMap.put('A', 1);
		alphabetMap.put('I', 1);
		alphabetMap.put('J', 1);
		alphabetMap.put('Q', 1);
		alphabetMap.put('Y', 1);
		
		alphabetMap.put('B', 2);
		alphabetMap.put('K', 2);
		alphabetMap.put('R', 2);
	
		alphabetMap.put('C', 3);
		alphabetMap.put('G', 3);
		alphabetMap.put('L', 3);
		alphabetMap.put('S', 3);
	
		alphabetMap.put('D', 4);
		alphabetMap.put('M', 4);
		alphabetMap.put('T', 4);
		
		alphabetMap.put('E', 5);
		alphabetMap.put('H', 5);
		alphabetMap.put('N', 5);
		alphabetMap.put('X', 5);
		
		alphabetMap.put('U', 6);
		alphabetMap.put('V', 6);
		alphabetMap.put('W', 6);
		
		alphabetMap.put('O', 7);
		alphabetMap.put('Z', 7);
		
		alphabetMap.put('F', 8);
		alphabetMap.put('P', 8);
	}

}
