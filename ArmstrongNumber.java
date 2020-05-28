package com.vids.may19;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 10000;

		for (int i = 1; i <= input; i++) {
			if (checkArmstrongNum(i)) {
				System.out.print(i + ", ");
			}
		}

	}

	// 153
	private static boolean checkArmstrongNum(int i) {
		int digits = getNumberOfDigits(i);
		// System.out.println("Num of digits"+digits);
		int temp = i;
		int sum = 0;
		while (temp != 0) {
			int units = temp % 10;
			sum = sum + calculateExponentialValue(units, digits);
			temp = temp / 10;
		}

		if (i == sum)
			return true;
		else
			return false;
	}

	private static int getNumberOfDigits(int i) {
		int digits = 0;
		while (i != 0) {
			digits++;
			i = i / 10;
		}
		return digits;
	}

	private static int calculateExponentialValue(int i, int exponent) {
		int result = 1;
		for (int j = 1; j <= exponent; j++) {
			result = result * i;
		}
		return result;
	}

}
