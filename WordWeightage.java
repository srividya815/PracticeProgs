package com.vids.may21;

public class WordWeightage {

	public static void main(String[] args) {
		String input = "apple";

		// remove space and convert to lowercase
		input = input.replaceAll("\\s", "").toLowerCase();
		char[] inputCharArray = input.toCharArray();
		
		int sum = 0;
		for(char ch : inputCharArray){
			if(ch >=97 && ch <=122){
				int temp = ch - 97 +1;
				System.out.println("ch-"+ch +" val-"+temp);
				sum +=temp;
				
			}
			else{
				System.out.println("Skipping char-"+ch);
			}
		}
		System.out.println("Sum-"+sum);
	}

}
