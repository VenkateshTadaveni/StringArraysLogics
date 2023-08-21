package com.logics;

import java.util.Arrays;

public class StackOverFlow {

	public static void main(String[] args) {
int arr[]= {10,2,0,3,0,40,50,0,10};
		for (int i = 0; i <= arr.length - 1; i++) {

	        if (arr[i] == 0 && i > 0) {

	            int temp = arr[i - 1];
	            if (temp != 0) {
	            	arr[i - 1] = 0;
	            	arr[i] = temp;
	                
	                i = -1;

	            }

	        }
	        System.out.println(Arrays.toString(arr));

	    }
	    System.out.println(Arrays.toString(arr));

	}

}
