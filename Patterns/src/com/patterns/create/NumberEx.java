package com.patterns.create;

public class NumberEx {

	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
		System.out.println("Pattern2....");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("Pattern3...");
		for (int j = 0; j <= 5; j++) {
			for (int i = 5; i > 0; i--) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("Pattern4...");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("Pattern5....");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(j % 2);
			}
			System.out.println();
		}
		System.out.println("Pattern6...");
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(i % 2);
			}
			System.out.println();
		}
		System.out.println("Pattern8...");
		for (int i = 0; i <= 5; i++) {
			char ch = 'A';
			for (int j = 0; j <= 5; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
		System.out.println("Pattern9...");

		for (char i = 'A'; i <= 'E'; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(i);

			}
			System.out.println();
		}
		System.out.println("Pattern10...");

		for (int i = 0; i <= 5; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(j);

			}
			System.out.println();
		}

		System.out.println("********Pattern11...**********");
		for (char i = 'E'; i >= 'A'; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i);
			}
			System.out.println();

		}

		System.out.println("******Pattern12**********");
		for (int i = 0; i <= 5; i++) {
			for (char j = 'E'; j >= 'A'; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("******Pattern13********");

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i % 2 == 0) {
					System.out.print("$");
				} else
					System.out.print("#");

			}
			System.out.println();
		}
		
		System.out.println("*****Pattern14*******");
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				if(j%2==0) {
					System.out.print("$");
				}
				else
					System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println("*********Pattren15*********");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i==0||i==6||j==0||j==6) {
				System.out.print("+");
			}
				else
					System.out.print(" ");
			
		}
			System.out.println();
		}
		
		System.out.println("*******Pattern16***********");
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==4||j==4) {
					System.out.print("+");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("********Pattern17*******");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i==0||i==3||i==6||j==0||j==3||j==6) {
					System.out.print("+");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("*****Pattern18********");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=i;j++) {
				if(i==j) {
					System.out.print("+");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		System.out.println("*********Pattern19**********");
		 
		for(int j=0;j<=6;j++){
			 for(int i=6;i>=0;i--){
				if(j==i) {
					System.out.print("+");
				}
				else
					System.out.print(" ");
			}
			 System.out.println();
		}
		System.out.println("**********Pattern20**********");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i==j||j==6-i) {
					System.out.print("+");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("********Pattern21*********");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i==0||i==6||j==0||j==6||i==j||i==6-j) {
					System.out.print("+");
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		System.out.println("**********Pattern22**************");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(j==3||(i==0&&j<=3)||(i==6&&j>=3)) {
				System.out.print("+");
			}
				else
					System.out.print(" ");
		}
			System.out.println();
		}
		System.out.println("*******Pattern23*****************");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if((j==6&&i<=3)||i==3||(j==0&&i>=3)) {
					System.out.print("+");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("********Pattren24*************");
		for(int i=0;i<=8;i++) {
			for(int j=0;j<=8;j++) {
				if((i==0&&j<=4||j==8&&i<=4)||i==4||j==4||(j==0&&i>=4)||(i==8&&j>=4))
					System.out.print("+");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("**********Pattern25***********");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i==0||j==0||i==6||j==6)
					System.out.print("+");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		System.out.println("**********Pattern26*************");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(j==3||i==6||j==3-i)
					System.out.print("+");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		System.out.println("************Pattern27*****************");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i==0||i==3||i==6||(j==6&&i<=3)||(j==0&&i>=3))
					System.out.print("+");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("***********Pattern28*************");
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i==0||i==3||i==6||j==6)
					System.out.print("+");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("**************Pattern29***********");
		
		for(int i=0;i<=7;i++) {
			for(int j=0;j<=7;j++) {
				if(i==0&&j==4||) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	
	}
		
		
		

	}


