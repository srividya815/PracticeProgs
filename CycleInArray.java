
package com.vids.may21;

import java.util.HashMap;
/*you are given an integer array of size n
every element of array is >=0
starting from arr[startindex] follow each element to the index it points to
continue to do this until u find a cycle
return length of cycle, if no cycle return -1

eg
countLengthOfCycle({1,0} , 0) == 2
countLengthOfCycle({1,2, 0} , 0) == 3
*/

public class CycleInArray {

	public static void main(String[] args) {
		//int[] input = {1,2,0};
		int[] input = {1,2,3, 4, 5, 6, 3};
		int startIndex =2;
		
		int result = countCycleLength(input, startIndex);

		System.out.println("Result-"+result);
	}
	
	
	private static int countCycleLength(int[] input, int startIndex){
		
		HashMap<Integer, Integer> countMap = new HashMap<>();
		
		int i=0;
		int cycleCount = 0;
		
		countMap.put(startIndex, cycleCount);
		
		while(i <= input.length){
			
			int nextIndex = input[startIndex];
			if(nextIndex > input.length-1) return -1;
			
			if(countMap.containsKey(nextIndex)){
				//Cycle found
				System.out.println("countMap.get(nextIndex)="+countMap.get(nextIndex)+"\t i="+i);
				return i - countMap.get(nextIndex)+1;
				
			}else {
				//No cycle yet.
				cycleCount++;
				System.out.println("Inserting -"+i +" value -"+cycleCount);
				countMap.put(nextIndex, cycleCount);
			}
		
			startIndex = nextIndex;
			
			i++;
		}
		
		return -1;
	}

}
