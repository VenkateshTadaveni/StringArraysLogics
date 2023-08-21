package com.sathya.arraylogics;

public class StringRemoveDuplicates {

	public static void main(String[] args) {
		String s = "malayalam";
		String result = " ";
		boolean[] isvisited = new boolean[s.length()];
		for (int i = 0; i <= s.length() - 1; i++) {
		 if (isvisited[i] == true)
		 continue;
			int count = 1;

			for (int j = i + 1; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
				 isvisited[j] = true;
					count++;
				
				}
				if (count == 1)

					result = result + s.charAt(i);

			}

			
			System.out.println(s.charAt(i));

		}
		//
		//System.out.print(s.charAt(i));
		// }

	}
}
