package com.vids.may19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringWithStartingAlphabet {

	public static void main(String[] args) {
		String[] input = new String[]{"apple","sample", "search","cat"};
		List<String> resultList = null;
		for(String str : input){
			resultList = Arrays.stream(input).filter(s -> s.startsWith("s"))
				.collect(Collectors.toList());
		}
		
		resultList.forEach(System.out::println);
		
	}

}
