package com.sathya.stringExamples;

import java.util.Arrays;

public class AnagramEx {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "lisen";
		if (s1.length() == s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();

			for (int i = 0; i <= ch1.length - 1; i++) {
				for (int j = i + 1; j <= ch1.length - 1; j++) {
					if (ch1[i] >= ch1[j]) {
						char temp = ch1[i];
						ch1[i] = ch1[j];
						ch1[j] = temp;
					}
					if (ch1[i] >= ch2[j]) {
						char temp = ch2[i];
						ch2[i] = ch2[j];
						ch2[j] = temp;
					}
				}
			}

//			boolean anagram = true;
//			for (int i = 0; i <= ch1.length - 1; i++) {
//				if (ch1[i] != ch2[i]) {
//
//					anagram = false;
//					break;
//				}
//
//			}
//			if (anagram) {
//				System.out.println("Both the arrays are equal.. Anagram");
//			}
//
//			else {
//				System.out.println("not an a anagram");
//			}
//		}
//		else {
//			System.out.println(" both the lengths are not equal so not an a anagram");
//
//		}
//
//		// System.out.println(Arrays.toString(ch1));

			for (int i = 0; i <= ch1.length - 1; i++) {
				if (ch1[i] == ch2[i]) {
					System.out.println("both string are anagram");
				}else
					System.out.println("not anagram");
			}
		}
	}else
		System.out.println("not");
		

		}

