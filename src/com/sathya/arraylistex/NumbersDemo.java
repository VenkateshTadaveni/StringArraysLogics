package com.sathya.arraylistex;

import java.util.ArrayList;
import java.util.Set;

public class NumbersDemo {

	public static void main(String[] args)
	{
		ArrayList<Integer> num= new ArrayList<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		num.add(70);
		
		
	
		for(int i=0;i<num.size();i++) {
			
			if(num.get(i)%10==0) {
				num.set(i, 0);
				
			}
		}
			System.out.println(num);

			ArrayList<String> Laptop=new ArrayList<String>();

			Laptop.add("dell");
			Laptop.add("lenovo");
			Laptop.add("Macbook");
			Laptop.add("hp");
			Laptop.add("dell");
			Laptop.add("dell");
			
			for(int i=0;i<Laptop.size();i++) {
				if(Laptop.get(i).contains("hp") || Laptop.get(i).contains("dell"))
				{
				Laptop.remove(i);
				i--;
				}
				
				
			}
			
			System.out.println(Laptop);
			ArrayList<String> colors=new ArrayList<String>();
			colors.add("blue");
			colors.add("green");
			colors.add("red");
			colors.add("Yellow");
			colors.add("Orange");
			colors.add("White");
			
			
			for(int i=0;i<colors.size();i++) {
				if(colors.get(i).contains("red")) {
					System.out.println("this is dengerous color....>"+("red"));
				}
					else {
						System.out.println("this is normal color..>"+(colors.get(i)));
					}
					
				}
			}
			
		}

