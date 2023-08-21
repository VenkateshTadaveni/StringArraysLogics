  package com.sathya.arraylogics.arraylogics.bin;

public class SecondLargest {

	public static void SecondLarge(int[] arr) {
		int first = 0,second=0;
		for (int i = 0; i <= arr.length - 1; i++) {
         /* ********** Comment-1************** */
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}
	   /* ********** Comment-2************** */
			else if (arr[i] != first && arr[i] > second) {
				second = arr[i];
			}
		}
		System.out.println("The FirstLargest Element is - " + first);
		System.out.println("The SecondLargest Element is - " + second);
	}
	public static void main(String[] args) {
		int[] arr = { 2, 9, 3, 8, 20, 10, 11, 21 };
		SecondLargest.SecondLarge(arr);
	}
}


//first find the max element and stored as first but if arr[i]>first then the
			// first value updated and
			// previous first value has assigned to second..!




//if arr[i]<first then check the arr[i] value is > to a second value if it is >
			// then store in again second
			// that is second value is updated