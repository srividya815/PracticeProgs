package com.vids.may19;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveStringDuplicate {

	private static void printWithoutDuplicates(String input){
		String[] parts = input.split(" ");
		
		HashSet<String> uniqueStrings = new HashSet<>();
		ArrayList<String> resultList = new ArrayList<>();
		for(String str : parts){
			if(!uniqueStrings.contains(str)){
				resultList.add(str);
				uniqueStrings.add(str);
			}
		}
		System.out.println(String.join(" ", resultList));
		
	}

	
	public static void main(String[] args) {
		//String input = "Good day day bye bye";
		String input = "greet the day user greet good day the";
		printWithoutDuplicates(input);
	}

}
