package com.cursorex.examples;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListItrCarEx {

	public static void main(String[] args) {
		LinkedList<CarDemo> car=new LinkedList<CarDemo>();
		car.add(new CarDemo("BMW", 2266, 48560000.00));
		car.add(new CarDemo("Audi",0000,34098009.12));
		car.add(new CarDemo("RolceRoyes",5678, 65987000.00));
		
		System.out.println(car);
		ListIterator<CarDemo> itr= car.listIterator();
		itr.add(new CarDemo("Ertiga",4567,789909));
		while(itr.hasNext()) {
			 CarDemo cars=itr.next();
			 System.out.println(cars.name+" "+cars.cprice+"  "+cars.cmodel);
			 
			 if(cars.name.equals("BMW")) {
				 itr.remove();
			 }
			 if(cars.name.equals("Audi")) {
				 
				 itr.set(new CarDemo("shift", 57899, 68998.00));
			 }
			 
			 
			 }
		
		for(CarDemo c:car) {
			System.out.println(c.name+" "+c.cmodel+" "+c.cprice);
			
		}
		
	}

}
