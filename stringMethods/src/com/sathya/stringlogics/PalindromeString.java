package com.sathya.stringlogics;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "madam arora teaches malayalam";
		String[] s1 = s.split(" ");

		for (int i = 0; i <= s1.length - 1; i++) {
			String s2 = s1[i];
			String rev = "";
			try {
				for (int j = s2.length(); j >= 0; j++)
					rev = rev + s2.charAt(j);
			} catch (Exception e) {
				for (int j = s2.length() - 1; j >= 0; j--)
					rev = rev + s2.charAt(j);

			}
			if (rev.equals(s2)) {
				System.out.println("this is reversed string--> " + s2);
			} else {
				System.out.println("this is not a palindrome string " + s2);
			}

		}
	}

}
