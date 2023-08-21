package com.numbersLogics;

public class PalindromeNumber {

	public static void main(String[] args) {
		int arr[]= {234,876,987,123};
		for(int i=0;i<=arr.length-1;i++) {
			int rem=0,rev=0;
			int originalNumber=arr[i];
			while(arr[i]>0) {
				rem=arr[i]%10;
				rev=rev*10+rem;
				arr[i]=arr[i]/10;
			}
			System.out.println("Reverse number of given number is "+rev+" "+originalNumber);
			
		}
		
	}

}
