package om.sathya.arrays;

import java.util.Arrays;

public class ShiftZerosFirst {

	public static void main(String[] args) {
		
		int[] a= {2,1,0,3,0,4,0,5};
		
		int temp=0;
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
				System.out.println(Arrays.toString(a));
					
		
				
			}
		}
	


