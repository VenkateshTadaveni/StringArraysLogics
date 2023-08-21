package Com.sathya.switchcase.examples;

import java.util.Scanner;

public class EvenNoEx {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number..->");
     int n=sc.nextInt();
    int result=n%2;
    switch (result) {
    case 0:System.out.println("this is even number");
    break;
    default:System.out.println("this is odd number");
    }
	}

}
