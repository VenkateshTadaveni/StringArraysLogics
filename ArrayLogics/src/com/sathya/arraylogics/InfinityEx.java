package com.sathya.arraylogics;

public class InfinityEx {

	public static void main(String[] args) {
		String s = "Sathy@123Sath";
		char ch = '@';
		int x = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (ch == s.charAt(i)) {
				x = 1;
				break;
			}
		}
			if (x == 0) {
				System.out.println("this char is not in this--> " + ch);
			}else
				System.out.println("this char is present in this--> " + ch);

		}
	}

