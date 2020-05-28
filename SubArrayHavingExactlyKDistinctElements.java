package com.vids.may22;

import java.util.ArrayList;
import java.util.HashSet;

public class SubArrayHavingExactlyKDistinctElements {
	/*Given an array arr[] of size N and an integer K.
	 *  The task is to find the count of subarrays such that each 
	 *  subarray has exactly K distinct elements.
	Input: arr[] = {2, 1, 2, 1, 6}, K = 2
			Output: 7
			{2, 1}, {1, 2}, {2, 1}, {1, 6}, {2, 1, 2},
			{1, 2, 1} and {2, 1, 2, 1} are the only valid subarr
	*/
	
	//private static int[][] = new int[][];
	public static void main(String[] args) {
		
		//int[] input = {2, 1, 2, 1, 6};
		//int k=2;
		int[] input = {1, 2, 3, 4, 5};
		int k=1;

		int count= subArrayWithKDistinctEle(input, k);
		
		System.out.println("Count-"+count);
	}
	
	private static int subArrayWithKDistinctEle(int[] input, int k){
		
	int count =0;
	
		for(int i=0; i<input.length; i++){
			ArrayList<Integer> tempList = new ArrayList<>();
			tempList.add(input[i]);
			if(k>1){
				for(int j=i+1; j<input.length; j++){
					int currEle = input[j];
					boolean check = checkDistinctElements(tempList, currEle, k);
						if(check) count++;
						else break;
				}
			}
			else{
				System.out.print(input[i]+",");
				count++;
			}
		}
		System.out.println();
		
		return count;
	}
	
	private static boolean checkDistinctElements(ArrayList<Integer> tempList, 
			int currEle, int k){
		System.out.println("Templist size is -"+tempList.size()+"\t curr ele -"+currEle);
		HashSet<Integer> tempSet = new HashSet<>();
		tempSet.addAll(tempList);
		tempSet.add(currEle);
		System.out.println("tempSet size-"+tempSet.size());
		if(tempSet.size() > k){
			System.out.println("in if");
			return false;
		}else {
			tempList.add(currEle);
			//print the subarray
			for(int i: tempList){
				System.out.print(i+",");
			}
			System.out.println("");
			
			return true;
		}
		
	}

}
