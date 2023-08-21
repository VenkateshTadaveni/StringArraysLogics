package com.numbersLogics;

public class PerfectNumber {

	public static void main(String[] args) {
		int []arr= {9,4,6,11,20,28,234,496};
		
	
		for(int i=0;i<=arr.length-1;i++) {
			int sum=0;
			int originalNum=arr[i];
		for(int j=1;j<=arr[i]/2;j++) {
	
			if(arr[i]%j==0) {
				sum=sum+j;
				
			}
		}
			if(originalNum==sum) {
				System.out.println("This is perfect number "+arr[i]);
			}
		}
			
		}
		
	}
	


