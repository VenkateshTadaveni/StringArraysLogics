package stringMethods;

import java.util.Arrays;

public class TocharArray {

	public static void main(String[] args) {
		String s3="Sathya";
		char[] ch=s3.toCharArray();
//		System.out.println(s3.toCharArray());
		
		for(int i=0;i<=ch.length-1;i++) {
			System.out.print("["+ch[i]+","+"]");
		}
		
		System.out.println(Arrays.toString(ch));
		
	}
	

}
