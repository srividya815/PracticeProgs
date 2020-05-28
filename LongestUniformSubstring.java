package com.vids.may15;

public class LongestUniformSubstring {
	
	public static void main (String[] args){
		//String input = "abcc";
		String input = "110001100";
		//String input = "caaakkkkkkkbbkkkkk";
		char[] inputChars = input.toCharArray();
		
		if(input == null || input.length()==0){
			System.out.println("Input is Empty");
		}
		
		input = input.toLowerCase();
		
		int size=1;
		int maxSize=0;
		int finalIndex=0;
		
		char prevChar = inputChars[0];
		
		for(int i=1; i<inputChars.length; i++){
			char currChar = inputChars[i];
			
/*			if(currChar <=97 || currChar>=122){
				System.out.println("Invalid input");
				break;
			}
*/			if(currChar == prevChar) {
				size++;
			} 
			else {
				//If diff char, check for size and ressign
				if(maxSize < size){
					
					maxSize = size;
					finalIndex = i-size;
				}
				size =1;
			}
			//before moving to next loop reassign the prev char
			prevChar =  currChar;
		}

		if(maxSize<size)
        {
            maxSize=size;
            finalIndex=inputChars.length-size;
        }
		//Result
		System.out.println("Max size-"+maxSize);
		System.out.println("Starting index-"+finalIndex);
	}

}
