package com.vids.may20;

public class CheckIfPOwerOfn {

	public static void main(String[] args) {

		int inputNumberToCheck = 50;
		int powerOf = 5;
		boolean result = false;
		if(powerOf == 1){
			if(inputNumberToCheck==1)
				result=true;
		}
		else{
			result = check(inputNumberToCheck, powerOf);
		}
		System.out.println(result);
		
	}

	private static boolean check(int inputNumberToCheck, int powerOf) {

		while (inputNumberToCheck >= powerOf) {
			if (inputNumberToCheck % powerOf == 0) {
				inputNumberToCheck = inputNumberToCheck / powerOf;
			}
			else {
				break;
			}
		}

		if (inputNumberToCheck == 1) {
			return true;
		} else{
			return false;
		}

	}

}
