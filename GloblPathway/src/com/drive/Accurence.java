package com.drive;

public class Accurence {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 3, 4, 3, 2, 3, 1 };

		boolean[] isvisited = new boolean[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 1;
			if (isvisited[i] == true) {
				continue;
			}

			for (int j = i + 1; j <= arr.length - 1; j++) {

				if (arr[i] == arr[j]) {

					count++;
					isvisited[j] = true;

				}

			}

			System.out.println("The Element is " + arr[i] + "  -----> " + count);
		}
	}
}
