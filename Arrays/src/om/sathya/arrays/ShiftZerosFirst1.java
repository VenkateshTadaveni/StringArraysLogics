package om.sathya.arrays;

import java.util.Arrays;

public class ShiftZerosFirst1 {

	public static void main(String[] args) {
		int[] n = { 1, 4, 0, 3, 0};
		int number = 0, temp = 0;
		for (int i = 0; i <= n.length - 1; i++) {
			for (int j = i + 1; j <= n.length - 1; j++) {

				if (n[i] != 0) {
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
					System.out.println(Arrays.toString(n));
						

				}
			} 
		}
	

	}
}
