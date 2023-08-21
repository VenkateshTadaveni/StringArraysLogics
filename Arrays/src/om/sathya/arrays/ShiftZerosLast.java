package om.sathya.arrays;

import java.util.Arrays;

public class ShiftZerosLast {

	public static void main(String[] args) {
int[] a= {1,3,0,2,0,4,0};
 int count=0;
for(int i=0;i<=a.length-1;i++) {
	//for(int j=0;j<=a.length-1;j++) {
		if(a[i]!=0) {
			a[count]=a[i];
			count++;
		}
}
		while(count<=a.length-1) {
			a[count]=0;
			count++;
		}
	
System.out.println(Arrays.toString(a));
	
	
	}
}


