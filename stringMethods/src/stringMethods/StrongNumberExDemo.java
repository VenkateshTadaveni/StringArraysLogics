package stringMethods;

public class StrongNumberExDemo {

	public static void main(String[] args) {
		int[] arr = { 123, 345, 145, 346, 789 };

		for (int j = 0; j <= arr.length - 1; j++) {

			int originalNum = arr[j], sum = 0;
			while (arr[j] > 0) {

				int fact = 1;
				int rem = arr[j] % 10;
				for (int i = 1; i <= rem; i++) {

					fact = fact * i;
				}

				sum = sum + fact;

				arr[j] = arr[j] / 10;

			}

			if (originalNum == sum) {
				System.out.println("this is chotu Strongnumber " + originalNum + "  " + sum);
			} else {
				System.out.println("this is not strong number " + originalNum + "  " + sum);

			}

		}
	}
}
