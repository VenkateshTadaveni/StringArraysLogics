package com.drive;

public class LargeAndSmall {

	public static void main(String[] args) {
     int arr[]= {9,3,2,10,7};
     int min=arr.length,max=0;
     for(int i=0;i<=arr.length-1;i++) {
    	 if(max<arr[i]) {
    		 max=arr[i];
    	 }
    	if(min>arr[i]) {
    		min=arr[i];
    	 }
     }
     System.out.println("maximum element "+max);
     System.out.println("minimum element "+min);
     
	}

}
