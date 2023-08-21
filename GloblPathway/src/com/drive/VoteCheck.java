package com.drive;

public class VoteCheck {

	public static void main(String[] args) {
		int[] arr= {2,6,-1,3,5,9,10};
		int cur_sum=0;
		int sum=10;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i;j<=arr.length-1;j++) {
				cur_sum+=arr[j];
				
				if(cur_sum==sum) {
					System.out.println("the index of starting "+i+" ending "+j);
				}
			}
		}
	}

}
