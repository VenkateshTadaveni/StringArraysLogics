package com.numbersLogics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int arr[]= {123,153,345,789};
		int rem=0,count=0;
		int result = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			int originalNum=arr[i];
			
			
			while(arr[i]>0) {
			//	rem=arr[i]%10;
				count++;
				arr[i]=arr[i]/10;
			}
			
			System.out.println(count);
			while(count>0) {
				rem=arr[i]%10;
				result=(result+Math.pow(rem, count));
				arr[i]=arr[i]/10;
			}
			
			
		
		if(result==originalNum) {
			System.out.println("this is armstrong number "+result);
			
		}
		else {
			System.out.println("not an a armstrong "+arr[i]);
		}
		}

	}

}
