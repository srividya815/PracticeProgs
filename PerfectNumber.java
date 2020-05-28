package com.vids.may21;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

	public static void main(String[] args) {
		int number = 1000;
		List<Integer> reslut = new ArrayList<>();
		for(int i=1; i<=100; i++){
			
			if(isPerfectNumber(i)){
				reslut.add(i);
			}
		}
		
		reslut.stream().forEach(System.out::println);;
	}
	
	private static boolean isPerfectNumber(int input){
		int sum = 0;
		int temp = input;
		
		for(int i=1; i<input-1; i++){
			if(temp%i ==0){
				sum = sum+i;
				//System.out.println("in if- i="+i+"\t sum="+sum);
			}
		}
		
		if(sum == input){
			return true;
		}else {
			return false;
		}
		
	}
}
