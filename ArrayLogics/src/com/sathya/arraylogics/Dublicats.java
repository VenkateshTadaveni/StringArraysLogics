package com.sathya.arraylogics;

public class Dublicats {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 4, 8, 2, 7 };
		int temp = 0;
		for (int i = 0; i < a.length-1; i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if (a[i] == a[j]) {
					
					temp = a[i];
				
					
				}
			}
		}
				System.out.println(temp);
			}
		
		//System.out.println(temp);
	
	}



