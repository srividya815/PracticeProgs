package com.vids.may22;

import java.util.ArrayList;

public class StringRepeat_new {

	public static void main(String[] args) {
		String input = "aabbcaann";
		
		input.replaceAll("\\s", "").toLowerCase();
		char[] inputChars = input.toCharArray(); 

		char prevChar = inputChars[0];
		int size = 1;
		ArrayList<String> result = new ArrayList<>();
		
		
		for(int i=1; i<=inputChars.length-1; i++){
			
			char currChar = inputChars[i];
			
			if(prevChar == currChar){
				size++;
				
			}else{
				//Char changed. So save the previous char and its count
				//reset size to 1;
				String res = prevChar +""+ size;
				result.add(res);
				size =1;
			}
			prevChar = currChar;
			
		}

		//Last occurance of anything ill be missed in the previous loop
		result.add(prevChar +""+ size);
		System.out.println(String.join("", result));
		
	}

}
