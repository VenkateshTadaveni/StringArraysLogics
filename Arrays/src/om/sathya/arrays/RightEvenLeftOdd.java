package om.sathya.arrays;

import java.util.Arrays;

public class RightEvenLeftOdd {

	public static void main(String[] args) {
		int temp;
		int[] n = { 1, 6, 8, 7, 4, 3, 2, 9, 3 };
		int right = 0, left = n.length - 1;
		for (int i = 0; i <= n.length - 1; i++) {
			while (n[right] % 2 == 0) {
				right++;

			}
			while (n[left] % 2 != 0) {

				left--;

			}

			if (right < left) {
				temp = n[right];
				n[right] = n[left];
				n[left] = temp;
				left--;
				right++;

			} 
		}

		System.out.println(Arrays.toString(n));

	}
}
