package com.lamdaEx.methods;

import java.util.List;
import java.util.Set;
//import java.util.stream.Collector;
import java.util.stream.Collectors;


public class SortingDemo {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 10, 20, 13, 12, 18, 15, 17, 68);
		nums.stream().filter(n -> n % 2 == 0 && n < 70).forEach(s -> System.out.println(s));
		Set<Integer> name = nums.stream().filter(n -> n % 2 != 0).collect(Collectors.toSet());
				System.out.println(name);
				Long names1=name.stream().filter(n->n>=1).count();
				System.out.println(names1);
				
				System.out.println("***************************");
				List<Integer>number=List.of(12,13,24,35,46,57,68,79);
				number.stream()
				.filter(n->n%2==0)
				.map(v-> Math.pow(v, 4))
				.forEach(s->System.out.println(s));
				
		

	}

}
