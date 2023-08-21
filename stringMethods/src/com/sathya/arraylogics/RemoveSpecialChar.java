package com.sathya.arraylogics;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String s = "Sathya@23Years";
		char[] ch = s.toCharArray();
		s = " ";

		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z') {
				s = s + ch[i];
			} else {
				continue;

			}
		}
		System.out.println(s);

	}
}
