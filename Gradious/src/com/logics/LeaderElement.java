package com.logics;

public class LeaderElement {

	static void leaderCheak(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			boolean isFlag = true;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] <= ar[j]) {

					isFlag = false;
					break;

				}

			}

			if (isFlag == true) {
				System.out.println(ar[i]);
			}

		}

	}

	public static void main(String[] args) {
		int[] ar = { 2, 8, 11, 5, 7, 6, 3 };
		leaderCheak(ar);

	}

}
