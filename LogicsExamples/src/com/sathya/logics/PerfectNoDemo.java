package com.sathya.logics;

public class PerfectNoDemo {

	public static void main(String[] args) {
int [] arr= {1,3,4,6,7,8};
for(int i=0;i<=arr.length-1;i++){
	int sum=0;
	for(int j=1;j<=arr.length-1;j++) {
	
		if(arr[i]%j==0) {
			sum=sum+j;
			
		}
	}

		if(sum==arr[i]) {
			System.out.println("this is perfect number "+sum+"---->"+arr[i]);
		}
		else {
			System.out.println("this is not perfect number "+arr[i]);
		}
	}
}
}
