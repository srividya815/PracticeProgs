package com.vids.may19;

public class SnowFillProblem {

	public static void main(String[] args) {
		int[] input = new int[]{0,1,3,0, 1,2,0,4,2,0,3,0};

		
		int prevHigh = input[0];
		int prevHighIndex = 0;
		int nextVal = 0;
		int[] fills = new int[input.length];
		int nextHigh = 0;
		
		for(int i=1; i<=input.length-1; i++) {
			int currVal = input[i];
			nextVal = input[i+1];	
			
			if(prevHigh <= currVal && nextVal>=currVal){
				//No need to fill
				prevHigh = currVal;
				continue;
				
			}else if(prevHigh > currVal && nextHigh >currVal){
				//value to fill is min of prev[index] - curr
				
				int left = prevHigh - currVal;
				int right = nextVal - currVal;
						
				if(left >= 0 && right >=0){
					if(left>right)
						fills[i] = right;//add right
					else
						fills[i] = left;//add left
				}
			}
		}
		
	}

}
