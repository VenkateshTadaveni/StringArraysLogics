package com.numbersLogics;

public class CodingBat {
	void cut(String str,int n) {
	String res="";
	for(int i=0;i<=str.length()-1;i=i+n) {
		res=res+str.charAt(i);
	}
System.out.println(res);
}

	public static void main(String[] args) {
		CodingBat bat=new CodingBat();
		bat.cut("venkatesh", 2);

	}

}
