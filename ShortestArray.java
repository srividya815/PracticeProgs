package com.vids.may12;

public class ShortestArray {

	public static void main(String[] args) {
		int[][] input = { { 1, 2, 3, 4 }, { 0, 2, 7 }, { 4, 12 }, { 1, 2, 5, 6 } };

	
		if(input!=null || input.length!=0){
			printShortestArray(input);
		}
	
	}
	
	

	
	private static void printShortestArray(int[][] input){
		int index =0; 	
		int length =Integer.MAX_VALUE; 
		for(int i=0; i<input.length; i++){
			int[] innerArray = input[i];
			//System.out.println("inner array length-"+innerArray.length);
			if(length > innerArray.length){
			//	System.out.println("inside if- "+i);
				index = i;
				length = innerArray.length;
			}
		}

		int[] shortestArray = input[index];
		
		System.out.println(shortestArray.length + " at index "+index);
	}
}
