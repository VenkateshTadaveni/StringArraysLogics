package com.drive;

public class SubArraysFinding {

	public static void main(String[] args) {
		int [] arr= {1,2,3,49,6,3,4};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i;j<arr.length-1;j++) {
				for(int k=i;k<=j;k++) 
					System.out.print(arr[k]+" ");
				
			}
		}
		

	}

}
