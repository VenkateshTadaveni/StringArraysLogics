package com.numbersLogics;

public class SumOfEachDigit {

	public static void main(String[] args) {
		int arr[]= {123,456,678,9876};
		
		for(int i=0;i<=arr.length-1;i++) {
			int rem=0,sum=0;
			while(arr[i]>0) {
				rem=arr[i]%10;
				sum=sum+rem;
				arr[i]=arr[i]/10;
				
			}
			System.out.println("the sum of Each Element in the digit "+sum);
	
		}
		
	}

}
