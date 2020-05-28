package com.vids.may21;

public class ReverseStringPreservingOrder {

	public static void main(String[] args) {
		//String input = "abcd";
		String input = "I am a java developer";
		String[] words = input.split(" ");
		//Single word as input so reverse chars
/*		if(words.length==1){
			char[] chars = input.toCharArray();
			for(int i=chars.length-1; i>=0; i--){
				System.out.print(chars[i]);
			}
		}
		else{
			for(int i=words.length-1; i>=0; i--){
				System.out.print(words[i]+" ");
			}
		}*/

		char[] inputChars = input.toCharArray();
		
		char[] result = new char[inputChars.length];
		
		for(int i =0; i<inputChars.length; i++){
			//Add space in the result arry , similar to input array
			if(inputChars[i] == ' '){
				result[i] = ' ';
			}
		}
		
		int size = inputChars.length-1;
		for(int i=0; i< inputChars.length; i++){
			
			if(inputChars[i] != ' '){
				if(result[size] == ' '){
					size --;
				}
				
				result[size] = inputChars[i];
				size--;
			}
			
			
		}
		System.out.println(String.valueOf(result));
	}

}
