package com.lamdaEx.methods;

import java.util.Arrays;
import java.util.List;

public class Drinks {

	public static void main(String[] args) {
List<Drink>drink=Arrays.asList(new Drink("maaza",1.5,180),
		new Drink("orange", 1.2, 150),
		new Drink("pulpy", 1.7, 250),
		new Drink("mangojuice",2.0,280),
		new Drink("kf", 0.75, 145));


drink.sort((d1,d2)->d1.quantity.compareTo(d2.quantity));
drink.forEach(d->System.out.println(d.dname+" "+d.quantity+" "+d.dprice));
System.out.println("************************");
drink.stream()
.filter(d->d.dprice>150)
.map(d->{d.dprice=d.dprice+25; return d;})

.sorted((d1,d2)->-d1.dname.compareTo(d2.dname))
.forEach(d->System.out.println(d.dname+" "+d.quantity+" "+d.dprice));



}
}
