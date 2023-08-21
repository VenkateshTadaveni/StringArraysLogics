package com.logics;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {

		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			arr[i] = n;

		}

		System.out.println(Arrays.toString(arr));
		int first=0;
		int last=arr.length-1;
		for(int i=0;i<=arr.length-1;i++) {
			
		
		if(arr[i]%2==0) {
			arr[first]=arr[i];
			first++;
		}
		else {
			arr[last]=arr[i];
			last--;
		}
		i++;
			
		}
		System.out.println(Arrays.toString(arr));
		
		

	}

}
