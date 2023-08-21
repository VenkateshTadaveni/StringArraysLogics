package Com.sathya.switchcase.examples;

import java.util.Scanner;

public class SwitchEX {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
switch(n) {
case 0:System.out.println("this is Zero number");
//break;
case 1: System.out.println("this is one number");
 break;
case 2: System.out.println("this is second number");
break;
case 3: System.out.println("this is third number");
break;
case 4: System.out.println("this is Four number");
break;
default :System.out.println("this is default number");
}

	}

}
