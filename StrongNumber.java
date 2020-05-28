package com.vids.may21;

public class StrongNumber {

	public static void main(String[] args) {
		//int input = 200;
		int input = 145;
		
		int temp = input;
		int sum =0;
		
		while(temp !=0){
			int remainder = temp % 10;
			sum = sum+ calculateFactorial(remainder);
			temp = temp/10;
		}
		
		if(sum == input){
			System.out.println(input +" is a strong number");
		}else{
			System.out.println(input +" is not a strong number");
		}
	}

	private static int calculateFactorial(int input){
		int fact = 1;
		for(int i=1; i<=input; i++){
			fact = fact * i;
		}
		return fact;
	}
}
