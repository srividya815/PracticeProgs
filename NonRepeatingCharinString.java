package com.vids.may19;

public class NonRepeatingCharinString {

	public static void main(String[] args) {
		String input = "aaaaaaaaaaaaaabcc";
		input = input.replaceAll("\\s",  "").toLowerCase();
		char[] inputChars = input.toCharArray();

		char prevChar = inputChars[0];
		for(int i=1; i<inputChars.length; i++){
			
			if(prevChar==inputChars[i]){
				prevChar = inputChars[i];
				continue;
			}else{
				System.out.println("First non repeating char is -"
						+inputChars[i] +" is at index-"+i);
				break;
				
			}
		}
				
	}

}
