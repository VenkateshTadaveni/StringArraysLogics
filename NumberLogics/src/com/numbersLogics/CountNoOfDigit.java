package com.numbersLogics;

public class CountNoOfDigit {

	public static void main(String[] args) {
		int arr[]= {1234,34,89078,7890};
	
		for(int i=0;i<=arr.length-1;i++) {
			int originalNum=arr[i];
			int rem=0,count=0;
			while(arr[i]>0) {
				rem=arr[i]%10;
				count++;
				arr[i]=arr[i]/10;
			}
			System.out.println(originalNum+"  "+"The count of digits in number is "+count);
		}
		

	}

}
