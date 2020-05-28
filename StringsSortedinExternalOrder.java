package com.vids.may14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsSortedinExternalOrder {

	/**
	 * Input Strings : ""Ajay"", ""Raja"", ""Keshav"", ""List"", ""Set"",
	 * ""Elephant"", ""Drone"", Sort order: TESARDLK Sorted Strings:
	 * ""Elephant"", ""Set"",""Ajay"", ""Raja"", ""Drone"",""List"",""Keshav""
	 */
	public static void main(String[] args) {
		String[] inputString = { "Ajay", "Raja", "Keshav", "List", "Set", "Elephant", "Drone" };
		String sortOrder = "TESARDLK";

		String[] sortOrderChars = sortOrder.split("");
		ArrayList<String> inputList = new ArrayList(Arrays.asList(inputString));
		ArrayList<String> sortedList = new ArrayList<>(inputList.size());

		for(String ch: sortOrderChars){
			System.out.println("Searchng ch--"+ch);
			List<String> subList = inputList.stream().filter(c -> c.startsWith(ch))
							.collect(Collectors.toList());
			System.out.println(subList.size());
			
			sortedList.addAll(subList);
		}
		
		System.out.println("sortedList size="+sortedList.size());
		for (String s : sortedList) {
			System.out.println(s);
		}
	}

}
