package com.vids.may13;

public class LongestContinuousSubArray {

	private static void calculateSubArray(int[] inputArray, int inputSum){
	       
	        int result =0;
	        int start = 0;
	       
	        int calculateSum = inputArray[0];
	        
	        if(calculateSum == inputSum)
	            result++;
	       //{8, 12,7,29,6, 2, 11,4,8}
	        for(int i=1; i<inputArray.length; i++){
	            calculateSum = calculateSum+inputArray[i]; //20
	            while(calculateSum >inputSum && start <= i-1 ){
	            	
	                calculateSum = calculateSum -inputArray[start]; //12
	                //System.out.println("In for loop-"+i +"---- start-"+start + "\t calculate sum="+calculateSum);
	                start++; //1
	               // System.out.println("calculateSum="+calculateSum);
	            }
	            if(calculateSum == inputSum){
	                result++;
	            }
	        }
	       
	        System.out.println("Result="+result);
	    }
	   
	public static void main (String[] args) throws java.lang.Exception
	{
	
	        int[] input = {8, 12,7,29,6, 2, 11,4,8};
	        int sum=8;
	       
	        calculateSubArray(input, sum);
	       
	}
}

