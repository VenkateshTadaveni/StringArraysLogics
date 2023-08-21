package com.drive;


public class Vechicle  extends Bike{
	
	Vechicle(){
		super();
		System.out.println("i am from sub class constructor ");
		}
	Vechicle(int a){
//		in every contructor calling the super() constriuctor is imp,licityly called at first
		System.out.println("i am from parametersised constructyo");
	}
	void bikeInfo() {
		System.out.println("Sub class of Bike");
	}
 void  bike() {
	 
	 this.bikeInfo();
	 super.bikeInfo();
	 System.out.println("This is Bike");
	 
 }
	public static void main(String[] args) {
		Vechicle v1 = new Vechicle(12);
		Vechicle v= new Vechicle();
		v.bike();

	}

}
