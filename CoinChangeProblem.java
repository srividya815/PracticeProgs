
package com.vids.may13;

public class CoinChangeProblem {

	/*
	 * A little girl has 5 ten rupee coins, 10 two rupee coins and 50 five rupee
	 * coins.
	 * 
	 * The needs 50 rupees out of this. Write a program to find all possible
	 * ways the girl can make 50 rupees.
	 */

	public static void main(String[] args) throws java.lang.Exception {
		 countNumWays(); //my code, not as optimised as the one from net
		//countWaysOptimised();
	}

	//Optimised way, got from some one else. My code is below
	private static void countWaysOptimised() {
		int count = 0;
		int numOfLoops = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 5 == 0) {
				int balanceAmt = 50 - (i * 2);
				int z = 0;

				for (int j = 0; j <= balanceAmt;) {

					System.out.println(" No of Rs.2.00 X " + i + " = " + i * 2);

					System.out.println(" No of Rs.5.00 X " + z + " = " + z * 5);

					if (j % 10 == 0) {
						z = z + 2;
					}

					int newBalanceAmt = 50 - ((i * 2) + (z * 5));
					int y = 0;
					for (int k = 0; k <= newBalanceAmt;) {
						numOfLoops++;
						if (k % 10 == 0) {
							y++;
						}
						k = k + 10;
					}
					System.out.println(" No of Rs.10.00 X " + y + " = " + y * 10);
					j = j + 10;
					count++;
					System.out.println("---------------------------");
				}
			}
		}

		System.out.println("Count - optimied" + count + "\t loops-" + numOfLoops);
	}

	private static void countNumWays() {
		int numberOfLoops = 0;
		int count = 0;
		for (int i = 0; i <= 10; i++) { // 10, 2 rupee coins
			//10, 2 rupee coin loop
			//Since the sum is 50, u can pick 0, 5, 10 2 rupees to mke sum as 50.So limit loop
			if (i % 5 == 0) {
				int balanceAmount = 0;
				//cant make 50 by picking odd number of 5 rupee note. So limit to even numbers only
				for (int j = 0; j <= 50; j = j + 2) {// 50, 5 rupee coin
					balanceAmount = 50 - ((i * 2) + (j * 5));
					if (balanceAmount == 0) {
						numberOfLoops++;
						System.out.println("2*" + i + " + 5*" + j + " + 10*0 = 50");
						count++;
						break;
					} else if (balanceAmount < 0) {
						numberOfLoops++;
						break;
					}
					//Pick 10 rupee notes only if balance amt is divisible by 10
					if (balanceAmount % 10 == 0) {
						for (int k = 0; k <= 5; k++) { // 5, 10 rupee coins
							numberOfLoops++;
							int newBalanceAmount = balanceAmount - k * 10; 
							if (newBalanceAmount == 0) {
								//numberOfLoops++;
								System.out.println("2*" + i + " + 5*" + j + " + 10*" + k + "= 50");
								count++;
								break;
							} else if (newBalanceAmount < 0) {
								break;
							}
						}
					}
				}
			}
		}

		System.out.println("Count-" + count + "\t num of loops" + numberOfLoops);
	}
}
